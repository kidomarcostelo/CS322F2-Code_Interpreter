using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using CODE_Interpreter;
using CODE_Interpreter.Content;
using System.ComponentModel.DataAnnotations;
using System.Linq.Expressions;
using static System.Runtime.InteropServices.JavaScript.JSType;
public class CodeVisitor : CodeBaseVisitor<object?>
{
    private List<Variable> _variables = new List<Variable>();
    private Dictionary<string, object?> Functions { get; } = new();

    public CodeVisitor()
    {
        Functions["DISPLAY:"] = new Func<object?[], object?>(Display);
    }

    private object? Display(object?[] args)
    {
        foreach (var arg in args)
        {
            Console.Write(arg);
        }
        return null;
    }


    public override object? VisitFunctionCall([NotNull] CodeParser.FunctionCallContext context)
    {
        var name = context.DISPLAY().GetText();
        var args = context.expression().children.Select(Visit).ToArray();

        if (!Functions.ContainsKey(name))
        {
            throw new Exception($"Function {name} is not defined.");
        }

        if (Functions[name] is not Func<object?[], object?> func)
        {
            throw new Exception($"Variable {name} is not a function.");
        }
        return func(args);
    }

    // recognize variable
    public override object VisitDeclaration([NotNull] CodeParser.DeclarationContext context)
    {
        if (context.initialization != null)
        {
            return VisitChildren(context)!;
        }

        return null!;
    }

    public override object VisitInitialization([NotNull] CodeParser.InitializationContext context)
    {
        string dataType = context.DATA_TYPE().GetText();
        IList<CodeParser.AssignmentContext> assignments = context.assignment();

        foreach (CodeParser.AssignmentContext assignment in assignments)
        {
            string identifier = assignment.IDENTIFIER().GetText();
            var expressions = assignment.expression();
            Variable existingVar = null!;

            if (identifier == "INT" || identifier == "FLOAT" || identifier == "BOOL" || identifier == "CHAR" ||
                identifier == "IF" || identifier == "ELSE" || identifier == "LOOP" || identifier == "BEGIN" ||
                identifier == "END" || identifier == "CODE" || identifier == "DISPLAY" || identifier == "SCAN" ||
                identifier == "BEGIN IF")
            {
                throw new Exception($"Temp => Bawal Reserved Word as Identifier");
            }

            foreach (var expression in expressions)
            {
                var value = Visit(expression)!;

                if (_variables.Any(p => p.Identifier == identifier))
                {
                    existingVar = new Variable { DataType = existingVar.DataType, Identifier = existingVar.Identifier, Value = value };
                }
                else
                {
                    existingVar = new Variable { DataType = dataType, Identifier = identifier, Value = value };
                }

                if (existingVar.DataType == "INT")
                {
                    if (value is int)
                    {

                        _variables.Add(existingVar);
                        Console.WriteLine(_variables[0].DataType + "\n" + _variables[0].Identifier + "\n" + _variables[0].Value);
                    }
                    else
                    {
                        throw new Exception($"Error: Value '{value}' cannot be assigned to an INT variable.");
                    }
                }
                else if (existingVar.DataType == "FLOAT")
                {
                    if (value is float)
                    {
                        _variables.Add(existingVar);
                        Console.WriteLine(_variables[0].DataType + "\n" + _variables[0].Identifier + "\n" + _variables[0].Value);
                    }
                    else
                    {
                        throw new Exception($"Error: Value '{value}' cannot be assigned to a FLOAT variable.");
                    }
                }
                else if (existingVar.DataType == "CHAR")
                {
                    if (value is char)
                    {
                        _variables.Add(existingVar);
                        Console.WriteLine(_variables[0].DataType + "\n" + _variables[0].Identifier + "\n" + _variables[0].Value);
                    }
                    else
                    {
                        throw new Exception($"Error: Value '{value}' cannot be assigned to a CHAR variable.");
                    }
                }
                else if (existingVar.DataType == "BOOL")
                {
                    if (value is bool)
                    {
                        _variables.Add(existingVar);
                        Console.WriteLine(_variables[0].DataType + "\n" + _variables[0].Identifier + "\n" + _variables[0].Value);
                    }
                    else
                    {
                        throw new Exception($"Error: Value '{value}' cannot be assigned to a BOOL variable.");
                    }
                }
            }
        }

        return null!;
    }

    //public override object VisitAssignment([NotNull] CodeParser.AssignmentContext context)
    //{
    //    var varName = context.IDENTIFIER().GetText();

    //    var expressions = context.expression();

    //    foreach (var expression in expressions)
    //    {
    //        object value = Visit(expression);

    //        _variables.Add(v => v.Value = value, v.Identifier = .....);
    //    }

    //    return null!;
    //}

    public override object VisitIdentifierExpression(CodeParser.IdentifierExpressionContext context)
    {
        string identifier = context.IDENTIFIER().GetText();

        if (_variables.Any(p => p.Identifier == identifier))
        {
            return _variables.Find(p => p.Identifier == identifier)!;
        }
        else
        {
            throw new Exception(string.Format("Undefined variable '{0}'", identifier));
        }
    }

    //comment lang sa nako dol para mugana concat
    /*public override object VisitConstantExpression([NotNull] CodeParser.ConstantExpressionContext context)
    {
        string valueString = context.GetText();
        object value = null!;

        // Convert value to i'ts type
        if (valueString == "TRUE" || valueString == "FALSE")
        {
            value = bool.Parse(valueString);
        }
        else if (int.TryParse(valueString, out int intValue))
        {
            value = intValue;
        }
        else if (float.TryParse(valueString, out float floatValue))
        {
            value = floatValue;
        }
        else if (valueString.Length == 3 && valueString[0] == '\'' && valueString[2] == '\'')
        {
            value = valueString[1];
        }

        return value;
    }*/

    public override object? VisitConstant(CodeParser.ConstantContext context)
    {
        if (context.INTEGERVAL() is { } i)
            return int.Parse(i.GetText());

        if (context.FLOATVAL() is { } f)
            return float.Parse(f.GetText());

        if (context.STRINGVAL() is { } s)
            return s.GetText()[1..^1];

        if (context.BOOLVAL() is { } b)
            return b.GetText() == "true";

        throw new NotImplementedException();
    }

    public override object? VisitEscapeExpression([NotNull] CodeParser.EscapeExpressionContext context)
    {
        string content = context.GetText().Substring(1, context.GetText().Length - 2);
        return content;
    }


    public override object VisitAdditiveExpression(CodeParser.AdditiveExpressionContext context)
    {
        var left = Visit(context.expression(0));
        var right = Visit(context.expression(1));

        var op = context.addOp().GetText();

        return op switch
        {
            "+" => Add(left, right),
            "-" => Subtract(left, right),
            _ => throw new NotImplementedException()
        };
    }

    public override object VisitMultiplicativeExpression([NotNull] CodeParser.MultiplicativeExpressionContext context)
    {
        var left = Visit(context.expression(0));
        var right = Visit(context.expression(1));

        var op = context.multOp().GetText();

        return op switch
        {
            "*" => Multiply(left, right),
            "/" => Divide(left, right),
            "%" => Modulo(left, right),
            _ => throw new NotImplementedException()
        };
    }

    public override object VisitConcatExpression([NotNull] CodeParser.ConcatExpressionContext context)
    {
        var left = Visit(context.expression(0));
        var right = Visit(context.expression(1));
        return $"{left}{right}";
    }

    public override object VisitNewlineExpression([NotNull] CodeParser.NewlineExpressionContext context)
    {
        return "\n";
    }

    private object? Add (object? left, object? right)
    {
        if (left is int l && right is int r)
            return l + r;
        
        if (left is float lf && right is float rf)
            return lf + rf;
        
        if (left is int lInt && right is float rFloat)
            return lInt + rFloat;
        
        if (left is float lFLoat && right is int rInt)
            return lFLoat + rInt;

        throw new Exception($"Cannot add values of types {left?.GetType()} and {right?.GetType()}.");
    }

    private object? Subtract (object? left, object? right)
    {
        if (left is int l && right is int r)
            return l - r;
        
        if (left is float lf && right is float rf)
            return lf - rf;
        
        if (left is int lInt && right is float rFloat)
            return lInt - rFloat;
        
        if (left is float lFLoat && right is int rInt)
            return lFLoat - rInt;

        throw new Exception($"Cannot add values of types {left?.GetType()} and {right?.GetType()}.");
    }

    private object? Multiply (object? left, object? right)
    {
        if (left is int l && right is int r)
            return l * r;
        
        if (left is float lf && right is float rf)
            return lf * rf;
        
        if (left is int lInt && right is float rFloat)
            return lInt * rFloat;
        
        if (left is float lFLoat && right is int rInt)
            return lFLoat * rInt;

        throw new Exception($"Cannot add values of types {left?.GetType()} and {right?.GetType()}.");
    }

    private object? Divide (object? left, object? right)
    {
        if (left is int l && right is int r)
            return l / r;
        
        if (left is float lf && right is float rf)
            return lf / rf;
        
        if (left is int lInt && right is float rFloat)
            return lInt / rFloat;
        
        if (left is float lFLoat && right is int rInt)
            return lFLoat / rInt;

        throw new Exception($"Cannot add values of types {left?.GetType()} and {right?.GetType()}.");
    }

    private object? Modulo (object? left, object? right)
    {
        if (left is int l && right is int r)
            return l % r;
        
        if (left is float lf && right is float rf)
            return lf % rf;
        
        if (left is int lInt && right is float rFloat)
            return lInt % rFloat;
        
        if (left is float lFLoat && right is int rInt)
            return lFLoat % rInt;

        throw new Exception($"Cannot add values of types {left?.GetType()} and {right?.GetType()}.");
    }
}

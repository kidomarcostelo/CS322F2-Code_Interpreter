using Antlr4.Runtime.Misc;
using CODE_Interpreter;
using CODE_Interpreter.Content;
using static System.Runtime.InteropServices.JavaScript.JSType;
public class CodeVisitor : CodeBaseVisitor<object?>
{
    private List<Variable> _variables = new List<Variable>();
    private Dictionary<string, object?> Variables { get; } = new();
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
        var assignments = context.assignment();

        foreach(var assignment in assignments)
        {
            string variableName = assignment.IDENTIFIER().GetText();
            var expressions = assignment.expression();

            foreach(var expression in expressions) {
                object value = Visit(expression)!;

                Variables.Add(variableName, value!);
            }
        }

    return null!;
    }

    public override object VisitAssignment([NotNull] CodeParser.AssignmentContext context)
    {
        var variableName = context.IDENTIFIER().GetText();
        var expressions = context.expression();
        foreach (var expression in expressions)
        {
            object value = Visit(expression)!;
            Variables[variableName] = value;
        }
        return null;
    }

    public override object VisitIdentifierExpression(CodeParser.IdentifierExpressionContext context)
    {
        string variableName = context.IDENTIFIER().GetText();

        if (Variables.ContainsKey(variableName))
        {
            return Variables[variableName]!;
        }
        else
        {
            throw new Exception(string.Format("Undefined variable '{0}'", variableName));
        }
    }

    public override object VisitConstantExpression([NotNull] CodeParser.ConstantExpressionContext context)
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
    }

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

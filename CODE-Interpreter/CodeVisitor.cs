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
        //Functions["DISPLAY:"] = new Func<object?[], object?>(Display);
    }

    //private object? Display(object?[] args)
    //{
    //    foreach (var arg in args)
    //    {
    //        var displayObj = isVariable(arg);

    //        if (displayObj is bool b)
    //             displayObj = b.ToString().ToUpper();
            
    //        Console.Write(displayObj);
    //    }
    //    return args;
    //}

    //public override object? VisitFunctionCall([NotNull] CodeParser.FunctionCallContext context)
    //{
    //    var name = context.DISPLAY().GetText();
    //    var args = context.expression().children.Select(Visit).ToArray();

    //    if (!Functions.ContainsKey(name))
    //    {
    //        throw new Exception($"Function {name} is not defined.");
    //    }

    //    if (Functions[name] is not Func<object?[], object?> func)
    //    {
    //        throw new Exception($"Variable {name} is not a function.");
    //    }
    //    return func(args);
    //}

    public override object VisitDisplay([NotNull] CodeParser.DisplayContext context)
    {
        var args = context.expression().children.Select(Visit).ToArray();

        var args = context.expression();

        foreach (var arg in args)
        {
            var displayObj = isVariable(arg);

            if (displayObj is bool b)
                displayObj = b.ToString().ToUpper();

            Console.Write(displayObj);
        }

        return null;
    }

    //public override object VisitDisplay([NotNull] CodeParser.DisplayContext context)
    //{
    //    var exp = Visit(context.expression());
    //    exp = isVariable(exp);

    //    if (exp is bool b)
    //        exp = b.ToString().ToUpper();

    //    Console.Write(exp + " ");
    //    return new object();
    //}

    public override object? VisitScan([NotNull] CodeParser.ScanContext context)
    {
        IList<ITerminalNode> identifiers = context.IDENTIFIER(); //kwaon ra niya ang identifier
        List<string> varNames = new List<string>();

        // Loop through each identifier and create a variable object for it
        foreach (var identifier in identifiers)
        {
            string varName = identifier.GetText();

            // Check if variable is already defined para pwede sya ma scan
            if (!_variables.Any(v => v.Identifier == varName))
            {
                throw new Exception($"Error: Variable '{varName}' is not defined.");
            }

            varNames.Add(varName);

            // Create a new Variable object with default values and add it to the list
            Variable variable = new Variable { Identifier = varName, DataType = "UNKNOWN", Value = null };
            _variables.Add(variable);
        }

        // Ask user for input
        Console.WriteLine($"Enter value for {string.Join(", ", varNames)}: ");
        string inputLine = Console.ReadLine();
        string[] inputValues = inputLine.Split(new char[] { ',' }, StringSplitOptions.RemoveEmptyEntries);

        // Loop through each input value and validate it based on the variable's data type,
        // then parse and assign it to the corresponding var
        for (int i = 0; i < identifiers.Count; i++)
        {
            Variable variable = _variables.First(v => v.Identifier == identifiers[i].GetText());
            string inputValue = inputValues[i].Trim();

            // Validate the value inputted by the user based on the variable's data type
            switch (variable.DataType)
            {
                case "INT":
                    if (!int.TryParse(inputValue, out int intValue))
                    {
                        throw new Exception($"Error: Invalid value '{inputValue}' for INT variable '{variable.Identifier}'.");
                    }
                    variable.Value = intValue;
                    break;
                case "FLOAT":
                    if (!float.TryParse(inputValue, out float floatValue))
                    {
                        throw new Exception($"Error: Invalid value '{inputValue}' for FLOAT variable '{variable.Identifier}'.");
                    }
                    break;
                case "BOOL":
                    if (!bool.TryParse(inputValue, out bool boolValue))
                    {
                        throw new Exception($"Error: Invalid value '{inputValue}' for BOOL variable '{variable.Identifier}'.");
                    }
                    break;
                case "CHAR":
                    if (inputValue.Length != 1 || char.IsWhiteSpace(inputValue[0]))
                    {
                        throw new Exception($"Error: Invalid value '{inputValue}' for CHAR variable '{variable.Identifier}'.");
                    }
                    variable.Value = inputValue[0];
                    break;
                default:
                    variable.Value = inputValue;
                    break;
            }

            // Parse and assign input value to variable based on its data type
            if (variable.DataType == "INT")
            {
                variable.Value = int.Parse(inputValue);
            }
            else if (variable.DataType == "FLOAT")
            {
                variable.Value = float.Parse(inputValue);
            }
            else if (variable.DataType == "BOOL")
            {
                variable.Value = bool.Parse(inputValue);
            }
            else if (variable.DataType == "CHAR")
            {
                variable.Value = char.Parse(inputValue);
            }
            else
            {
                variable.Value = inputValue;
            }
        }

        return null!;
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

    public override object? VisitInitialization([NotNull] CodeParser.InitializationContext context)
    {
        string dataType = context.DATA_TYPE().GetText();
        IList<CodeParser.AssignmentContext> assignments = context.assignment();

        foreach (CodeParser.AssignmentContext assignment in assignments)
        {
            string identifier = assignment.IDENTIFIER().GetText();
            var expressions = assignment.expression();
            Variable existingVar = new();

            if (identifier == "INT" || identifier == "FLOAT" || identifier == "BOOL" || identifier == "CHAR" ||
                identifier == "IF" || identifier == "ELSE" || identifier == "LOOP" || identifier == "BEGIN" ||
                identifier == "END" || identifier == "CODE" || identifier == "DISPLAY" || identifier == "SCAN" ||
                identifier == "BEGIN IF")
            {
                throw new Exception($"Error: '{identifier}' is a Reserved Word and cannot be used as Variable Name.");
            }

            if (expressions.Count() == 0)
            {
                if (_variables.Any(p => p.Identifier == identifier))
                {
                    throw new Exception($"Error: Variable Name '{identifier}' has been already initialized.");
                }
                existingVar = new Variable { DataType = dataType, Identifier = identifier };
                _variables.Add(existingVar);
                continue;
            }

            foreach (var expression in expressions)
            {
                var value = Visit(expression)!;

                if (_variables.Any(p => p.Identifier == identifier))
                {
                    throw new Exception($"Error: Variable Name '{identifier}' has been already initialized.");
                }

                if (dataType == "INT")
                {
                    if (!(value is int))
                    {
                        throw new Exception($"Error: Value '{value}' cannot be assigned to an INT variable.");
                    }
                }
                else if (dataType == "FLOAT")
                {
                    if (!(value is float))
                    {
                        throw new Exception($"Error: Value '{value}' cannot be assigned to a FLOAT variable.");
                    }
                }
                else if (dataType == "CHAR")
                {
                    if (!(value is char))
                    {
                        throw new Exception($"Error: Value '{value}' cannot be assigned to a CHAR variable.");
                    }
                }
                else if (dataType == "BOOL")
                {
                    if (!(value is bool))
                    {
                        throw new Exception($"Error: Value '{value}' cannot be assigned to a BOOL variable.");

                    }

                    value = value.ToString()!.ToUpper();
                }


                existingVar = new Variable { DataType = dataType, Identifier = identifier, Value = value };
                _variables.Add(existingVar);
                //Console.WriteLine(_variables[0].DataType + "\n" + _variables[0].Identifier + "\n" + _variables[0].Value);
            }
        }
        return null!;
    }

    public override object? VisitAssignment([NotNull] CodeParser.AssignmentContext context)
    {
        //var varName = context.IDENTIFIER().GetText();

        //var expressions = context.expression();

        //foreach (var expression in expressions)
        //{
        //    object value = Visit(expression);

        //    _variables.Add(v => v.Value = value, v.Identifier = .....);
        //}

        //return null!;
        var variableName = context.IDENTIFIER().GetText();
        var expressions = context.expression();

        int index = _variables.FindIndex(v => v.Identifier == variableName);

        if (index < 0)
        {
            throw new Exception($"Variable '{variableName}' not found.");
        }

        foreach (var expression in expressions)
        {
            object value = Visit(expression)!;
            _variables[index].Value = value;
            Console.Write(_variables[index].Value);
        }
        return null;
    }

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

    public override object VisitExecutable([NotNull] CodeParser.ExecutableContext context)
    {
        var identifier = context.IDENTIFIER().GetText();

        var variable = _variables.Find(p => p.Identifier == identifier);

        if (variable == null)
        {
            throw new Exception($"Variable {identifier} is undefined");
        }

        var value = Visit(context.expression());
        variable.Value = value;

        return value;
    }
    public override object VisitConstantExpression([NotNull] CodeParser.ConstantExpressionContext context)
    {
        if (context.constant().INTEGERVAL() is { } i)
            return int.Parse(i.GetText());

        else if (context.constant().FLOATVAL() is { } f)
            return float.Parse(f.GetText());

        else if (context.constant().CHARVAL() is { } g)
            return g.GetText()[1];

        else if (context.constant().BOOLVAL() is { } b)
            return b.GetText().Equals("\"TRUE\"");

        else if (context.constant().STRINGVAL() is { } s)
            return s.GetText()[1..^1];

        throw new NotImplementedException();
    }
    public override object VisitEqualsExpression([NotNull] CodeParser.EqualsExpressionContext context)
    {
        var variableName = context.IDENTIFIER().GetText();

        var existingVar = _variables.Find(p => p.Identifier == variableName)!;

        if (existingVar == null)
        {
            throw new Exception($"Variable {variableName} is undefined");
        }
        var value = Visit(context.expression())!;
        existingVar.Value = value;

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
    public override object VisitParethesizedExpression([NotNull] CodeParser.ParethesizedExpressionContext context)
    {
        return Visit(context.expression());
    }

    public override object? VisitEscapeExpression([NotNull] CodeParser.EscapeExpressionContext context)
    {
        string content = context.GetText().Substring(1, context.GetText().Length - 2);
        return content;
    }

    public override object VisitAdditiveExpression(CodeParser.AdditiveExpressionContext context)
    {
        object left = Visit(context.expression(0));
        object right = Visit(context.expression(1));

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

        left = isVariable(left);
        right = isVariable(right);

        return $"{left}{right}";
    }

    public override object VisitNewlineExpression([NotNull] CodeParser.NewlineExpressionContext context)
    {
        return "\n";
    }

    private object? Add (object? left, object? right)
    {
        left = isVariable(left);
        right = isVariable(right);

        if (left is int l && right is int r)
            return l + r;
        
        if (left is float lf && right is float rf)
            return lf + rf;

        //if (left is int lInt && right is float rfloat)
        //    return lInt + rfloat;
        
        //if (left is float lFloat && right is int rInt)
        //    return lFloat + rInt;

        throw new Exception($"Cannot add values of types {left?.GetType()} and {right?.GetType()}.");
    }

    private object? Subtract (object? left, object? right)
    {
        left = isVariable(left);
        right = isVariable(right);

        if (left is int l && right is int r)
            return l - r;
        
        if (left is float lf && right is float rf)
            return lf - rf;

        //if (left is int lInt && right is float rfloat)
        //    return lInt - rfloat;
        
        //if (left is float lFloat && right is int rInt)
        //    return lFloat - rInt;

        throw new Exception($"Cannot add values of types {left?.GetType()} and {right?.GetType()}.");
    }

    private object? Multiply (object? left, object? right)
    {
        left = isVariable(left);
        right = isVariable(right);

        if (left is int l && right is int r)
            return l * r;
        
        if (left is float lf && right is float rf)
            return lf * rf;

        //if (left is int lInt && right is float rfloat)
        //    return lInt * rfloat;
        
        //if (left is float lFloat && right is int rInt)
        //    return lFloat * rInt;

        throw new Exception($"Cannot add values of types {left?.GetType()} and {right?.GetType()}.");
    }

    private object? Divide (object? left, object? right)
    {
        left = isVariable(left);
        right = isVariable(right);

        if (left is int l && right is int r)
            return l / r;
        
        if (left is float lf && right is float rf)
            return lf / rf;

        //if (left is int lInt && right is float rfloat)
        //    return lInt / rfloat;
        
        //if (left is float lFloat && right is int rInt)
        //    return lFloat / rInt;

        throw new Exception($"Cannot add values of types {left?.GetType()} and {right?.GetType()}.");
    }

    private object? Modulo (object? left, object? right)
    {
        left = isVariable(left);
        right = isVariable(right);

        if (left is int l && right is int r)
            return l % r;
        
        if (left is float lf && right is float rf)
            return lf % rf;

        //if (left is int lInt && right is float rfloat)
        //    return lInt % rfloat;
        
        //if (left is float lFloat && right is int rInt)
        //    return lFloat % rInt;

        throw new Exception($"Cannot add values of types {left?.GetType()} and {right?.GetType()}.");
    }

    private object? isVariable(object? obj)
    {
        if (obj is Variable var)
        {
            if (!(_variables.Any(p => p.Identifier == var.Identifier)))
                throw new Exception($"Undefined varible {var}");
            obj = var.Value;
        }
        return obj;
    }
}

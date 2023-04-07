using Antlr4.Runtime.Misc;
using CODE_Interpreter.Content;
using static System.Runtime.InteropServices.JavaScript.JSType;

namespace CODE_Interpreter;

public class CodeVisitor : CodeBaseVisitor<object?>
{
    private Dictionary<string, object?> Variables { get; } = new();

    private Dictionary<string, object?> Functions { get; } = new();

    private Dictionary<string, object> variables = new Dictionary<string, object>(); // temporary storage

    public CodeVisitor()
    {
        Functions["DISPLAY:"] = new Func<object?[], object?>(Display);
    }

    private object? Display(object?[] args)
    {
        foreach (var arg in args)
        {
            Console.WriteLine(arg);
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

    public override object VisitProgram([NotNull] CodeParser.ProgramContext context)
    {
        return null;
    }

    // recognize variable
    public override object VisitDeclaration(CodeParser.DeclarationContext context)
    {
        return VisitChildren(context)!;
    }

    public override object VisitInitialization(CodeParser.InitializationContext context)
    {
        string dataType = context.DATA_TYPE().GetText();
        var assignments = context.assignment();

        foreach(var assignment in assignments)
        {
            string variableName = assignment.IDENTIFIER().GetText();
            var expressions = assignment.expression();

            foreach(var expression in expressions) {
                object value = Visit(expression)!;

                variables.Add(variableName, value!);
            }
        }

    return null!;
    }

    public override object VisitAssignment([NotNull] CodeParser.AssignmentContext context)
    {
        var varName = context.IDENTIFIER().GetText();

        var value = Visit(context.expression()[0]); // temporary fix

        Variables[varName] = value;

        return null;
    }
}

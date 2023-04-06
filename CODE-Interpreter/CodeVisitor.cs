using Antlr4.Runtime.Misc;
using CODE_Interpreter.Content;

namespace CODE_Interpreter;

public class CodeVisitor : CodeBaseVisitor<object?>
{
    private Dictionary<string, object?> Variables { get; } = new();
    
    private Dictionary<string, object> variables = new Dictionary<string, object>(); // temporary storage

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

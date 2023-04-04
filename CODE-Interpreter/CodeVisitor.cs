using Antlr4.Runtime.Misc;
using CODE_Interpreter.Content;

namespace CODE_Interpreter;

public class CodeVisitor : CodeBaseVisitor<object?>
{
    private Dictionary<string, object?> Variables { get; } = new();

    public override object VisitProgram([NotNull] CodeParser.ProgramContext context)
    {
        return null;
    }

    public override object VisitAssignment([NotNull] CodeParser.AssignmentContext context)
    {
        var varName = context.IDENTIFIER().GetText();

        var value = Visit(context.expression());

        Variables[varName] = value;

        return null;
    }

    
}

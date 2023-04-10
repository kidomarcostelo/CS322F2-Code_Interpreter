using Antlr4.Runtime;

internal class SyntaxErrorEvaluator : BaseErrorListener
{
    public override void SyntaxError(IRecognizer recognizer, IToken offendingSymbol, int line, int charPositionInLine, string msg, RecognitionException e)
    {
        Console.WriteLine($"SYNTAX ERROR: {msg} AT LINE {line} WITH POSITION {charPositionInLine}");
        Environment.Exit(400);
    }
}
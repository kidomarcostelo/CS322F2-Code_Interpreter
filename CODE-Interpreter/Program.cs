namespace CODE_Interpreter;
using Antlr4.Runtime;
using CODE_Interpreter.Content;

static class Program
{
    /// <summary>
    ///  The main entry point for the application.
    /// </summary>
    [STAThread]
    static void Main()
    {
        // To customize application configuration such as set high DPI settings or default font,
        // see https://aka.ms/applicationconfiguration.
        // ApplicationConfiguration.Initialize();
        // Application.Run(new Form1());


        var filename = "Content\\input.txt";

        var code = File.ReadAllText(filename);
        Console.WriteLine(code);

        var inputStream = new AntlrInputStream(code);
        var codeLexer = new CodeLexer(inputStream);
        var commonTokenStream = new CommonTokenStream(codeLexer);
        var codeParser = new CodeParser(commonTokenStream);

        var codeContext = codeParser.program();
        var visitor = new CodeVisitor();

        visitor.Visit(codeContext);
    }    
}
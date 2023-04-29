using Antlr4;
using Antlr4.Runtime;
using CODE_Interpreter.Content;
using static System.Net.Mime.MediaTypeNames;
using CommonTokenStream = Antlr4.Runtime.CommonTokenStream;


var baseDirectory = Directory.GetParent(Directory.GetCurrentDirectory())?.Parent?.Parent?.FullName;
var fileName = $@"{baseDirectory}\Content\input.txt";

var fileContents = File.ReadAllText(fileName);

var inputStream = new AntlrInputStream(fileContents);
try
{
    var codeLexer = new CodeLexer(inputStream);
    var codeTokenStream = new CommonTokenStream(codeLexer);
    var codeParser = new CodeParser(codeTokenStream);
    codeParser.RemoveErrorListeners();
    codeParser.AddErrorListener(new SyntaxErrorEvaluator());
    var codeContext = codeParser.program();
    var visitor = new CodeVisitor();
    visitor.Visit(codeContext);
    //Console.WriteLine("In Console");

}catch(Exception e)
{
    Console.WriteLine(e);
}

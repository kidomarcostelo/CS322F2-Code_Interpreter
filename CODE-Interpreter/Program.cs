using Antlr4;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using CODE_Interpreter;
using CODE_Interpreter.Content;
using static System.Net.Mime.MediaTypeNames;
using CommonTokenStream = Antlr4.Runtime.CommonTokenStream;

var fileName = "Content\\input.txt";

var fileContents = File.ReadAllText(fileName);


var inputStream = new AntlrInputStream(fileContents);

var codeLexer = new CodeLexer(inputStream);
var codeTokenStream = new CommonTokenStream(codeLexer);
var codeParser = new CodeParser(codeTokenStream);
//codeParser.RemoveErrorListeners();
//codeParser.AddErrorListener(new SyntaxErrorEvaluator());
var codeContext = codeParser.program();
var visitor = new CodeVisitor();
visitor.Visit(codeContext);
//Console.WriteLine("In Console");

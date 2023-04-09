using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CODE_Interpreter
{
    internal class Variable
    {
        public string? DataType { get; set; }
        public string? Identifier { get; set; }
        public object? Value { get; set; }

        public Variable(string datatype, string identifier, object value)
        {     
            DataType = datatype;
            Identifier = identifier;
            Value = value;
        }
    }
}

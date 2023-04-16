namespace CODE_Interpreter;

public partial class Form1 : Form
{
    public Form1()
    {
        InitializeComponent();
    }

     private void button1_Click(object sender, System.EventArgs e)
    {
        for(int i = 0; i < 10; i++)
        {
            Console.WriteLine(i);
            textBox2.Text = textBox2.Text + " " + i;
        }
    }
}

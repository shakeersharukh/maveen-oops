import java.io.*;

abstract class Operation
{
    abstract void op();
}

class Add extends Operation
{
    private int a,b;  
    public void op() 
    {
        System.out.println("Addition of two num is"+(a+b));
    }
}

class Sub extends Operation
{ 
    private int a,b;
    public void op() 
    {
        System.out.println("Differance of two num is"+(a-b));
    }
}

class Mul extends Operation
{
    private int a,b;
    public void op()
    {   
	System.out.println("Product of two num is"+(a*b)); 
    }
}

class Div extends Operation
{
    private int a,b;   
    public void op()    
    {
        System.out.println("Division of two num is"+(a/b));
    }
}
class ArithmeticTest
{
    public static void main(String args[])  
    {
        Scanner sc=new Scanner(System.in);
        Shape s;
        System.out.println("Enter choice 1-Addition 2-Subtraction 3-Multiplication 4-Division");
        int ch=sc.nextInt(); 
        System.out.println("Enter number");
        int a=sc.nextInt();
        System.out.println("Enter another number"); 
        int b=sc.nextInt(); 
        if(ch==1)  
             s=new Add(); 
        else if(ch==2)
             s=new Sub();
        else if(ch==3)
             s=new Mul();
        else if(ch==4)
             s=new Div();
        s.op();        
    }
}

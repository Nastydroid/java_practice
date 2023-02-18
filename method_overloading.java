class Calculator 
{
    public int add(int a, int b)
    {
        return a + b;
    }

    public int add (int a, int b, int c)
    {
        return a + b + c;
    }
}

public class method_overloading {

    public static void main (String args[])
    {
        Calculator model2 = new Calculator();
        int result = model2.add(5, 10, 100);

        System.out.println(result);

    }
    
}

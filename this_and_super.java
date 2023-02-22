//Every class in java extends the Object class without you calling it

//Here is a multilevel inheritance code.

class A  //a super class that extends to object
{

    public A()
    {
        super();
        System.out.println("in A");
    }
    public A(int a)
    {
        super();
        System.out.println("int A");
    }

}

class B extends A //A is the super class of B

{
    public B()
    {
          super(); //the super is called first
        System.out. println("in B");
    }

    public B(int b)
    {
        //super(b);       //super will call the constructor of a super class
        this();           //this will execute the constructor of the same class
        System.out.println("int B");
    }

}



public class this_and_super {

    public static void main(String[] args)
    {
        B obj = new B(8);

    }
    
}

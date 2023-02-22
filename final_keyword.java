//final works with - variable, method, class. you cannot change the value.
//it can be used to stop class inheritance, method overriding,to make variable constant 

final class A{

    public final void show()
    {

        System.out.println("can't be override");
    }

}

class B extends A 
{
    public void show()
    {
        System.out.println("in B");
    }
}


public class final_keyword {

    public static void main (String args[])
    {

        B obj = new B();

        obj.show();

        final int age = 45;
        age = 4;

    }
    
}

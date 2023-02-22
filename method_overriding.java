class A 
{
    public void show()
        {

         System.out.println("show in A");

        }
    
}


class B extends A{

    public void show() // this will override the method in A since we created the object in B
    {
        System.out.println("show in B");
    }

}




public class method_overriding {

    public static void main (String args[])
    {

        B obj = new B();
        obj.show();

    }
    
}

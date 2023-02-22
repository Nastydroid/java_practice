class A
{
    public void show()
    {
        System.out.println("in A show");
    }

}


class B extends A
{
    public void show2()
    {
        System.out.println("in B show");
    }
}




public class casting {

    public static void main(String args[])
    {
        A obj = new B();  //up casting
        obj.show();

        B obj1 = (B) obj; //down casting
        obj1.show2();
    }
    
}

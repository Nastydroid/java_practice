class A 
{
    public void showTheClassThatBelongsHere()
    {
        System.out.println("IN A SHOW");
    }
}

class B extends A{
    @Override //this is an annotation to pass more messages to the compiler
    public void showTheClassThatBelongsHere()
    {
        System.out.println("IN B SHOW");
    }
}




public class annotation {

    public static void main(String a[])
    {
        B obj = new B();

        obj.showTheClassThatBelongsHere();

        

    }
    
}

/*class - class -> extends
 interface - interface -> extends
 class - interface -> implements
*/
interface A  // this is a way to describe an abstract method
{
    int age = 54;  //variables in interface are final and static
    String name ="jamjam";

    void show(); //by defualt the "public abstract" is at the beginning
    void config();
}

interface next
{
    void eat();
}

interface previous extends next
{
    void bed();
}

class B implements A,previous  // for interface we use "implement" not "extends"
                        //if you don't implement all the methods it becomes an abstract class too.
                        //you can implement multiple interface unlike class that only extends one at a time
{
    public void show()
    {
        System.out.println("in show");
    }

    public  void config()
    {
            System.out.println("in config");
    }

    public void eat()
    {
        System.out.println("eating....");
    }

    public void bed()
    {
        System.out.println("sleeping....");
    }
}
public class interfaces {

    public static void main(String args[])
    {

        A obj = new B();
        previous obj1 = new B();

        obj.config();
        obj.show();
        obj1.eat();
        obj1.bed();


        System.out.println(A.name + " : " + B.age);
    
}

}

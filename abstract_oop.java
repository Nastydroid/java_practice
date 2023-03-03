 abstract class Car //an abstract method must have an abstract class
{

    public abstract void fly();
    public abstract void drive(); //we are declaring a mwthod with abstract
    

    public void playMusic()
    {
        System.out.println("playing music");
    }
}

abstract class WagonR extends Car
{
    public void drive()
    {
        System.out.println("is driving...");
    }
}

class UpdatedwagonR extends WagonR  //concrete class , you can create object of a concrete class not abstract class
{

    public void fly() {
        System.out.println("flying...");
        
    }
    
}


public class abstract_oop {

    public static void main(String args[])
    {

        Car obj = new UpdatedwagonR(); //you can't create an object of abstract class
        obj.drive();
        obj.playMusic();
        obj.fly();


            
        
        
    }

    
}

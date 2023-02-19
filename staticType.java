//understanding Static Type

class Mobile {
   static String name; //the static variables means that the  value of the variable will be shared by all the object i.e a chnage to one eqauls a change to all
    String brand;  //these are instance variables
    int price;

    public Mobile() //the constructor block will run by the number of objects
    {
        brand ="";
        price = 500;
        System.out.println("I am a constructor block");

    }

    static // the static block only run ones
    {
        System.out.println("I am a static block");
    }

    public  void show()
    // any variable here is local variable
    {
        System.out.println(brand + " :" + price + " : " + name);

    }

    public static void show1(Mobile obj) //static method

    {
        System.out.println(obj.brand + " :" + obj.price + " : " + name);


    }
}


public class staticType {

    public static void main (String args[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand ="Apple";
        Mobile.name = "smartphone"; // static variables should be called with class name not object
        obj1.price = 1500;

        Mobile obj2 = new Mobile();
        obj2.brand ="Samsung";
        Mobile.name = "smartphone";
        obj2.price = 1700;

        Mobile obj3 = new Mobile();
        obj3.brand ="Nokia";
        Mobile.name = "smartphone";
        obj3.price = 2700;

        //Mobile.name = "phone"; //uncomment to test the static variable.

        obj1.show();
        obj2.show();
        

       Mobile.show1(obj3); //how to call a static method


    }
    
}

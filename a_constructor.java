class Human
{
    private String name;  //it is improper to assgin variables here, it has to be in the constructor
    private int age;


      public Human() { // a defualt style constructor

       age = 12;
        name = "javanian";
    }


    public Human(String name, int age) {  // a parameter constructor
        this.name = name;
        this.age = age;
    }


    public void setName(String name)
    {
      
        this.name = name;
    }

    public void setAge(int age) 
    {
       
        this.age = age;
    }
    

    public String getName()
        {
            return name;
        }

        public int getAge() 
        {
            return age;
        }
    
}

public class a_constructor {

    public static void main (String args[])
    {
        Human obj = new Human();
        Human obj1 = new Human();
        Human obj2 = new Human("sopade",83);
       obj.setAge(20);
       obj.setName("oluwatobi");
        //obj2.setName("sopade");

       System.out.println(obj.getName() + " : " + obj.getAge()); //how to call an encapsulated variable
        System.out.println(obj1.getName() + " : " + obj1.getAge()); //it will print the default values
        System.out.println(obj2.getName() + " : " + obj2.getAge()); // assigned values willbe printed


    }
    
}

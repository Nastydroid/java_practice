//understanding encapsulation

class Human
{
    private String name = " Oluwafemi Sopade";  //instance variables must be private 
    private int age = 12;               // this can only work within its class or method


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

public class encapsulation {

    public static void main (String args[])
    {
        Human obj = new Human();
        obj.setAge(20);
        obj.setName("oluwatobi");

        System.out.println(obj.getName() + " : " + obj.getAge()); //how to call an encapsulated variable

    }
    
}

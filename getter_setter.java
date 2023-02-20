
class Human
{
    private String name;  //instance variables must be private 
    private int age;


    public String getName()
    {
      
       return name;
    }

    public void setName(String name) //setters
    {
       
        this.name = name;
    }
     public int getAge() //getter
        {
            return age;
        }

       
        public void setAge(int age) 
        {
        this.age = age;
        }
    
}

public class getter_setter {

    public static void main (String args[])
    {
        Human obj = new Human();
        obj.setAge(20);;
        obj.setName("oluwatobi");

        System.out.println(obj.getName() + " : " + obj.getAge());

    }
    
}


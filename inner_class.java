

class First
{
    public void show()
    {
        System.out.println("in show");

    }

      static class Second  //only inner class can be static
        {
            public void config()
            {
                System.out.println("in config");
            }
        }
    

}

public class inner_class {
    
    public static void main(String args[])
    {

        First obj = new First();
        obj.show();

         //First.Second obj2 = obj.new Second(); //creating object when inner class is not static
            //obj2.config();
        First.Second obj1 = new First.Second(); //creating the inner class object when the class  is static
        obj1.config();

    }
}

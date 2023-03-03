 abstract class Test
{
    public void show()
    {
        System.out.println("in show");
    }

    public abstract void config();
}

public class annonymous_class {

    public static void main(String args[])
    {
        Test obj = new Test()
        {
           public void show()  //this will override the method above, it is in an annonymous inner class
          {                   //it can also be used with an abstract class because the annoymous class object will be created not the abstract class
                                //it also work for multiple methods.
                System.out.println("in new show");
            }

            public void config()
            {
                System.out.println("in config");
            }

        };

        obj.show();
        obj.config();
    }
    
}

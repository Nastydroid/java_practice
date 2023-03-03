

enum Status{
    Running,Failed,Pending,Success;
}


public class enum_ex {
    public static void main (String args[])
    {
       
       Status s = Status.Pending;

       //using if else

       if(s == Status.Failed)
       
        System.out.println("Try again");

        else if(s == Status.Pending)
            System.out.println("please wait");
        else if(s == Status.Running)
            System.out.println("In progress");
        else 
            System.out.println("Done");


            //using case

            switch(s){
                case Pending:
                System.out.println("please wait");
                break;

                case Failed:
                System.out.println("try again");
                break;

                case Running:
                    System.out.println("in progress");
                    break;
                default:
                    System.out.println("completed");


            }



       
       
       
       
       
       
        /*int i = 0;
        Status [] s = Status.values();
        
        for(Status ss : s)
        {
            System.out.println(ss + " : " + ss.ordinal() + " : " + i );
            i++;

        }*/
    }
}

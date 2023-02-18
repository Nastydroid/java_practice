public class switch_case { 
    public static void main (String args[])
    {
        int n = 10;

        switch(n){ //once a case is matched the rest will be executed 

            case 1:
                System.out.println("Monday");
                break; //this prevent the rest from executing once one is matched
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default: //if nothing is matching this will be returned
                System.out.println("enter a valid value");
                
        




        }


    }
}

public class do_while {
    public static void main (String args[])

    {
        int i = 5;

        do 
        {
            System.out.println("HI " + i); //this will execute at least once even if the condition is false.
            i++;
        } while (i <= 4);

    }
}

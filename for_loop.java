public class for_loop {
    public static void main (String args[])
    {
        int i;
        int j;

        for(i = 1; i <= 5; i++)
        {
            System.out.println("DAY " + i);

            for(j = 1; j <= 9; j++)
            {
                System.out.println("    " + (j+8) + " - " + (j+9));
            }
        }
    }
    
}

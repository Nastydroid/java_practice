public class more_array {
    
    public static void main (String args[])
    {
        int nums[][] = new int [3][4];

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {

             nums[i][j] =(int) (Math.random() * 10);
             //System.out.println(nums[i][j]);

            }
        }

// printing multidimensional array with nested loop
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)  
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----------");

        //another method to print multidimensional array

        for(int n[] : nums)
        {
            for(int m: n)
            {
                System.out.print(m + " ");

            }

        System.out.println();
        }

    }
}


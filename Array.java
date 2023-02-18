public class Array {
    
    public static void main (String args[])
    {

    int nums[] = {3,5,4,7};
    nums[0] = 1;// changing the value of an element in an Array
    nums[1] = 3;
    nums[2] = 5;

    int i =0;
    while(i <= 3) //looping through an Array
    {
        System.out.println(nums[i]);
        i++;

    }

    System.out.println("-----------------");

    for(int f : nums) // using enhanced loop i.e for each element in nums assign it to f
    {
        System.out.println(f);

    }


    
    }
}

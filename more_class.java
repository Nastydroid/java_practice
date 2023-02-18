class Computer 
{

    int num =5;

    public void playMusic ()
    {

    //System.out.println("Playing music");
    }


    public String get_a_pen(int cost)
    {

    if(cost >= 10)
        return "New pen Allocated";
    else
        return "amount too small for a pen";
    }


}

public class more_class {
public static void main(String args[]) 
{
    Computer obj = new Computer();
    Computer obj1 = new Computer();
    obj.playMusic();
    //String str =obj.get_a_pen(115);
   // System.out.println(str);

   obj.num =23;

    System.out.println(obj1.num);
    System.out.println(obj.num);

}

}


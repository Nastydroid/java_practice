
enum Laptop{
    Macbook(1200),XPS(1500),Thinkpad(1000), Surface(800);

    private int price;

    private Laptop() {

        price = 500;


    }
    private Laptop(int price) {
            this.price = price;
        }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

   

    
}



public class more_enum {
    
    public static void main(String args[])
    {

        //Laptop think =Laptop.Thinkpad;

       // System.out.println(think);

        //think.setPrice(1050);

        //System.out.println(think + ":" + think.getPrice());

        for(Laptop think : Laptop.values() )
        {
            System.out.println(think +" : " + think.getPrice());

        }



    }
}

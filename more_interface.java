interface Computer
{
    void code();
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("Desktop:code compile run faster ");
    }
    public void push()
    {

    }
}


class Laptop extends Desktop
{
    public void code()
    {
        System.out.println("Laptop: code run compile");
    }
    
}

class Developer extends Laptop
{
    public void devapp(Computer dev)
    {
        dev.code();

    }
}


public class more_interface {

    public static void main(String args[])
    {
        Computer desk = new Desktop();
        Computer lap = new Laptop();

        Developer sopade = new Developer();
        Developer boy = new Developer();

        sopade.devapp(desk);
        boy.devapp(lap);

    }
    
}

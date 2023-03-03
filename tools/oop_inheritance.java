package tools;
class Calc {
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }

    public int sub(int n1, int n2)
    {
        return n1 - n2;
    }
}


public class oop_inheritance {

    public static void main (String args[])

    {
    VeryAdvCalc obj = new VeryAdvCalc();
    //Calc obj = new Calc();
    int r1 = obj.add(2,5 );
    int r2 = obj.sub(43, 12);
    int r3 = obj.div(68, 12);
    int r4 = obj.multi(3, 2);
    double r5 =obj.power(4,2);

    System.out.println(r1 + " : " + r2 + " : " + r3 + " : " + r4 + " : " + r5);

    }
    
}

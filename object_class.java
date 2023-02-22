class Laptop
{
    String brand;
    int price;

    @Override
    public String toString() {
        return "Laptop [brand=" + brand + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
}

public class object_class {
    
    public static void main(String args[])
    {
        Laptop obj = new Laptop();
        obj.brand = "macbook pro";
        obj.price = 1300;

        Laptop obj1 = new Laptop();
        obj1.brand = "lenovo yoga";
        obj1.price = 1000;

        System.out.println(obj.toString());

        System.out.println(obj.equals(obj1));

    }
}

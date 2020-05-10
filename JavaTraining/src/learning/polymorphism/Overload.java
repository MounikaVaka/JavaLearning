package learning.polymorphism;

public class Overload {

    public int sum(int x, int y)
    {
        return (x + y);
    }

    // Overloaded sum(). This sum takes three int parameters
    public int sum(int x, int y, int z)
    {
        return (x + y + z);
    }

    // Overloaded sum(). This sum takes two double parameters
    public double sum(double x, double y)
    {
        return (x + y);
    }


    public static void main(String args[])
    {

        Overload ol = new Overload();

        double s = ol.sum(10.02d, 20.30d);

        System.out.println(s);


    }
}

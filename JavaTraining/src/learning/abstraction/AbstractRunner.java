package learning.abstraction;

public class AbstractRunner {

    public static  void main(String[] args){

        Shape s1 = new Circle("Blue", 3);

        Circle circle = new Circle("Pink",5);

        System.out.println(circle.area());

        Rectangle rect = new Rectangle("White", 3,5,6);

        System.out.println(rect.volume());

        /*Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Rectangle("Yellow", 2, 4, 5);


        Circle circle = new Circle("Pink", 3);

        System.out.println(circle.area());
        System.out.println(s2.volume());*/

    }
}

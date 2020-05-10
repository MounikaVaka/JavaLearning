package learning.abstraction;

public class Circle extends Shape {

    double radius;

    public Circle(String color,double radius) {


        super(color); // calling Shape constructor
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    @Override
    double area() {

        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double volume() {
        return 1.33 * Math.PI * Math.pow(radius, 3);
    }
}

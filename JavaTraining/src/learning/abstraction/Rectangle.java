package learning.abstraction;

public class Rectangle extends Shape {

    double length;
    double width;
    double height;

    public Rectangle(String color,double length,double width, double height) {

        super(color); // calling Shape constructor
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
        this.height = height;

    }

    @Override
    double area() {
        return length*width;
    }

    @Override
    double volume() {
        return length*width*height;
    }
}

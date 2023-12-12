package OOPS.abstraction;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (3.142 * this.radius * this.radius);
    }
}

package OOPS.abstraction;

public class AbstractionExample {
    public static void main(String args []) {
        Circle circle = new Circle(5.25);
        Rectangle rectangle = new Rectangle(4.0, 6.5);

        System.out.println("Area of cirle = " + circle.calculateArea());
        System.out.println("Area of reactangle = " + rectangle.calculateArea());
    }
}

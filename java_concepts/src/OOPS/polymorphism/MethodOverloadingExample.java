package OOPS.polymorphism;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloadingExample {
    public static void main(String args[]) {
        Calculator calculator = new Calculator();

        System.out.println("Calculate sum of 2 integers = " + calculator.add(4, 5));
        System.out.println("Calculate sum of 3 integers = " + calculator.add(4, 5, 6));
        System.out.println("Calculate sum of 2 doubles = " + calculator.add(4.56, 5.45));
    }
}

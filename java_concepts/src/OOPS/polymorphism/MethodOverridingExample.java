package OOPS.polymorphism;

class Animal {
    public void makeSound() {
        System.out.println("Animal makes sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks!!!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meowszz..");
    }
}

public class MethodOverridingExample {

    public static void main(String args[]) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}

package OOPS.encapsulation;

public class Main {
    public static void main(String args[]) {

        Person person1 = new Person("Rahul", 25);

        System.out.println(person1.getAge());
        System.out.println(person1.getName());
        person1.displayPersonInfo();

        person1.setAge(30);
        person1.setName("Bravo");

        System.out.println(person1.getAge());
        System.out.println(person1.getName());
        person1.displayPersonInfo();

    }
}

package OOPS.encapsulation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0)
                System.out.println("Age can not be negative");
        else
            this.age = age;
    }

    public void displayPersonInfo() {
        System.out.println(this.name + " is " + this.age + " years old.");
    }
}

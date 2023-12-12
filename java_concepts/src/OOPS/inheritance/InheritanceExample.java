package OOPS.inheritance;

public class InheritanceExample {
    public static void main(String args[]) {
        Employee employee1 = new Employee(1, "Arun kumar", "arun_kumar@gamil.com");
        employee1.work();

        Developer developer1 = new Developer(2, "Alok V", "alok_v@gmail.com", Position.SE1);
        developer1.work();

        Manager manager1 = new Manager(3, "Dave carter", "dave_carter@gmail.com", Position.M1);
        manager1.work();

        Designer designer1 = new Designer(4, "Sagar M", "sagar_m@gmail.com", Position.DES2);
        designer1.work();

    }
}

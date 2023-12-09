package OOPS.inheritance;

public class Employee {
    private int id;
    private String fullName;
    private String email;

    public Employee(int id, String fullName, String email) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        System.out.println("Employee object is constructed.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void work() {
        System.out.println("Employee " + this.getFullName() + " is working.");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}

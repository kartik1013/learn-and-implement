package OOPS.inheritance;

public class Manager extends Employee{

    private Position position;

    public Manager(int id, String fullName, String email, Position position) {
        super(id, fullName, email);
        this.position = position;
        System.out.println("Manager object is constructed");
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "position=" + position +
                '}';
    }

    @Override
    public void work() {
        System.out.println("Manager " + this.getFullName() + " is unblocking the developers.");
    }
}

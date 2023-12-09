package OOPS.inheritance;

public class Developer extends Employee {
    private Position position;

    public Developer(int id, String fullName, String email, Position position) {
        super(id, fullName, email);
        this.position = position;
        System.out.println("Developer object is constructed.");
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "position=" + position +
                '}';
    }

    @Override
    public void work() {
        System.out.println("Developer " + this.getFullName() + " is coding new features and fixing bugs.");
    }
}

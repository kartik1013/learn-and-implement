package OOPS.inheritance;

public class Designer extends Employee{

    private Position position;

    public Designer(int id, String fullName, String email, Position position) {
        super(id, fullName, email);
        this.position = position;
        System.out.println("Designer object is constructed.");
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Designer{" +
                "position=" + position +
                '}';
    }

    @Override
    public void work() {
        System.out.println("Designer " + this.getFullName() + " is working on next feature designs.");
    }
}

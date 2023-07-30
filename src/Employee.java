public class Employee {

    public Employee(Long id, String firstName, String lastName, Enum<Positions> position, String dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.dateOfBirth = dateOfBirth;
    }

    Long id ;
    String firstName;
    String  lastName;
    Enum<Positions> position;
    String dateOfBirth ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Enum<Positions> getPosition() {
        return position;
    }

    public void setPosition(Enum<Positions> position) {
        this.position = position;
    }
}

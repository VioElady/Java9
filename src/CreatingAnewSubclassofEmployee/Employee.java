package CreatingAnewSubclassofEmployee;

public class Employee {
    protected final String firstName;
    protected final String lastName;
    protected final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "firstName = " + firstName + "\n" +
                "lastName = " + lastName + "\n" +
                "socialSecurityNumber = " + socialSecurityNumber + "\n";
    }
}
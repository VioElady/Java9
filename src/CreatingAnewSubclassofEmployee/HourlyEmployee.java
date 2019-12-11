package CreatingAnewSubclassofEmployee;

public class HourlyEmployee extends Employee {
    private double hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage) {
        super(firstName, lastName, socialSecurityNumber);
        setHours(hours);
        setWage(wage);
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if ((hours < 0) || (hours > 168))
            throw new IllegalArgumentException("hours must be 0.00-168.00");

        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0)
            throw new IllegalArgumentException("wage must be positive");
        this.wage = wage;
    }

    public double getEarning(){
        double earningValue = 0;
        int fixHoursWorked = 40;
        if (hours < fixHoursWorked) {
            earningValue = hours * wage;
        }
        if (hours > fixHoursWorked) {
            earningValue = fixHoursWorked * wage + (hours - fixHoursWorked) * (wage * 1.5);
        }
        return earningValue;
    }


    @Override
    public String toString() {
        return super.toString() +
                "hours worked = " + hours + "\n" +
                "wages per hour = " + wage + "\n" +
                firstName + " " + lastName + "’s earnings is " + getEarning();

    }
}
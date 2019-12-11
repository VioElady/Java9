package CommissionEmployee;

public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args)
    {
        BasePlusCommissionEmployee employee =
                new BasePlusCommissionEmployee(
                        "Katy", "Levis", "067-34-2393", 9000, .05, 400);

        System.out.println(
                "CommissionEmployee.CreatingAnewSubclassofEmployee.Employee information obtained by get methods:");
        System.out.println("First name is "+
                employee.getFirstName());
        System.out.println( "Last name is "+
                employee.getLastName());
        System.out.println("Social security number is "+
                employee.getSocialSecurityNumber());
        System.out.println( "Gross sales is "+
                employee.getGrossSales());
        System.out.println( "Commission rate is "+
                employee.getCommissionRate());
        System.out.println("Base salary is "+
                employee.getBaseSalary());
        employee.setBaseSalary(1000);

        System.out.println("Updated employee information obtained by toString" +employee);
    }
}
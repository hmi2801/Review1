package Assignment10;

public class Employee {
    static String companyName = "Infosys";
    private String employeeName;
    private final int employeeId;
    private String employeeDesignation;
    private static int employeeCount = 0;

    Employee(String employeeName, int employeeId, String employeeDesignation) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeDesignation = employeeDesignation;

        employeeCount++;
    }

    void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Comany Name: "+companyName);
            System.out.println("Employee Name: " + employeeName);
            System.out.println("Employee Id : " + employeeId);
            System.out.println("Employee Designation : " + employeeDesignation);

        } else {
            System.out.println("Invalid account object!!");
        }


    }

    static void displayTotalEmployees() {
        System.out.println("Total Number of Employee: " + employeeCount);
    }

    public static void main(String[] args) {
        Employee ob1=new Employee("Manmohan",22,"Software Engineer");
        Employee ob2=new Employee("Kabir",42,"Design Engineer");

        ob2.displayDetails();
        ob1.displayDetails();
        System.out.println();
        displayTotalEmployees();

    }
}
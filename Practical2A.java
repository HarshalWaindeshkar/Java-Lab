abstract class Employee {
    protected String name;
    protected int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

class FTE extends Employee {
    private double salary;

    public FTE(String name, int employeeId, double salary) {
        super(name, employeeId);
        this.salary = salary;
    }

    @Override
    public void displayDetails() {

        super.displayDetails(); // call base class method
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

class PTE extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PTE(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void displayDetails() {

        super.displayDetails();
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Pay: " + (hourlyRate * hoursWorked));
        System.out.println();
    }
}

public class Practical2A {
    public static void main(String[] args) {
        Employee[] employees = {
                new FTE("Mithilesh", 101, 60000),
                new PTE("Nikhil", 102, 500, 20),
                new FTE("Harshal", 103, 80000),
                new PTE("Vedant", 104, 450, 15)
        };

        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}

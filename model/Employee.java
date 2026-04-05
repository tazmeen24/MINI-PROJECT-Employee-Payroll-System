package model;

public abstract class Employee extends Person {
    private String employeeId;
    private String department;
    private double baseSalary;


    public Employee(String name, int age, String email, String phone, String employeeId, String department, double baseSalary) {
        super(name, age, email, phone);
        this.employeeId = employeeId;
        this.department = department;
        this.baseSalary = baseSalary;
    }

    public String getEmployeeId() {
        return employeeId;
    }
    public String getDepartment() {
        return department;
    }
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0) {
            System.out.println("Error: Salary cannot be negative!");
            return;
        }
        this.baseSalary = baseSalary;
    }
    
    public abstract double calculateSalary();

    @Override
    public void displayInfo() {
        System.out.println("ID: "+ employeeId);
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Department: " + department);
        System.out.println("Email: " + getEmail());
    }
}

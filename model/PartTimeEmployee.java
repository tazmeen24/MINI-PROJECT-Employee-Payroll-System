package model;

public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int age, String email, 
        String phone, String employeeId, String department,
        int hoursWorked, double hourlyRate) {
        super(name, age, email, phone, employeeId, department, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        if (hoursWorked < 0) {
            System.out.println("Error: Hours worked cannot be negative!");
            return;
        }
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) {
            System.out.println("Error: Hourly rate cannot be negative!");
            return;
        }
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Part-Time");
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: Rs." + hourlyRate);
        System.out.println("Monthly Pay: Rs." + calculateSalary());
    }
    
}

package model;

public class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(String name, int age, String email, String phone, String employeeId, String department, double baseSalary, double bonus) {
        super(name, age, email, phone, employeeId, department, baseSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if (bonus < 0) {
            System.out.println("Error: Bonus cannot be negative!");
            return;
        }
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Full-Time");
        System.out.println("Bonus: Rs." + bonus);
        System.out.println("Monthly Pay: Rs." + calculateSalary());
    }
    
}

import model.*;
import service.PayrollGenerator;

public class Main {
    public static void main(String[] args) {

        Department engineering = new Department("D101", "Engineering");

        FullTimeEmployee emp1 = new FullTimeEmployee("Mani", 30, 
                            "mani@company.com", "1234567890", "E431",
                        "Engineering", 50000, 5000);

        PartTimeEmployee emp2 = new PartTimeEmployee("Priya", 25, 
                            "priya@company.com", "0980004321", "E432",
                            "Engineering", 30, 175);
        
        PartTimeEmployee emp3 = new PartTimeEmployee("Ravi", 28, 
                            "ravi@company.com", "1112223333", "E433",
                            "Engineering", 25, 150);

        engineering.addEmployee(emp1);
        engineering.addEmployee(emp2);
        engineering.addEmployee(emp3);

        System.out.println("Employee Details:");
        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();

        PayrollGenerator payrollGenerator = new PayrollGenerator();
        System.out.println("\nProcessing Payroll:");
        payrollGenerator.generateDeptPayroll(engineering);
    }
}

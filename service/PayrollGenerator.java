package service;

import model.Department;
import model.Employee;
import java.util.List;

public class PayrollGenerator {
    
    private TaxCalculator taxCalculator;

    public PayrollGenerator() {
        this.taxCalculator = new TaxCalculator();
    }

    public void processEmpPayroll(Employee employee) {
        double grossPay = employee.calculateSalary();
        double tax = taxCalculator.calculateTax(grossPay);
        double pf = taxCalculator.calculatePF(grossPay);
        double netPay = taxCalculator.calculateNetPay(grossPay);

        System.out.println("Payroll Details: "+ employee.getName());
        System.out.println("Gross Pay: Rs" + grossPay);
        System.out.println("Tax: Rs" + tax);
        System.out.println("PF: Rs" + pf);
        System.out.println("Net Pay: Rs" + netPay);
        System.out.println("-----------------------------");
    }

    public void generateDeptPayroll(Department department) {
        List<Employee> employees = department.getEmployees();
        System.out.println("Payroll for Department: " + department.getDeptName());
        
        double totalCost = 0;
        for (Employee e : employees) {
            processEmpPayroll(e);
            totalCost += taxCalculator.calculateNetPay(e.calculateSalary());
        }

        System.out.println("\nTotal Department Cost: Rs" + totalCost);

        
    }
}

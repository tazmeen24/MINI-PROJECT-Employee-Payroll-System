package model;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String deptId;
    private String deptName;
    private List<Employee> employees;

    public Department(String deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
    public String getDeptId() {
        return deptId;
    }
    public String getDeptName() {
        return deptName;
    }

    public void displayDepartmentInfo() {
        System.out.println("Department Name: " + deptName);
        System.out.println("Employees:");
                for (Employee e : employees) {
            System.out.println("- " + e.getName() + " | Pay: $" + e.calculateSalary());
        }
    }
}

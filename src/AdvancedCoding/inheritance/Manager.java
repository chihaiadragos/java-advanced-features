package AdvancedCoding.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{
    private double bonusManager;
    private List<Employee> employees;
    public Manager(String name, double baseSalary, double bonusManager, int yearsOfExperience) {
        super(name, baseSalary,yearsOfExperience);
        this.bonusManager = bonusManager;
        employees = new ArrayList<>();
    }
    public void addEmployee(Employee employee) {
        if (employee.yearsOfExperience >= 1) {
            employees.add(employee);
            System.out.println(employee + " was hired.");
        } else {
            System.out.println("Employee's experience is insufficient for this position. Can not hire " + employee.name);
        }
    }
    public void showSalaryOfEachEmployees() {
        if (employees.isEmpty()){
            System.out.println("This Manager has no employees");
        } else {
            System.out.println("Report of salary for manager's employees:");
            for (Employee employee : employees) {
                System.out.println("->Employee " + employee.name + " has " + employee.calculateSalary() + " salary.");
            }
        }
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonusManager;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Manager{");
        sb.append("bonusManager=").append(bonusManager);
        sb.append(", employees=").append(employees);
        sb.append(", name='").append(name).append('\'');
        sb.append(", baseSalary=").append(baseSalary);
        sb.append(", yearsOfExperience=").append(yearsOfExperience);
        sb.append('}');
        return sb.toString();
    }
}

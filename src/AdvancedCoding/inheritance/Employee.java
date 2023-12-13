package AdvancedCoding.inheritance;

public class Employee {
    protected String name;
    protected double baseSalary;
    protected int yearsOfExperience;

    public Employee(String name, double baseSalary, int yearsOfExperience) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.yearsOfExperience = yearsOfExperience;
    }
    public double calculateSalary() {
        return baseSalary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", baseSalary=").append(baseSalary);
        sb.append(", yearsOfExperience=").append(yearsOfExperience);
        sb.append('}');
        return sb.toString();
    }
}

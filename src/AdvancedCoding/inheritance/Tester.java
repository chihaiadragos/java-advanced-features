package AdvancedCoding.inheritance;

public class Tester extends Employee{

    public Tester(String name, double baseSalary, int numberOfYearsOfExperience) {
        super(name, baseSalary, numberOfYearsOfExperience);
    }
    private double calculateBonus() {
        double bonus= 500;
        if (yearsOfExperience >= 5) {
            bonus = 1000;
        }
        return super.calculateSalary() + bonus;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tester{");
        sb.append("name='").append(name).append('\'');
        sb.append(", baseSalary=").append(baseSalary);
        sb.append(", yearsOfExperience=").append(yearsOfExperience);
        sb.append('}');
        return sb.toString();
    }
}

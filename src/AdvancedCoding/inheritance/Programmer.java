package AdvancedCoding.inheritance;

public class Programmer extends Employee{
    private double bonusOverTime;
    public Programmer(String name, double baseSalary, double bonusOverTime, int yearsOfExperience) {
        super(name, baseSalary, yearsOfExperience);
        this.bonusOverTime = bonusOverTime;
    }

    @Override
    public double calculateSalary() {
        if (bonusOverTime <= 1000){
            return super.calculateSalary() + this.bonusOverTime;
        }
        return super.calculateSalary();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Programmer{");
        sb.append("bonusOverTime=").append(bonusOverTime);
        sb.append(", name='").append(name).append('\'');
        sb.append(", baseSalary=").append(baseSalary);
        sb.append(", yearsOfExperience=").append(yearsOfExperience);
        sb.append('}');
        return sb.toString();
    }
}

package AdvancedCodingIndividualExercises.Exercise7;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {

    private Integer ID;
    private Integer salary;
    private String name;

    public Employee(Integer ID, Integer salary, String name) {
        this.ID = ID;
        this.salary = salary;
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("ID=").append(ID);
        sb.append(", salary=").append(salary);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, 3000, "Dragos"));
        employees.add(new Employee(2, 15000, "Vlad"));
        employees.add(new Employee(3, 40000, "Adi"));

        //find first Employee that is not null and has salary of at least 30000.
        Employee employee = employees.stream()
                        .filter(Objects::nonNull)
                        .filter(e -> e.getSalary() > 30000)
                        .findFirst()
                        .orElseThrow(() -> new RuntimeException("Not Found!"));

        System.out.print("First employee with a salary of at least 30000 is: ");
        System.out.println(employee);
    }
}

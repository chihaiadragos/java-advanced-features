package AdvancedCodingIndividualExercises.Exercise8;

import AdvancedCodingIndividualExercises.Exercise7.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, 3000, "Dragos"));
        employees.add(new Employee(2, 15000, "Vlad"));
        employees.add(new Employee(3, 40000, "Adi"));

        List<Employee> nameSortedEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .toList();

        System.out.println(nameSortedEmployees);
    }
}

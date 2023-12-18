package AdvancedCoding.inheritance;

public class Main {
    public static void main(String[] args) {
        Employee programmer = new Programmer("Ana", 500, 1175.6, 2);
        Programmer programmer2 = new Programmer("Iulian", 500, 1175.6, 10);
        Employee programmer3 = new Programmer("Tudor", 500, 1175.6, 0);
        Employee manager = new Manager("Dorin", 1000, 120.125, 7);
        Manager manager2 = new Manager("Bogdan", 125000, 620.125, 3);
        Manager manager3 = new Manager("Bogdan", 125000, 620.125, 3);
        Employee tester = new Tester("Maria", 1000, 6);

        System.out.println("Programmer has a salary of: " + programmer.calculateSalary());
        System.out.println("Manager has a salary of: " + manager.calculateSalary());
        System.out.println("Tester has a salary of: " + tester.calculateSalary());
        System.out.println();

        manager2.addEmployee(programmer);
        manager2.addEmployee(tester);
        manager2.addEmployee(programmer2);
        manager2.addEmployee(programmer3);

        System.out.println(programmer);
        System.out.println(manager);
        System.out.println(tester);
        System.out.println(manager2);
        System.out.println();

        manager2.showSalaryOfEachEmployees();
        System.out.println();
        manager3.showSalaryOfEachEmployees();

        System.out.println("=========================");
        manager2.getEmployees().stream().filter(employee -> employee.getBaseSalary() > 700).forEach(System.out::println);
        System.out.println("=========================");
        manager2.showSalaryOfEachEmployees();

    }
}

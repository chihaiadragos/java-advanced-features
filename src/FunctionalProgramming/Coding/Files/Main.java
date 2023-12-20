package FunctionalProgramming.Coding.Files;

import AdvancedCoding.inheritance.Employee;
import AdvancedCoding.inheritance.Manager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readEmployeeInfoFromFile();
    }
    public static void writeEmployeeDataOnFile() {
        Scanner scannerEmployeeNumber = new Scanner(System.in);
        Scanner scannerEmployeeInfo = new Scanner(System.in);
        try {
            FileWriter fileWriter = new FileWriter("Employees.txt");
            System.out.println("Number of employees:");
            int employeesNumber = scannerEmployeeNumber.nextInt();
            int i = 1;
            while (i <= employeesNumber) {
                System.out.println("Employee " + i + " info:");
                fileWriter.write(scannerEmployeeInfo.nextLine() + "\n");
                i++;
            }
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            scannerEmployeeInfo.close();
            scannerEmployeeNumber.close();
        }
    }

    public static void readEmployeeInfoFromFile() {
        File file = new File("Employees.txt");
        try {
            Scanner scannerReadFile = new Scanner(file);
            Manager manager = new Manager("Bogdan", 1000.5, 12.75, 14);
            while (scannerReadFile.hasNextLine()) {
                List<String> employeeInfoFromFile = Arrays.stream(scannerReadFile.nextLine().split(", ")).toList();
                Employee employee = new Employee(employeeInfoFromFile.get(0),
                        Double.parseDouble(employeeInfoFromFile.get(1)),
                        Integer.parseInt(employeeInfoFromFile.get(2)));
                manager.addEmployee(employee);
            }
            //putem face asta cu streamuri?
            System.out.println(manager);
            scannerReadFile.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

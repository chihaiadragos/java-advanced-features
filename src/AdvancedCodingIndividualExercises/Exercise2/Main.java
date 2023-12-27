package AdvancedCodingIndividualExercises.Exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the array of integers length: ");
        int arraySize = scanner.nextInt();
        System.out.println("You enter length of -> " + arraySize);
        int[] numbers = new int[arraySize];

        System.out.println("Insert element of array: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            System.out.println("You enter element: " + numbers[i]);
        }
        System.out.print("Your array is: ");
        System.out.println(Arrays.toString(numbers));

        System.out.print("Sorted integer array: ");
        bubbleSort(numbers);

        System.out.println(Arrays.toString(numbers));
    }
    public static void bubbleSort(int[] num) {
        int aux;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    aux = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = aux;
                }
            }
        }
    }
}

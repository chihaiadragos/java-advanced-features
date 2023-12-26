package AdvancedCodingIndividualExercises.Exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] num = scanner.next().toCharArray();
        if (num.length == 1) {
            System.out.println(num);
            return;
        }

        int left = 0;
        int right = num.length - left - 1;
        char aux = '0';
        while (left < right) {
            aux = num[left];
            num[left] = num[right];
            num[right] = aux;
            left++;
            right--;
        }
        System.out.println(num);
    }
}

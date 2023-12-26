package AdvancedCodingIndividualExercises.Exercise1;

import java.util.Scanner;

public class Main2 {
    public static void main( String args[]) {
        int num = 0;
        int reverseNum = 0;
        System.out.println("Input the number to be reversed: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        while (num != 0) {
            reverseNum = reverseNum * 10;
            reverseNum = reverseNum + num % 10;
            num = num / 10;
        }
        System.out.println("The reverse of input number is: " + reverseNum);
    }
}

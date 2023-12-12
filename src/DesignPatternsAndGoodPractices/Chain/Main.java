package DesignPatternsAndGoodPractices.Chain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DispenserAmountChain dispenserAmountChain50 = new DispenserAmountBy50();
        DispenserAmountChain dispenserAmountChain20 = new DispenserAmountBy20();
        DispenserAmountChain dispenserAmountChain10 = new DispenserAmountBy10();

        dispenserAmountChain50.setNextChain(dispenserAmountChain20);
        dispenserAmountChain20.setNextChain(dispenserAmountChain10);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti suma: ");
        int amount = scanner.nextInt();

        if (amount % 10 != 0) {
            System.out.println("Invalid amount");
        } else {
            Currency currency = new Currency(amount);
            dispenserAmountChain50.dispenseAmount(currency);
        }
    }
}

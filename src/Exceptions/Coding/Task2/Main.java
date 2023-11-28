package Exceptions.Coding.Task2;

import ClassTaxonomy.Features.Interfaces.StreamingPlayer;

public class Main {
    public static void main(String[] args) {
        StreamingPlayer streamingPlayer = null;
        if (streamingPlayer != null) {
            streamingPlayer.stopMovie();
        }
        System.out.println("baubau");

        String[] names = {"Alin", "Bogdan"};

        System.out.println();
        try {
            System.out.println("Before");
            System.out.println(names[1]);
            System.out.println("After");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bound");
        }
        System.out.println("After try-catch");

        try {
            simulateException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void simulateException() throws Exception {
        System.out.println("something");
        throw new Exception("something went wrong");
    }

    public void arman(int input) {
        System.out.println("input");
    }
    public static void arman(String input) {
        System.out.println("input");
    }
}

package Exceptions.Features;

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
    }
}

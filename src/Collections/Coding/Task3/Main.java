package Collections.Coding.Task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numbers.add(rand.nextInt(51));
        }
        System.out.println(Arrays.toString(numbers.toArray()));
        System.out.println();

        Set<Integer> uniqueElementsList = new HashSet<>();
        uniqueElementsList.addAll(numbers);
        System.out.println(Arrays.toString(uniqueElementsList.toArray()));
        System.out.println();
        int aux;

        List<Integer> repeatedElements = new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            aux = 0;
            for (Integer num : numbers) {
                if (i == num) {
                    aux++;
                }
                if (aux > 2) {
                    repeatedElements.add(i);
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(repeatedElements.toArray()));
    }
}

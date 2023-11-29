package ConcurrentAndParallelProgramming.Coding.Task1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        // Define the intervals
        int startInterval1 = 1000;
        int endInterval1 = 2000;

        int startInterval2 = 13400;
        int endInterval2 = 17800;

        // Find even numbers in parallel
        List<Integer> evenNumbersParallel = findEvenNumbersParallel(startInterval1, endInterval1, startInterval2, endInterval2);

        // Print the results
        System.out.println("Even numbers in the first interval: " + evenNumbersParallel.subList(0, evenNumbersParallel.size() / 2));
        System.out.println("Even numbers in the second interval: " + evenNumbersParallel.subList(evenNumbersParallel.size() / 2, evenNumbersParallel.size()));
    }

    public static List<Integer> findEvenNumbersParallel(int start1, int end1, int start2, int end2) {
        // Use parallel stream to find even numbers in parallel
        return IntStream.concat(
                IntStream.rangeClosed(start1, end1).parallel().filter(num -> num % 2 == 0),
                IntStream.rangeClosed(start2, end2).parallel().filter(num -> num % 2 == 0)
        ).boxed().collect(Collectors.toList());
    }
}
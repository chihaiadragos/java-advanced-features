package FunctionalProgramming.Coding.Exercise6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(6, 11, 58, 20, 8, 3, 15);
        System.out.println(numbers.stream().map(number -> number % 2 == 0 ? "e" + number : "o" + number).collect(Collectors.joining("; ")));

    }
}

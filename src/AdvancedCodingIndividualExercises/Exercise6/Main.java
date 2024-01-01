package AdvancedCodingIndividualExercises.Exercise6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(getString(list));
    }
    public static String getString(List<Integer> list) {
        return list.stream()
                .map(i -> i % 2 == 0 ? ("e" + i) : ("o" + i))
                .collect(Collectors.joining(", "));
    }
}

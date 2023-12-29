package AdvancedCodingIndividualExercises.Exercise4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("plane", "rocket", "space", "123");
        System.out.println(upperCaseWithStream(stringList));
    }
    public static List<String> upperCaseWithStream(List<String> list) {
        return list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }
}

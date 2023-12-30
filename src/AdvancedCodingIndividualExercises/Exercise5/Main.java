package AdvancedCodingIndividualExercises.Exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> num = Arrays.asList("abc", "Ace", "amperes", "acoustic", "123", "a11", "a<-");
        System.out.println(search(num));
    }

    /**
     *
     * return a list of string that start with the letter 'a' (lover case only) and have exactly 3 letters using streams
     */
    public static List<String> search(List<String> list) {
        return list.stream()
                .filter(s -> s.startsWith("a"))
                .filter(s -> s.length() == 3)
                .collect(Collectors.toList());
    }
}

package AdvancedCodingIndividualExercises.Exercise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = new ArrayList<>();
        System.out.println(average(list1));
        System.out.println(average(list2));
    }
    public static double average(List<Integer> list) {
        OptionalDouble optionalDouble = list.stream().mapToInt(i -> i).average();
        if (optionalDouble.isPresent()) {
            return optionalDouble.getAsDouble();
        }
        return 0.;
    }
}

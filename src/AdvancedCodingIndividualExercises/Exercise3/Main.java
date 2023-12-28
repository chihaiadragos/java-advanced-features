package AdvancedCodingIndividualExercises.Exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        System.out.println(average(list));
    }
    public static double average(List<Integer> list) {
        OptionalDouble optionalDouble = list.stream().mapToInt(i -> i).average();
        if (optionalDouble.isPresent()) {
            return optionalDouble.getAsDouble();
        }
        return 0.;
    }
}

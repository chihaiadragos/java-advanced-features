package GenericTypes.Coding.Sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Integer[] num1 = {5, 1, 6, 9, 3, 2};
        Sort.sortingList(num1);
        System.out.println("==========================");

        String[] num2 = {"baboon", "Star", "OCA", "123password", "New York", "1New York", "crayon"};
        Sort.sortingList(num2);
        System.out.println("==========================");

        List<Integer> num3 = Arrays.asList(5, 1, 6, 9, 3, 2);
        System.out.println(num3.stream().sorted().collect(Collectors.toList()));
        System.out.println("==========================");

        List<String> num4 = Arrays.asList("baboon", "Star", "OCA", "123password", "New York", "1New York", "crayon");
        System.out.println(num4.stream().sorted().collect(Collectors.toList()));
        System.out.println("==========================");
    }
}

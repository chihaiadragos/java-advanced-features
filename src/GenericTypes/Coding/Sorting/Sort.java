package GenericTypes.Coding.Sorting;

import java.util.Arrays;

public class Sort {
    public static <T extends Comparable<T>> void sortingList(T[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j].compareTo(list[j+1]) > 0) {
                    T aux = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = aux;
                }
            }
        }
        System.out.println(Arrays.stream(list).toList());
    }
}

package ExercisesForLiveCodingAdvanced.Exercise1;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = List.of("Apple", "Banana", "Orange", "Grapes");

        List<String> sortedList = sortAlphabeticallyReverse(stringList);
        System.out.println("Sorted List (Z to A): " + sortedList);
    }

    public static List<String> sortAlphabeticallyReverse(List<String> inputList) {
        //o copie a listei parametru pentru a evita modificarea acesteia
        List<String> sortedList = new java.util.ArrayList<>(List.copyOf(inputList));

        //sortam lista invers de la Z la A
        sortedList.sort(Collections.reverseOrder());

        return sortedList;
    }
}



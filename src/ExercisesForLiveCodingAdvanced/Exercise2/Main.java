package ExercisesForLiveCodingAdvanced.Exercise2;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = List.of("apple", "Banana", "Orange", "Grapes");

        List<String> sortedList = sortAlphabeticallyReverseCaseInsensitive(stringList);

        System.out.println("Sorted List (Z to A, Case-Insensitive): " + sortedList);
    }

    public static List<String> sortAlphabeticallyReverseCaseInsensitive(List<String> inputList) {
        //o copie a listei parametru pentru a evita modificarea acesteia
        List<String> sortedList = new java.util.ArrayList<>(List.copyOf(inputList));

        //sortam lista invers de la Z la A cu un comparator case-sensitive
        sortedList.sort(Comparator.comparing(String::toLowerCase, Comparator.reverseOrder()));

        return sortedList;
    }
}

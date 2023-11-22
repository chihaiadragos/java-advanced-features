package Collections.Features.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Alina");
        names.add("Ana");
        names.add("Alina");
        names.add("Bob");
        names.add("Ana");

        System.out.println(names);
        System.out.println();

        names.remove("Alina");
        System.out.println(names);

        if (names.contains("Bob")) {
            System.out.println("Bob is in the set");
        } else {
            System.out.println("Bob is not in the set");
        }

        System.out.println();
        if (names.isEmpty()) {
            System.out.println("Set is empty");
        } else {
            System.out.println("Set is not empty");
        }

        System.out.println();
        names.clear();
        System.out.println(names);
        System.out.println();

        Set<String> names2 = new HashSet<>();
        names.add("name1");
        names.add("name2");
        names.add("name3");
        names.add("name4");
        names.add("name5");
        names.addAll(names2);
        System.out.println(names);
        System.out.println();

        Set<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(8);
        numbers.add(14);

        System.out.println(numbers);
        numbers.remove(8);
        System.out.println();

        System.out.println(numbers);
        System.out.println();

        Set<String> movies = new LinkedHashSet<>();
        movies.add("Avatar1");
        movies.add("X-Men");
        movies.add("Avengers");
        movies.add("Avatar2");

        System.out.println(movies);
    }
}

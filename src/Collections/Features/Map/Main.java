package Collections.Features.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //nu tine cont de ordinea adaugarii
        Map<Integer, String> persons = new HashMap<>();
        persons.put(1234, "Diana Cotun");
        persons.put(5563, "Mos Craciun");
        persons.put(8788, "Bec Man");
        persons.put(5563, "Andrei Ionescu");

        for (Integer key : persons.keySet()) {
            System.out.println(key + " -> " + persons.get(key));
        }
        System.out.println();

        System.out.println(persons);
        persons.remove(1234);
        System.out.println(persons);
        persons.remove(8788, "Bec Man");
        System.out.println(persons);
        persons.remove(5555, "Andrei Ionescu");
        System.out.println(persons);
        System.out.println();
        persons.put(7723, "Maria Marian");

        for (String value : persons.values()) {
            System.out.println(value);
        }
        System.out.println("__________________________________");

        for (Map.Entry<Integer, String> entry : persons.entrySet()) {
            System.out.println(entry);
        }
        System.out.println();

        System.out.println(persons.containsKey(5563));
        System.out.println("__________________________________");

        System.out.println(persons);
        persons.replace(7723, "Ama Amarescu");
        System.out.println("__________________________________");
        System.out.println(persons);

        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        Map<String, Float> salaries = new TreeMap<>();
        salaries.put("Diana", 1000000f);
        salaries.put("Andrei", 8000.5f);
        salaries.put("Ana", 5000f);
        salaries.put("Florin", 10000f);
        System.out.println("<---------------------->");

        System.out.println(salaries);
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        Map<String, Integer> movies = new HashMap<>();
        movies.put("Titanic", 8);
        movies.put("Avengers", 10);
        movies.put("Hulk", 9);
        movies.put("Batman", 10);
        movies.put("Shrek", 7);
        System.out.println(movies);
    }
}

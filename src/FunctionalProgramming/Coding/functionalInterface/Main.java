package FunctionalProgramming.Coding.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        SumInterface sumInterface = new SumInterface() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };

        SumInterface dif = (a, b) -> a - b;

        System.out.println(sumInterface.sum(1, 2));
        System.out.println(dif.sum(1, 2));

        //consumer functional interface
        List<String> towns = Arrays.asList("Bucuresti", "Constanta", "Brasov", "Cluj");
        Consumer<List<String>> townsToUpperCase = townList -> {
            for (int i = 0; i < towns.size(); i++) {
                String currentTown = townList.get(i).toUpperCase();
                townList.set(i, currentTown);
//                  >(pair)<
//                System.out.println(currentTown);
            }
        };
//                  >(pair)<
//        townsToUpperCase.accept(towns);

        Consumer<List<String>> showTowns = townList -> townList.forEach(System.out::println);

        // sau asa
        townsToUpperCase.andThen(showTowns).accept(towns);


        Predicate<String> filteredTowns = town -> town.startsWith("B");
        System.out.println(towns.stream().filter(town -> town.startsWith("B")).collect(Collectors.toList()));

        Function<String, Integer> townNameLength = town -> town.length();
//        sau________________
//        Function<String, Integer> townNameLength = String::length;
        System.out.println(towns.stream().map(town -> town.length()).collect(Collectors.toList()));

        Supplier<Double> doubleSupplier = () -> 12 + 24.3;
        System.out.println(doubleSupplier.get());

        Integer[] sizeTownNameArray = towns.stream().map(town -> town.length()).toArray(Integer[]::new);


    }
}

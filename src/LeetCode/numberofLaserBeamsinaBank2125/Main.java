package LeetCode.numberofLaserBeamsinaBank2125;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

/*
The rules of the FizzBuzz game are very simple:

    Say Fizz if the number is divisible by 3.
    Say Buzz if the number is divisible by 5.
    Say Buzz if the number is divisible by 7.
    Say FizzBuzz if the number is divisible by both 3 and 5.

Return the number itself, if the number is not divisible by 3 and 5.
 */
public class Main {
    public static void main(String[] args) {
        Map<String, Predicate<Integer>> map = new HashMap<>();
        map.put("FizzBuzz", num -> num % 3 == 0 && num % 5 == 0);
        map.put("Fizz", num -> num % 3 == 0 || num % 7 == 0);
        map.put("Buzz", num -> num % 5 == 0);
        map.put("Tazz", num -> num % 10 == 0);
        int n = 100;

        fizzBuzz(n, map);
    }
    public static void fizzBuzz(int n, Map<String, Predicate<Integer>> map) {
        for (int i = 0; i <= n; i++) {
            if (map.get("FizzBuzz").test(i)) {
                System.out.println("FizzBuzz");
            } else if (map.get("Fizz").test(i)) {
                System.out.println("Fizz");
            } else if (map.get("Buzz").test(i)) {
                System.out.println("Buzz");
            } else if (map.get("Tazz").test(i)) {
                System.out.println("Tazz");
            }
            System.out.println(i);
        }
    }
}
/*

 1 -> 15
 map  [FizzBuzz, {15}] [Buzz, {3, 6, 9, 12}] [Fizz, {5, 10}]
 map.values() -> lista de valori
 map.keySet() -> lista de key
 dar eu iau pt key - valoarea
  */

package LeetCode.numberofLaserBeamsinaBank2125;

import java.util.stream.IntStream;

public class Main2 {
    public static void main(String[] args) {
        int n = 100;
        IntStream.range(1, n)
                .mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz " : "Fizz ") : (i % 5 == 0 ? "Buzz " : i + " "))
                .forEach(System.out::print);
    }
}

package Modules.Features.thread.sortTimeCompare;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SortingComparison {

    public static void main(String[] args) {
        int[] dataBubbleSort = generateRandomArray(10000);
        int[] dataQuicksort = Arrays.copyOf(dataBubbleSort, dataBubbleSort.length);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // rulam bubble sort pe un thread
        Runnable bubbleSortTask = () -> {
            long startTime = System.currentTimeMillis();
            bubbleSort(dataBubbleSort);
            long endTime = System.currentTimeMillis();
            System.out.println("Bubble Sort Time: " + (endTime - startTime) + " milliseconds");
        };

        // rulam quicksort pe un thread
        Runnable quicksortTask = () -> {
            long startTime = System.currentTimeMillis();
            Arrays.sort(dataQuicksort); // folosim Java's quicksort
            long endTime = System.currentTimeMillis();
            System.out.println("Quicksort Time: " + (endTime - startTime) + " milliseconds");
        };

        // apelam instructiunile pe executor service
        executorService.submit(bubbleSortTask);
        executorService.submit(quicksortTask);

        // inchidem executor service
        executorService.shutdown();

        try {
            // asteptam ambele instructiuni sa se incheie
            executorService.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // algoritm bubble sort
    private static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // generam un array de int-uri random
    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000);
        }
        return array;
    }
}

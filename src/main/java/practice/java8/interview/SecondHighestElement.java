package practice.java8.interview;

import java.util.Arrays;

public class SecondHighestElement {
    public static void main(String[] args) {
        int[] array = {5, 10, 2, 8, 15, 10, 15}; // Example array with duplicate highest elements

        int secondHighest = findSecondHighest(array);
        System.out.println("Second highest element: " + secondHighest);
    }

    public static int findSecondHighest(int[] array) {
        // Find the highest element
        int max = Arrays.stream(array)
                        .max()
                        .orElseThrow(() -> new IllegalArgumentException("Array is empty"));

        // Remove all occurrences of the highest element
        array = Arrays.stream(array)
                      .filter(x -> x != max)
                      .toArray();

        // Find the maximum element in the remaining array, which will be the second highest
        int secondHighest = Arrays.stream(array)
                                 .max()
                                 .orElseThrow(() -> new IllegalArgumentException("No second highest element found"));

        return secondHighest;
    }
}


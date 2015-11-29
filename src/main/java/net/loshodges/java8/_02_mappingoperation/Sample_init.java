package net.loshodges.java8._02_mappingoperation;

import java.util.Arrays;
import java.util.List;

public class Sample_init {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        int totalOfValuesDoubled = 0;
        for (int number : numbers) {
            totalOfValuesDoubled += number * 2; // mutability
        }

        System.out.println(totalOfValuesDoubled);

        // 1. Map&Reduce
        // 2. Performance

        // Stream operations are divided into two categories: intermediate and terminal.
        // After a terminal operation is performed, the stream can no longer be used.

    }
}

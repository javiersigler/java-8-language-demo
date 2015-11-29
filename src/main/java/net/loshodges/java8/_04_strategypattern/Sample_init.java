package net.loshodges.java8._04_strategypattern;

import java.util.Arrays;
import java.util.List;

public class Sample_init {
    // This approach leads to duplication, lacks separation of concern.

    public static Integer totalValues(List<Integer> numbers) {
        return 0;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // We don't want to go this route. but it seems so easy...
        Integer total = totalValues(numbers);
        System.out.println(total);

    }
}

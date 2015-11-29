package net.loshodges.java8._01_externaltointernal;

import java.util.Arrays;
import java.util.List;

public class Sample_init {
    public static void main(String[] args) {

        // Scenario
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(i);
        }

        // 1. External iterator Java 7
        // 2. Consumer
        // 3. Lambda
        // 4. Type inference
        // 5. Method reference

    }
}

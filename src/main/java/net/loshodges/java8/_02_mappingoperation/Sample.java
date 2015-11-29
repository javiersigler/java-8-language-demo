package net.loshodges.java8._02_mappingoperation;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Sample {

    public static <T> T timeIt(Supplier<T> function){
        long initialNanoSeconds = System.nanoTime();
        T value = function.get();
        long elapse_time = System.nanoTime() - initialNanoSeconds;
        System.out.println("Loop nanoseconds: " + elapse_time / 1000);
        return value;
    }

    public static void main(String[] args) {
        IntStream numbers = IntStream.range(0, 10000 * 10000);
        int[] array = IntStream.range(0, 10000 * 10000).toArray();

        int totalOfValuesDoubled = timeIt(() -> imperativeLoop(array));
        System.out.println("Loop value: " + totalOfValuesDoubled);

        totalOfValuesDoubled = timeIt(() -> imperativeLoop(array));
        System.out.println("Functional value: " + totalOfValuesDoubled);
    }

    private static int imperativeLoop(int[] array) {
        int totalOfValuesDoubled = 0;
        for (int number : array) {
            totalOfValuesDoubled += number * 2; // mutability
        }
        return totalOfValuesDoubled;
    }

    private static int functionalLoop(IntStream numbers) {
        int totalOfValuesDoubled;
        totalOfValuesDoubled = numbers.map(number -> number * 2).reduce(0, (c, e) -> c += e);
        return totalOfValuesDoubled;
    }
}

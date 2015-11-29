package net.loshodges.java8._04_strategypattern;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Sample {
    // This approach leads to duplication, lacks separation of concern.

    public static Integer totalValues(List<Integer> numbers) {
        int total = 0;
        for (Integer value : numbers) {
            total += value;
        }
        return total;
    }



    public static Integer totalEvenValues(List<Integer> numbers) {
        int total = 0;
        for (Integer value : numbers) {
            if (value % 2 == 0) {
                total += value;
            }
        }
        return total;
    }

    public static Integer totalOddValues(List<Integer> numbers) {
        int total = 0;
        for (Integer value : numbers) {
            if (value % 2 != 0) {
                total += value;
            }
        }
        return total;
    }

    public static Integer totalValues(List<Integer> numbers, Predicate<Integer> selector) {
        int total = 0;
        for (Integer value : numbers) {
            if (selector.test(value)) {
                total += value;
            }
        }
        return total;
    }

    public static Integer totalValuesStream(List<Integer> numbers, Predicate<Integer> selector) {
        return numbers.stream()
                      .filter(selector)
                      .reduce(0, (c, e) -> c += e);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println(totalValues(numbers));
        System.out.println(totalEvenValues(numbers));
        System.out.println(totalOddValues(numbers));

        System.out.println(totalValues(numbers, e -> true));
        System.out.println(totalValues(numbers, e -> e % 2 == 0));
        System.out.println(totalValues(numbers, e -> e % 2 != 0));
        System.out.println(totalValuesStream(numbers, e -> true));
    }

    /*
     * public static void totalAssets(List<Asset> assets, Predicate<Asset> selector) { System.out.println(
     * assets.stream() .filter(selector) .mapToInt(asset -> asset.value) .sum()); }
     */
}

package net.loshodges.java8._06_streamlaziness;

import java.util.Arrays;
import java.util.List;

public class Sample_init {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 9, 8);

        // double the first even number greater than 3 from the list
        Integer result = 0;
        for (Integer e : numbers){
           if (e > 3 && e % 2 == 0){
               result = e * 2;
           }
        }
        System.out.println(result);

    }
}

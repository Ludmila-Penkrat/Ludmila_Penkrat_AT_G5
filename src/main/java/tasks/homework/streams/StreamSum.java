package tasks.homework.streams;

import java.util.Arrays;
import java.util.List;

public class StreamSum {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        System.out.println(list.stream()
                .filter(x -> x % 2 == 0)
                .peek(x -> System.out.println(x + "\""))
                .mapToDouble(x -> x * 2.54)
                .sum());
    }
}

package tasks.homework.streams;

import java.util.Random;
import java.util.stream.IntStream;

public class IntNumber {

    public static void main(String[] args) {

        IntStream.rangeClosed(0, 50).filter(x -> (x % 5 == 0) && (x % 3 == 0)).forEach(System.out::println);

        new Random().ints(10,1,100).filter(x -> (x % 5 == 0) && (x % 3 == 0)).forEach(System.out::println);
    }
}

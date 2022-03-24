package tasks.homework.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Comparator;

public class PersonStreamRunner {

    public static void main(String[] args) {

        List<String> people = IntStream
                .rangeClosed(1, 100)
                .boxed()
                .map(i -> new Person())
                .filter(p -> p.getAge() < 21)
                .peek(x -> System.out.println(x.getName() + " " + x.getAge()))
                .sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName))
                .limit(7)
                .peek(x -> System.out.println(x.getName() + " " + x.getSurname() + " " + x.getAge()))
                .map(Person::getName)
                .collect(Collectors.toList());
        for (String people1 : people){
            System.out.println(people1);
        }

    }

}

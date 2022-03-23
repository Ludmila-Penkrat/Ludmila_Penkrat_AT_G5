package tasks.homework.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonRunner {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        Person per1 = new Person(32, "Коля");
        Person per2 = new Person(24, "Оля");
        Person per3 = new Person(55,"Вася");
        Person per4 = new Person(63,"Маша");

        persons.add(per1);
        persons.add(per2);
        persons.add(per3);
        persons.add(per4);

        for (Person personAge : persons){
            System.out.print(personAge.getAge() + " ");
        }

        System.out.println();

        for (Person personName : persons){
            System.out.print(personName.getName() + " ");
        }

        System.out.println();

        for (int i = 0; i < persons.size(); i++){
            System.out.println(persons.get(i).toString());
        }
    }
}

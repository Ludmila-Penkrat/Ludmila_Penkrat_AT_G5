package tasks.homework.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class Cars {

    public static void main(String[] args) {

        Set<String> myList = new HashSet<>();
        String[] str = "Хендай, Ауди, Жигуль, Рено, Субару, Жигуль, Ауди".split(", ");

        for (String s : str) {
            myList.add(s);
            System.out.println("\"" + s + "\"");
        }

        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            String nextIterator = iterator.next();
            if (nextIterator.length() <= 4) {
                iterator.remove();
            }
        }
        for (String my : myList) {
            System.out.print(my + " ");
        }

    }
}

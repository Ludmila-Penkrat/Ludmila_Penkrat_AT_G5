package tasks.homework.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class Cars {

    public static void main(String[] args) {

        Set<String> myList = new HashSet<>();
        String [] str = "Мерс, Ауди, Жигуль, Рено, Жигуль, Жигуль, Ауди".split(", ");

        for (String s : str){
            myList.add(s);
            System.out.println("\"" + s + "\"");
        }

        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()){
            if (iterator.next().length() <=4){
                System.out.println(iterator.next());
            } else {
                iterator.remove();
            }
       }
        System.out.println(iterator.next());
    }
}

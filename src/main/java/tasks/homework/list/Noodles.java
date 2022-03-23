package tasks.homework.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Noodles {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();

        myList.add("Hakka");
        myList.add("Ramen");
        myList.add("Hibachi");
        myList.add("Schezwan");


        String str = String.join("-", myList);
            System.out.print(str);

        System.out.println();

        for (String str1 : myList) {
            str1 = str1.replaceAll("a", "o");
            System.out.println(str1);
        }
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
    }
}

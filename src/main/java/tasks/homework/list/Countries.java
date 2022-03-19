package tasks.homework.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Countries {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Andorra");
        myList.add("Portugal");
        myList.add("Great Britain");
        myList.add("Zambia");

        for (String str : myList) {
            System.out.print(", " + str);
        }

        System.out.println();

        Iterator<String> iter = myList.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + ", ");
        }
        System.out.println();

        int count = 0;
        for (String str : myList) {
            if (str.length() < 7) {
                count++;
            }
        }
        System.out.println(count);

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}

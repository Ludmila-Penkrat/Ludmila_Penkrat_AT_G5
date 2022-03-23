package tasks.homework.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Countries {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Andorra");
        myList.add("Portugal");
        myList.add("Great Britain");
        myList.add("Zambia");

        String str1 = String.join(", ", myList);
        System.out.print(str1);

        System.out.println();

        String allCountries = myList.stream().map(i -> i.toString()).collect(Collectors.joining(", "));
        System.out.print(allCountries);


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

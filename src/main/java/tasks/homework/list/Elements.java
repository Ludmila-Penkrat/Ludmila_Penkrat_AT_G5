package tasks.homework.list;

import java.util.ArrayList;
import java.util.List;

public class Elements {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();

        myList.add("Text field");
        myList.add("Radio");
        myList.add("Check-box");
        myList.add("Drop-down");
        myList.add("Picker");
        myList.add("Breadcrumb");

        for (String str : myList){
            System.out.print(str + " ");
        }
        System.out.println();

        int count = 0;
        for (String str1 : myList){
            if (str1.contains(" ") || str1.contains("-")){
                count ++;
            }
        }
        System.out.println(count);

        for (int i = 0; i < myList.size(); i++){
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();

        myList.add(4, "Spinner");
        myList.remove(2);
        myList.set(5, "Switch");

        for (String st : myList){
            System.out.print(st + " ");
        }

    }
}

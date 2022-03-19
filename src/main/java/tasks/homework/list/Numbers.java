package tasks.homework.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Numbers {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);

        for (int ineg : myList) {
            System.out.println(ineg);
        }

        System.out.println();

        int sum = 0;
        for (int integ : myList) {
            sum += integ;
        }
        System.out.println(sum);

        Collections.sort(myList);
        for (int integ : myList) {
            System.out.print(integ + " ");
        }

        System.out.println();

        Collections.reverse(myList);
        for (int integ : myList) {
            System.out.print(integ + " ");
        }

        System.out.println();

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
    }
}

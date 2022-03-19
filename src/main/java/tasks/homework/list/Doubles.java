package tasks.homework.list;

import java.util.Arrays;
import java.util.List;

public class Doubles {

    public static void main(String[] args) {

        List<Double> myList = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        for (double doub : myList) {
            System.out.print(doub + " ");
        }
        System.out.println();

        double mult = 1;
        for (double doub1 : myList) {
            mult *= doub1;
        }
        System.out.println(mult);


        float rest = 0;
        for (double doub2 : myList) {
            rest += doub2 % 1;
        }
        System.out.println(rest);

        int sum1 = 0;
        for (int i = 0; i < myList.size(); i++){
            sum1 += (myList.get(i) - myList.get(i)%1);
        }
        System.out.println(sum1);
    }
}

package cycletask;

import java.util.Arrays;
import java.util.Random;

public class ChangeArray {

    int[] changeArray = new int[7];

    public void positionChange() {

        Random random = new Random();

        for (int i = 0; i < changeArray.length; i++) {
            changeArray[i] = random.nextInt(15);
            System.out.print(changeArray[i] + " ");
        }
        System.out.print(" | ");

        int x = changeArray[0];
        changeArray[0] = changeArray[changeArray.length - 1];
        changeArray[changeArray.length - 1] = x;

        for (int i = 0; i < changeArray.length; i++) {
            System.out.print(changeArray[i] + " ");
//        System.out.print(Arrays.toString(changeArray)); // может есть другие варианты вывода  в консоль?
        }
    }
}

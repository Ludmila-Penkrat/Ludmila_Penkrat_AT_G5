package cycletask;

import java.util.Random;

public class CycleArray {

    int[] array = new int[7];

    public void foo() {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);

        }
        for (int i : array){
            System.out.print(i + " ");
        }
    }
}

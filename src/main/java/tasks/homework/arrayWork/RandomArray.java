package tasks.homework.arrayWork;

import java.util.Random;


public class RandomArray {

    private static final Random random = new Random();

    RandomArray() {
    }

    public int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

}

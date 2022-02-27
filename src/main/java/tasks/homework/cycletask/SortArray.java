package tasks.homework.cycletask;

import java.util.Random;

public class SortArray {

    int[] arraySort = new int[7];

    public void descendingSorting(){

        Random random = new Random();

        for (int i = 0; i < arraySort.length; i++){
            arraySort[i] = random.nextInt(10);
            System.out.print(arraySort[i] + " ");
        }
        System.out.print(" | ");

        for (int i = 1; i < arraySort.length; i++){
            for (int j = arraySort.length-1; j>=i; j--){
                if (arraySort[j-1] < arraySort[j]){
                    int tmp = arraySort[j-1];
                    arraySort[j-1] = arraySort[j];
                    arraySort[j] = tmp;
                }
            }
        }
//        System.out.print(Arrays.toString(arraySort));
        for (int i = 0; i < arraySort.length ; i++) {
            System.out.print(arraySort[i] + " ");
        }
    }
}

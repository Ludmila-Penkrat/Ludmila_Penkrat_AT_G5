package tasks.homework.cycletask;

import java.util.Random;

public class ArraySqrt {

    int [] sqrtArray = new int[7];

    public  void task(){

        Random random = new Random();

        for (int i = 0; i < sqrtArray.length; i++) {
            sqrtArray[i] = random.nextInt(10);

            System.out.print(sqrtArray[i] + " ");
        }
        System.out.print(" | ");

        for (int i = 0; i < sqrtArray.length; i++){
            int sqrt = sqrtArray[i]*sqrtArray[i];

            System.out.print(sqrt + " ");
        }
    }
}

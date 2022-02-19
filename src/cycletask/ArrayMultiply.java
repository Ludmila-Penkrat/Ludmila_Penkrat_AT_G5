package cycletask;

import java.util.Random;

public class ArrayMultiply {

    int [] randomArray = new int [7];

    public void arrayMultiplyFive (){

        Random random = new Random();

        for (int i=0; i<7; i++) {
            randomArray[i] = random.nextInt(25);
            System.out.print(randomArray[i] + " ");
        }

            System.out.print(" |  ");

        for (int i=0; i<7; i++) {
            System.out.print(randomArray[i] * 5 + " ");
        }
    }
}

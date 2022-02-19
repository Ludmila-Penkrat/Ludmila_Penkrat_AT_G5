package cycletask;

import java.util.Random;

public class ReverseArray {

    int [] newArray = new int[7];

    public void reverse (){

        Random random = new Random();

        for (int i=0; i < newArray.length; i++){
            newArray[i] = random.nextInt(20);

            System.out.print(newArray[i] + " ");
        }

        System.out.print(" |  ");

        for (int i = newArray.length-1; i >= 0; i--){ // почему указывается -1?
            System.out.print(newArray[i] + " ");
        }
    }
}

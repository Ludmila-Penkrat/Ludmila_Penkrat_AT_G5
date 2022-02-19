package day02;

import java.util.Random;

public class ForEach {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // генерация рандомных чисел и записывает в каждую ячейку
        }

        int e = 0;

        for (int i : array) {
            e = i;
            System.out.println(i);
        }
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + array[i];
        }
        System.out.println("Avarage summ: " + sum / array.length);
    }
}

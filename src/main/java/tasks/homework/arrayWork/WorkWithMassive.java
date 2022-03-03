package tasks.homework.arrayWork;

import java.lang.reflect.Array;
import java.time.LocalDate;

public class WorkWithMassive {

    RandomArray randomArray = new RandomArray();

    public void countSumArray(int x) {

        int[] array1 = randomArray.createArray(10); //  если брать сразу инициализированный массив а не рандом int[] array = {10,2,7,5,6,4,1,5,11,23,45,100,205,-7,25};

        int sum = 0;
        for (int i = x - 1; i < array1.length; i = i + x) {
            sum += array1[i];
        }
        System.out.println(sum);
    }

    public void returnMonth() {

        LocalDate date = LocalDate.now(); // получаем текущую дату
        int month = date.getMonthValue(); // получаем текущий месяц

        int[] array2 = randomArray.createArray(10); // создаем рандомный инициализированный массив
        int sum = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] % month == 0) { // определяем какой элемент массива кратен номеру текущего месяца
                sum += array2[i]; // получаем сумму этих элементов
            }
        }
        System.out.println(sum);
    }

    public void printImage() {

        System.out.println(" ^__^");
        System.out.println(" (oo)\\\\_________");
        System.out.println("(__)\\ ) \\/\\ \\"); // как правильно вывести эту последовательность слешей?
        System.out.println("     ||----w |\\");
        System.out.println("     ||   ||");
        System.out.println("\u2764 ");
    }

    public void returnNewMassive(int n) {


        int[] array3 = randomArray.createArray(10);// создаем рандомный инициализированный массив

        int[] array4 = new int[array3.length];

        for (int i = array3.length-1; i >= 0; i--) {
            if (array3[i] > n) {
                array4[i] = array3[i];
                System.out.print(array4[i]+ " ");
            }
        }
    }
}

package cycletask;

//import java.util.Arrays;
//import java.util.Collection;
//import java.util.Random;
//
//public class SortArrayAnotherWay {
//
//    int [] arr = new int[7];
//
//    public void sortCollection(){
//
//        Random random = new Random();
//
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = random.nextInt(15);
//            System.out.print(arr[i] + " ");
//        }
//        System.out.print(" |  ");
//    }
//    public static void quickSort (int [] arr, int low, int high){
//        if (arr.length == 0)
//            return; // завершить выполнение если длина массива равно 0
//
//        if (low >= high)
//            return; //завершить выполнение если нечего делить
//
//        // выбираем опортный элемент
//        int middle = low + (high-low) / 2;
//        int opora = arr[middle];
//
//        // разделить на подмассивы, которые больше или мельше опорного элемента
//        int i = low, j = high;
//        while (i <=j){
//            while (arr[i] < opora) {
//                i++;
//            }
//            while (arr[j] > opora) {
//                j--;
//            }
//            if (i <= j) { // меняем местами
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                i++;
//                j--;
//            }
//        }
//        if (low <j){
//            quickSort(arr, low, j);
//        }
//        if (high > i){
//            quickSort(arr, i, high);
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//
//
//}

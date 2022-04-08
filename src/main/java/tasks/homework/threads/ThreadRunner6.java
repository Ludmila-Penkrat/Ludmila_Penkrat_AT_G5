package tasks.homework.threads;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThreadRunner6 {

    static List<Mouse> mouseList = IntStream.range(1, 21).boxed().map(x -> new Mouse(x)).collect(Collectors.toList());

    synchronized public static void deleteEvenMouse() {
        for (int i = 0; i < mouseList.size(); i++) {
//            if (mouseList.get(i).number % 2 == 0) {
//                mouseList.get(i).peep();
//                mouseList.remove(i);
            if (i%5==0){
                mouseList.get(i).peep();
                mouseList.remove(i);
            }
//            }
        }
    }

    public static void main(String[] args) {


        for (int i = 0; i < 6; i++) {
            new Thread(() -> {

                deleteEvenMouse();
                try {
                    Thread.sleep(270);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }).start();
        }
    }
}

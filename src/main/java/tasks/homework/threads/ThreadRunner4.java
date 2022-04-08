package tasks.homework.threads;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ThreadRunner4 {

    public static void main(String[] args) {

        List<Mouse> mouseList = IntStream.range(1, 10).boxed().map(x -> new Mouse(x)).collect(Collectors.toList());

        for (int i=0; i < 5; i++){

            new Thread(()-> {
                while (!mouseList.isEmpty()){
                    mouseList.remove(0).peep();
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }).start();
        }
    }
}

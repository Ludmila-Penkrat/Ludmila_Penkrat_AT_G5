package tasks.homework.threads;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThreadRunner5 {

    static List<Mouse> mouseList = IntStream.range(1,21).boxed().map(x-> new Mouse(x)).collect(Collectors.toList());

    public static synchronized void removeMise(){
        for (int i = 0; i < mouseList.size(); i++){
            if (i%2 != 0){
                mouseList.get(i).peep();
                mouseList.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i<7; i++){
            new Thread(()-> {
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                removeMise();
            }).start();
        }
    }
}

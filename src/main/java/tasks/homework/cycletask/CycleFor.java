package tasks.homework.cycletask;

public class CycleFor {

    int i = 3;

    public void numbers(){
        for (i = 3; i <= 19; i++){
            if (i%2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}

package tasks.homework.threads;

import java.util.stream.IntStream;

public class ThreadRunner3 {

    public static void main(String[] args) {

        Thread th1 = new Thread(()-> {
            IntStream.range(1,26).boxed().filter(x->(x%2 != 0)).map(Mouse::new).forEach(Mouse::peep);
        });

        Thread th2 = new Thread(()-> {
            IntStream.range(1,26).boxed().filter(x->(x%2 != 0)).map(x-> new Mouse(0+x)).forEach(Mouse::peep);
        });

        Thread th3 = new Thread(()-> {
            IntStream.range(1,26).boxed().filter(x->(x%2 != 0)).map(x-> new Mouse(0+x)).forEach(Mouse::peep);
        });

        Thread th4 = new Thread(()-> {
            IntStream.range(1,26).boxed().filter(x->(x%2 != 0)).map(x-> new Mouse(0+x)).forEach(Mouse::peep);
        });

        Thread th5 = new Thread(()-> {
            IntStream.range(1,26).boxed().filter(x->(x%2 != 0)).map(x-> new Mouse(0+x)).forEach(Mouse::peep);
        });

        Thread th6 = new Thread(()-> {
            IntStream.range(1,26).boxed().filter(x->(x%2 != 0)).map(x-> new Mouse(0+x)).forEach(Mouse::peep);
        });

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        th6.start();
    }
}

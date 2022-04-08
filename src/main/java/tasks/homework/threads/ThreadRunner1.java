package tasks.homework.threads;


import java.util.stream.IntStream;

public class ThreadRunner1 {

    public static void main(String[] args) {

        Thread th1 = new Thread(() -> {
            IntStream.range(1, 20).boxed().map(x -> new Mouse(2 + x)).forEach(Mouse::peep);
        });

        Thread th2 = new Thread(() -> {
            IntStream.range(1, 20).boxed().map(x -> new Mouse(2 + x)).forEach(x -> x.peep());
        });

        Thread th3 = new Thread(() -> {
            IntStream.range(1, 20).boxed().map(x -> new Mouse(2 + x)).forEach(x -> x.peep());
        });

        Thread th4 = new Thread(() -> {
            IntStream.range(1, 20).boxed().map(x -> new Mouse(2 + x)).forEach(x -> x.peep());
        });

        Thread th5 = new Thread(() -> {
            IntStream.range(1, 20).boxed().map(x -> new Mouse(2 + x)).forEach(x -> x.peep());
        });

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
    }
}


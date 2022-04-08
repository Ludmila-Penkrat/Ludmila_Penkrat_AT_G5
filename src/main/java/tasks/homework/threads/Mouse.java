package tasks.homework.threads;

public class Mouse {

    private String pattern;
    private String name;
    int number;

    public Mouse(int number) {
        this.name = "Mouse " + number;
        this.pattern = "Mouse <n>";
//        this.number = number;
    }
    public void peep() {
        System.out.println(Thread.currentThread().getName() + name + " PEEP!");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }
}

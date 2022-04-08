package tasks.homework.threads;

public class Hedgehog {

    private String pattern;
    private String name;

    public Hedgehog(int number) {
        this.name = "Hedgehog" + number;

    }
    public void tellMe()  {
        System.out.println("I am  " + name + "!");
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

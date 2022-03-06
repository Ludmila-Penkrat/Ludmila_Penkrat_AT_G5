package project.bubbles;

public class Bubble {

    private static final double VOLUME = 0.3;
    private String gas;

    public Bubble(String gas) {
        this.gas = gas;
    }

    public static void cramp(){  // не поняла почему поросила идея сделать этот метод static?
        System.out.print("Cramp!");
    }

    public double getVolume(){
        return VOLUME;
    }
}

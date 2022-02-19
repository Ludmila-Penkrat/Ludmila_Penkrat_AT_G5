package bubbles;

public class Bubble {

    public final double volume = 0.3;
    private String gaz;

    public Bubble() {
    }

    public String getGaz() {
        return gaz;
    }

    public void setGaz(String gaz) {
        this.gaz = gaz;
    }

    public void explosion(){
        System.out.println("Cramp!");
    }
}

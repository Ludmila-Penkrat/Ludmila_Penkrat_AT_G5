package bubbles;

public class SparklingWater extends Water {

    Bubble[] bubbles;
    double volume;
    private boolean open;

    public SparklingWater() {
        this.bubbles = new Bubble[(int) (10000 * this.volume)];
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("CO2");

        }
    }
        public void degas () {
            for (int i = bubbles.length - 1; i >= 0; i--) {
                bubbles[i] = new Bubble("CO2");
                Bubble.cramp();
            }
        }
    }




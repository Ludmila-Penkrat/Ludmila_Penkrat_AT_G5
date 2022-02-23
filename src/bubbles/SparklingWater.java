package bubbles;

public class SparklingWater extends Water {

    Bubble[] bubbles;
    double volume;

    public SparklingWater() {
        super();
        this.bubbles = bubbles;
        this.volume = volume;
        this.bubbles = new Bubble[];
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = new Bubble[(int) 10000 * this.volume];
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("CO2");

        }

        public void degas () {
            for (int i = bubbles.length - 1; i >= 0; i--) {
                bubbles[i] = new Bubble("CO2");
                Bubble.cramp();
            }
        }
    }
}



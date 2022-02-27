package project.boxing;

import project.bubbles.Bubble;
import project.water.SparklingWater;

public class Bottle {

    private double volume;
    Bubble[] bubbles;
    SparklingWater sparklingWater = new SparklingWater();


    public Bottle(double volume) {
        this.volume = volume;
        this.bubbles = new Bubble [(int) (10000 * volume)];
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("CO2");
        }
        sparklingWater.pump(bubbles);

    }

    public void open() {
        sparklingWater.degas();

    }
}

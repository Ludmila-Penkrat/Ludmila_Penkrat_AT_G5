package project.water;

import project.bubbles.Bubble;

public class SparklingWater extends Water {

    Bubble[] bubbles;
    double volume;
    private boolean isOpened;


    public SparklingWater() {
        this.volume = volume;
        isOpened();
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    public void setOpened (boolean isOpened){
        if (isOpened){
            this.isOpened();
        }
    }

    public void degas() {
        for (int i = bubbles.length - 1; i >= 0; i--) {
            bubbles[i] = new Bubble("CO2");
            Bubble.cramp();
        }
    }
    private void isOpened() { // должен проверять в новом потоке????
    }


}




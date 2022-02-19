package bubbles;

public class SparklingWater extends Water {

    Bubble bubble = new Bubble();
    Bottle bottle = new Bottle();

        int[] bubbles = new int[(int)bottle.getBottlevolume() * 10000];

        public void pump () {
            for (int i=0; i < bubbles.length; i++);
        }

        public void degas () {
            for (int i = bubbles.length - 1; i >= 0; i--) {
                bubble[i] = new Bubble();
                bubble.explosion();
            }


        }
    }


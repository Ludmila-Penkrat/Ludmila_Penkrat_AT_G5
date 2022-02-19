package bubbles;

public class Bottle {

    private double bottlevolume;
    Bubble[] bubbles;
    SparklingWater sparklingWater = new SparklingWater();

    public Bottle() {
    }

    public Bottle(double bottlevolume) {
        this.bottlevolume = bottlevolume;
    }

    public double getBottlevolume() {
        return bottlevolume;
    }

    public void setBottlevolume(double bottlevolume) {
        this.bottlevolume = bottlevolume;
    }

    public void open (){
        sparklingWater.degas();

    }


}

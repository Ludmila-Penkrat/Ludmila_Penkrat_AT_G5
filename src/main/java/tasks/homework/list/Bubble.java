package tasks.homework.list;

public class Bubble {

    private int volume;
    private String name;

    public Bubble(int volume1, String name1) {
        this.volume = volume1;
        this.name = name1;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bubble{" +
                "volume=" + volume +
                ", name='" + name + '\'' +
                '}';
    }
}

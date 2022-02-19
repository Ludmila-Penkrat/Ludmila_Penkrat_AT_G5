package day02;

public class Fruit {

    private int surgar;
    private String name;

    public Fruit(int surgar, String name) {
        this.surgar = surgar;
        this.name = name;
    }

    public int getSurgar() {
        return surgar;
    }

    public void setSurgar(int surgar) {
        this.surgar = surgar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

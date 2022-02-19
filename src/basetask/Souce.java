package basetask;

public class Souce {

    private String name;
    private String color;

    public Souce(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    @Override
    public String toString() {
        return "Souce{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void printSouseDetails (){

        System.out.println("Это соус " + name + " " + color + " цвета");
    }
}

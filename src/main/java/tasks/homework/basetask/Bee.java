package tasks.homework.basetask;

public class Bee {

    String gender;
    long weight;

    public Bee(String gender, long weight) {
        this.gender = gender;
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bee{" +
                "gender='" + gender + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void printBeeDetails() {
        long y = (500*1000)/this.weight;
        System.out.println("Я легче лося в " + y + " раз");
    }
}

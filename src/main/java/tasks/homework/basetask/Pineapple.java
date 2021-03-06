package tasks.homework.basetask;

public class Pineapple {

    private String grade;
    private double heatCapacity;

    public Pineapple(String grade, double heatCapacity) {
        this.grade = grade;
        this.heatCapacity = heatCapacity;
    }

    public String getGrade() {

        return grade;
    }

    public void setGrade(String grade) {

        this.grade = grade;
    }

    public double getHeatCapacity() {

        return heatCapacity;
    }

    public void setHeatCapacity(double heatCapacity) {

        this.heatCapacity = heatCapacity;
    }

    @Override
    public String toString() {
        return "Pineapple{" +
                "grade='" + grade + '\'' +
                ", heatCapacity=" + heatCapacity +
                '}';
    }

    public void printPineappleDetails(){
        if (this.heatCapacity > 2140){
            System.out.println("Я ананас, теплоемкость которого больше, чем у ветчины");
        } else {
            System.out.println("В Ветчине тепла запасается больше :(");
        }
    }
}

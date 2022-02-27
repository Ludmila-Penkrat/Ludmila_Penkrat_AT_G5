package tasks.classwork.day04;

import java.util.Arrays;

public class Car extends Vehicle implements Movable {

    public Car(int speed, String color, String model, Wheel[] wheels) {
        super(speed, color, model, wheels);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                ", weels=" + Arrays.toString(wheels) +
                '}';
    }

    @Override
    public void start() {
        System.out.println("Car has started");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped");

    }
}

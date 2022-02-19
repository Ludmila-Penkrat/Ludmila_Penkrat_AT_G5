package day02;

public class AppleRunner {

    public static void main(String[] args) {

        Apple apple = new Apple();
        Apple apple1 = new Apple ("blue", "sour", 20, 5);

        apple.setColor("red");
        apple.setTaste("sweet");
        apple.setWeight(50);

        System.out.println(apple);
        System.out.println(apple1);

        System.out.println("Apple color: " + apple1.getColor());


    }
}

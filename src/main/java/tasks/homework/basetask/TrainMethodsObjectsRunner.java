package tasks.homework.basetask;

public class TrainMethodsObjectsRunner {

    public static void main(String[] args) {

        TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();
        trainMethodsObjects.processMouse(new Mouse("Jerry", 2));

        System.out.println();

        TrainMethodsObjects trainMethodsObjects1 = new TrainMethodsObjects();
        trainMethodsObjects1.processSouce(new Souce("Песто", "зеленого"));

        System.out.println();

        TrainMethodsObjects trainMethodsObjects2 = new TrainMethodsObjects();
        trainMethodsObjects2.processBee(new Bee("male", 2l));

        System.out.println();

        TrainMethodsObjects trainMethodsObjects3 = new TrainMethodsObjects();
        trainMethodsObjects3.processObstacle(new Obstacle("в виде отключения интернета", "критичное"));

        System.out.println();

        TrainMethodsObjects trainMethodsObjects4 = new TrainMethodsObjects();
        trainMethodsObjects4.processPineapple(new Pineapple("первый", 2560.56));

    }
}

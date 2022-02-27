package day04;

public class Runner {

    public static void main(String[] args) {

        Wheel[] wheels = {
                new Wheel(16, "summer"),
                new Wheel(16, "summer"),
                new Wheel(16, "summer"),
                new Wheel(16, "summer")};

        Wheel[] bikeWheels = {
                new Wheel(16, "summer"),
                new Wheel(16, "summer")};

        Vehicle car2 = new Car(100, "blue", "Polo", wheels);
        Movable bike2 = new Bike(50, "green", "Suzuki", bikeWheels);
        Machinary boeing2 = new Boeing("747");



        Car car = new Car(100, "blue", "Polo", wheels);
        Bike bike = new Bike(50, "green", "Suzuki", bikeWheels);
        Boeing boeing = new Boeing("747");

        VehicleProcessor vehicleProcessor = new VehicleProcessor();
        vehicleProcessor.printInfoVehicle(car);

        vehicleProcessor.printInfoVehicle(bike);

//        vehicleProcessor.printInfoBoeing(boeing);

        vehicleProcessor.startMovable(car);
        vehicleProcessor.startMovable(bike);
        vehicleProcessor.startMovable(boeing);

        vehicleProcessor.stopMovable(car);
        vehicleProcessor.stopMovable(bike);
        vehicleProcessor.stopMovable(boeing);

        vehicleProcessor.printMachineryDetails(car);
        vehicleProcessor.printMachineryDetails(bike);
        vehicleProcessor.printMachineryDetails(boeing);

        vehicleProcessor.startMovable(new Movable() {
            @Override
            public void start() {
                System.out.println("Boat has started");
            }

            @Override
            public void stop() {
                System.out.println("Boat has stopped");

            }
        });

    }
}

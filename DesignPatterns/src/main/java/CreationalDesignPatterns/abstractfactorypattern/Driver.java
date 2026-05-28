package CreationalDesignPatterns.abstractfactorypattern;

// Step 7: Client Application
public class Driver {
    public static void main(String[] args) {
        System.out.println("=====Abstract Factory Design Pattern=====");

        // get factory provider
        CarFactoryProvider factoryProvider = new CarFactoryProvider();

        // get economy car factory
        CarFactory economyCarFactory = factoryProvider.getFactory(CarType.ECONOMY, "MARUTI");

        // get luxury car factory
        CarFactory luxuryCarFactory = factoryProvider.getFactory(CarType.LUXURY, "SKODA");

        // produce cars
        economyCarFactory.produceCompleteVehicle();
        luxuryCarFactory.produceCompleteVehicle();
    }
}

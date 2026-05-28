package CreationalDesignPatterns.abstractfactorypattern;

// Step 4: Abstract Factory interface
public interface CarFactory {
    CarInterior createInterior();

    CarExterior createExterior();

    default void produceCompleteVehicle() {
        System.out.println("Starting complete vehicle production...");

        // create all components
        CarInterior carInterior = createInterior();
        CarExterior carExterior = createExterior();

        // assemble the vehicle
        carInterior.addInteriorComponents();
        carExterior.addExteriorComponents();

        System.out.println("Vehicle production completed!");
    }
}

package CreationalDesignPatterns.abstractfactorypattern;

// Step 6: Factory Provider
public class CarFactoryProvider {
    public CarFactory getFactory(CarType type, String brand) {
        switch (type) {
            case ECONOMY -> {
                return new EconomyCarFactory(brand);
            }
            case LUXURY -> {
                return new LuxuryCarFactory(brand);
            }
            default -> throw new IllegalArgumentException("Unknown car type: " + type);
        }
    }
}

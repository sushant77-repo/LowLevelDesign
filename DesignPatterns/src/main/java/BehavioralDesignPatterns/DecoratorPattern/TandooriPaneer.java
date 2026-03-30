package BehavioralDesignPatterns.DecoratorPattern;

// Define the concrete component
public class TandooriPaneer implements BasePizza {
    @Override
    public String getDescription() {
        return "Tandoori Paneer Pizza";
    }

    @Override
    public double getCost() {
        return 400;
    }
}

package BehavioralDesignPatterns.DecoratorPattern;

// Define the concrete component
public class Farmhouse implements BasePizza {
    @Override
    public String getDescription() {
        return "Farmhouse Pizza";
    }

    @Override
    public double getCost() {
        return 300;
    }
}

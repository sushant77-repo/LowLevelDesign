package BehavioralDesignPatterns.DecoratorPattern;

// Define the concrete component
public class PlainPizza implements BasePizza {
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
        return 200;
    }
}

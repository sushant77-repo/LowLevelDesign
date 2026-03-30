package BehavioralDesignPatterns.DecoratorPattern;

// Define the Concrete Decorator
public class ExtraCheeseTopping extends ToppingDecorator {

    public ExtraCheeseTopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription() + " + Extra Cheese";
    }

    @Override
    public double getCost() {
        return basePizza.getCost() + 20;
    }
}

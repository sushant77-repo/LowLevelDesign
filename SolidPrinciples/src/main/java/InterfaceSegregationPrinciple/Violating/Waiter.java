package InterfaceSegregationPrinciple.Violating;

// BAD: This class violates ISP(clients shouldn't depend on unused interfaces)
// Bloated class with empty or error-throwing methods
// This Waiter is forced to implement methods it doesn't need
public class Waiter implements RestaurantEmployee{
    @Override
    public void takeOrder() {
        System.out.println("Taking order..");
    }

    @Override
    public void serveFood() {
        System.out.println("Serving food..");
    }

    @Override
    public void prepareFood() {
        // Forced to implement but doesn't make sense for a waiter
        throw new AssertionError("Waiter cannot prepare food");
    }

    @Override
    public void cleanTheKitchen() {
        // Forced to implement but doesn't make sense for a waiter
        throw new AssertionError("Waiter cannot clean the kitchen");
    }
}

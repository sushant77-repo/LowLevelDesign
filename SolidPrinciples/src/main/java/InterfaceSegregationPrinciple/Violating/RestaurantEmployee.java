package InterfaceSegregationPrinciple.Violating;

// BAD: This class violates ISP
// This is a fat interface
// One large interface forcing all implementers to define unused methods
public interface RestaurantEmployee {
    void takeOrder();

    void serveFood();

    void prepareFood();

    void cleanTheKitchen();
}

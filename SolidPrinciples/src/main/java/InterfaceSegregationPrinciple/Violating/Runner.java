package InterfaceSegregationPrinciple.Violating;

// Demonstrates violation of ISP
public class Runner {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        // works fine
        waiter.takeOrder();
        waiter.serveFood();

        // throws exception
        waiter.prepareFood(); // forced implementation
        waiter.cleanTheKitchen(); // forced implementation
    }
}

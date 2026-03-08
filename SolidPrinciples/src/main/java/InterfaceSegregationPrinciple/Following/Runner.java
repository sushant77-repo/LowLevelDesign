package InterfaceSegregationPrinciple.Following;

// Demonstrates ISP compliance
public class Runner {
    public static void main(String[] args) {
        // Create the objects
        // Now classes only implement what they actually support
        Waiter waiter = new Waiter();
        Chef chef = new Chef();

        // Use the objects
        // This works perfectly - no forced implementations
        waiter.takeOrder();
        waiter.serveFood();

        // This works perfectly - no forced implementations
        chef.prepareFood();
    }
}

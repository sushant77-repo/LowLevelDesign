package InterfaceSegregationPrinciple.Following;

// GOOD: This class follows ISP
// Now classes only implement what they actually need - Clean
public class Waiter implements WaiterTasks{
    @Override
    public void takeOrder() {
        System.out.println("Taking order...");
    }

    @Override
    public void serveFood() {
        System.out.println("Serving food...");
    }
}

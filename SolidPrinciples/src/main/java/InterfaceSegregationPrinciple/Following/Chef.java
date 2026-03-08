package InterfaceSegregationPrinciple.Following;

// GOOD: This class follows ISP
// Now classes only implement what they actually need - Clean
public class Chef implements ChefTasks{
    @Override
    public void prepareFood() {
        System.out.println("Preparing food...");
    }
}

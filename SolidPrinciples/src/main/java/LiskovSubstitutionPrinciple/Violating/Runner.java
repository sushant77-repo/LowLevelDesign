package LiskovSubstitutionPrinciple.Violating;

// Usage example - demonstrates the LSP violations
public class Runner {
    public static void main(String[] args) {
        // Create the objects
        Bike motorcycle = new Motorcycle("TVS", false, 0);
        Bike bicycle = new Bicycle("Hero", true, 0);

        // Use th objects
        // Works fine with MotorCycle - implements all Bike class behavior
        motorcycle.turnOnEngine();
        motorcycle.accelerate();
        motorcycle.brake();
        motorcycle.turnOffEngine();

        // Client expects to be able to see the same behavior with Bicycle
        bicycle.turnOnEngine(); // fails to implement Bike class behavior
        bicycle.accelerate();
        bicycle.brake();
        bicycle.turnOffEngine(); // fails to implement Bike class behavior
    }
}

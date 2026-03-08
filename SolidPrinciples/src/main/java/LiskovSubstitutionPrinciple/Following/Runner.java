package LiskovSubstitutionPrinciple.Following;

// Demonstrates LSP-compliant design
public class Runner {
    public static void main(String[] args) {
        // Create the objects
        Motorcycle motorcycle = new Motorcycle("TVS", false, 0);
        Bicycle bicycle = new Bicycle("Hero", true, 0);

        // Use the objects
        // Works fine with MotorCycle - implements all Bike class behavior
        motorcycle.turnOnEngine();
        motorcycle.accelerate();
        motorcycle.brake();
        motorcycle.turnOffEngine();

        // Works fine with Bicycle - implements all Bike class behavior
        bicycle.accelerate();
        bicycle.brake();
    }
}

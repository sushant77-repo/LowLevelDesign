package LiskovSubstitutionPrinciple.Violating;

// This class violates LSP!
public class Bicycle implements Bike {
    String company;
    boolean hasGear;
    int speed;

    public Bicycle(String company, boolean hasGear, int speed) {
        this.company = company;
        this.hasGear = hasGear;
        this.speed = speed;
    }

    // LSP Violation: Strengthening preconditions
    // Bicycle changes the behavior of turnOnEngine
    @Override
    public void turnOnEngine() {
        throw new AssertionError("Bicycle has no engine!");
    }

    // Bicycle changes the behavior of turnOffEngine
    @Override
    public void turnOffEngine() {
        throw new AssertionError("Bicycle has no engine!");
    }

    @Override
    public void accelerate() {
        this.speed += 30;
        System.out.println("Bicycle speed: " + this.speed);
    }

    @Override
    public void brake() {
        this.speed -= 30;
        System.out.println("Bicycle speed: " + this.speed);
    }
}

package LiskovSubstitutionPrinciple.Following;

// GOOD: Following LSP
// Subclass of Bike - implements all Bike class behavior
// As Bicycles do not have engines, we need not implement Engine interface
public class Bicycle extends Bike {
    String company;
    boolean hasGear;
    int speed;

    public Bicycle(String company, boolean hasGear, int speed) {
        this.company = company;
        this.hasGear = hasGear;
        this.speed = speed;
    }

    @Override
    void accelerate() {
        this.speed += 30;
        System.out.println("Bicycle speed: " + this.speed);
    }

    @Override
    void brake() {
        this.speed -= 30;
        System.out.println("Bicycle speed: " + this.speed);
    }
}

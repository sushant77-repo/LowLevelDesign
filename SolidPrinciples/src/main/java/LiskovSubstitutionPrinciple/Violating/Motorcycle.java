package LiskovSubstitutionPrinciple.Violating;

// Subclass of Bike - implements all Bike class behavior
public class Motorcycle implements Bike {
    String company;
    boolean isEngineOn;
    int speed;

    public Motorcycle(String company, boolean isEngineOn, int speed) {
        this.company = company;
        this.isEngineOn = isEngineOn;
        this.speed = speed;
    }

    @Override
    public void turnOnEngine() {
        System.out.println("Starting the engine..");
        this.isEngineOn = true;
    }

    @Override
    public void turnOffEngine() {
        System.out.println("Stoping the engine..");
        this.isEngineOn = false;
    }

    @Override
    public void accelerate() {
        this.speed += 30;
        System.out.println("Motorcycle speed: " + this.speed);
    }

    @Override
    public void brake() {
        this.speed -= 30;
        System.out.println("Motorcycle speed: " + this.speed);
    }
}

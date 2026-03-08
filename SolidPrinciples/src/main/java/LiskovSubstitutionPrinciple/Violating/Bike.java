package LiskovSubstitutionPrinciple.Violating;

// BAD: This design violates LSP
public interface Bike {
    void turnOnEngine();

    void turnOffEngine();

    void accelerate();

    void brake();
}

package CreationalDesignPatterns.factorymethodpattern;

// Step 4: Abstract Creator class
public abstract class ShapeFactory {
    // Factory method - to be implemented by subclasses
    public abstract Shape createShape();
}

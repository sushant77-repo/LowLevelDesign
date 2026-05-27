package CreationalDesignPatterns.factorymethodpattern;

// Step 6: Concrete Creator class
public class CircleCreator extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}

package CreationalDesignPatterns.factorymethodpattern;

// Step 5: Concrete Creator class
public class SquareCreator extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}

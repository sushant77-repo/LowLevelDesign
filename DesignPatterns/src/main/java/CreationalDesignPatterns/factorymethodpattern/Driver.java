package CreationalDesignPatterns.factorymethodpattern;

// Step 7: Client code demonstration
public class Driver {
    public static void main(String[] args) {
        System.out.println("======= Factory Method Design Pattern ======");

        // set the type you want
        ShapeType shapeType = ShapeType.SQUARE;

        // get the shape
        Shape shape = getShapeInstance(shapeType);

        // perform operations
        shape.computeArea();
        shape.draw();
    }

    private static Shape getShapeInstance(ShapeType shapeType) {
        if (shapeType == null) return null;

        ShapeFactory factory;

        switch (shapeType) {
            case SQUARE -> factory = new SquareCreator();
            case CIRCLE -> factory = new CircleCreator();
            default -> throw new IllegalStateException("ShapeType doesn't exist");
        }

        return factory.createShape();
    }
}

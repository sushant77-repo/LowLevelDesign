package CreationalDesignPatterns.factorymethodpattern;

// Step 3: Concrete Product class Square
public class Square implements Shape {
    @Override
    public void computeArea() {
        System.out.println("Inside Square::computeArea() method...");
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method...");
    }
}

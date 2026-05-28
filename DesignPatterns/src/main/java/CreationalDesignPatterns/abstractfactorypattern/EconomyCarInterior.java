package CreationalDesignPatterns.abstractfactorypattern;

// Step 2: Concrete Products for Economy Car Family
public class EconomyCarInterior implements CarInterior {
    @Override
    public void addInteriorComponents() {
        System.out.println("Adding basic interior components for Economic Car...");
    }
}

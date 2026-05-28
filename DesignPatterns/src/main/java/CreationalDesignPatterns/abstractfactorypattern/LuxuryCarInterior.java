package CreationalDesignPatterns.abstractfactorypattern;

// Step 3: Concrete Products for Luxury Car Family
public class LuxuryCarInterior implements CarInterior {
    @Override
    public void addInteriorComponents() {
        System.out.println("Adding high end interior components for Luxury Car...");
    }
}

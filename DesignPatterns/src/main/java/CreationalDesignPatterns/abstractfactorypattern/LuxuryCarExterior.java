package CreationalDesignPatterns.abstractfactorypattern;

public class LuxuryCarExterior implements CarExterior {
    @Override
    public void addExteriorComponents() {
        System.out.println("Adding high end exterior components for Luxury Car...");
    }
}

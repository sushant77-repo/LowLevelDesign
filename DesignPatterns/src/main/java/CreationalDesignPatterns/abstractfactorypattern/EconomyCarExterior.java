package CreationalDesignPatterns.abstractfactorypattern;

public class EconomyCarExterior implements CarExterior {
    @Override
    public void addExteriorComponents() {
        System.out.println("Adding basic exterior components for Economic Car...");
    }
}

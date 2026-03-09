package DependencyInversionPrinciple;

// Low-level module - concrete implementation
public class WirelessKeyboard implements Keyboard {
    private String connectionType;
    private String company;
    private String modelNumber;

    public WirelessKeyboard(String connectionType, String company, String modelNumber) {
        this.connectionType = connectionType;
        this.company = company;
        this.modelNumber = modelNumber;
    }

    @Override
    public void getSpecifications() {
        System.out.println("===> Wireless Keyboard");
        System.out.println("Connection Type: " + connectionType);
        System.out.println("Company: " + company);
        System.out.println("Model Number: " + modelNumber);
    }
}

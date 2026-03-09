package DependencyInversionPrinciple;

// Low-level module - concrete implementation
public class WirelessMouse implements Mouse {
    private String connectionType;
    private String company;
    private String modelNumber;

    public WirelessMouse(String connectionType, String company, String modelNumber) {
        this.connectionType = connectionType;
        this.company = company;
        this.modelNumber = modelNumber;
    }

    @Override
    public void getSpecifications() {
        System.out.println("===> Wireless Mouse");
        System.out.println("Connection Type: " + connectionType);
        System.out.println("Company: " + company);
        System.out.println("Model Number: " + modelNumber);
    }
}

package SingleResponsibilityPrinciple.Violating;

// Usage demoing SRP violence
public class Runner {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(new Marker("PERMANENT", "BLUE", 20.0, 2026), 10);

        invoice.calculateTotal();
        invoice.saveToDb();
        invoice.printInvoice();
    }
}
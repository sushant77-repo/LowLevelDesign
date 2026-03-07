package SingleResponsibilityPrinciple.Following;

// Good: This class follows SRP by having only one responsibility
public class InvoiceDao {
    private Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    // Responsibility 1: Database Operation
    public void saveToDb() {
        System.out.println("Saving to DB...");
    }
}

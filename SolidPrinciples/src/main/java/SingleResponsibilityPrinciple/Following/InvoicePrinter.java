package SingleResponsibilityPrinciple.Following;

// Good: This class follows SRP by having only one responsibility
public class InvoicePrinter {
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    // Responsibility 1: Printing the invoice
    public void printInvoice() {
        System.out.println("Printing invoice...");
    }
}

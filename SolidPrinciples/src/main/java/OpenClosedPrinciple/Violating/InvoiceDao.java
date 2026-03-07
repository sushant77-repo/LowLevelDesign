package OpenClosedPrinciple.Violating;

import OpenClosedPrinciple.Invoice;

// Responsibility: Managing Database Operations and File Operations
// BAD: This class violates OCP - needs modification for every new kind of save function
public class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    // Database Operation
    public void saveToDb() {
        System.out.println("Saving to DB...");
    }

    // BAD: Every time we add a new save function, we need to modify the existing InvoiceDao class
    public void saveToFile() {
        System.out.println("Saving to File...");
    }
}

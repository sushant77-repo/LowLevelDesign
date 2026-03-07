package OpenClosedPrinciple.Following;

import OpenClosedPrinciple.Invoice;

// Concrete implementation for DatabaseInvoiceDao
// NEW File Save Operation: An extension without modification
public class FileInvoiceDao implements InvoiceDao{
    Invoice invoice;

    public FileInvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public void save() {
        System.out.println("Saving to File...");
    }
}

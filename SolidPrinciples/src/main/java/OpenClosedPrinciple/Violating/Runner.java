package OpenClosedPrinciple.Violating;

import OpenClosedPrinciple.Invoice;
import OpenClosedPrinciple.Marker;

// Usage demoing OCP violence
public class Runner {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(new Marker("PERMANENT", "RED", 22.0, 2025), 15);
        invoice.calculateTotal();

        InvoiceDao invoiceDao = new InvoiceDao(invoice);

        invoiceDao.saveToDb();
        invoiceDao.saveToFile();
    }
}

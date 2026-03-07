package OpenClosedPrinciple.Following;

import OpenClosedPrinciple.Invoice;
import OpenClosedPrinciple.Marker;

// Usage demoing OCP compliance
public class Runner {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(new Marker("PERMANENT", "RED", 22.0, 2025), 15);
        invoice.calculateTotal();

        InvoiceDao databaseInvoiceDao = new DatabaseInvoiceDao(invoice);
        databaseInvoiceDao.save(); // save to DB

        InvoiceDao fileInvoiceDao = new FileInvoiceDao(invoice);
        fileInvoiceDao.save(); // save to File
    }
}

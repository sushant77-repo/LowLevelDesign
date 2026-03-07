package SingleResponsibilityPrinciple.Following;

// Usage demoing SRP compliance
public class Runner {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(new Marker("PERMANENT", "BLUE", 20.0, 2026), 10);
        InvoiceDao invoiceDao = new InvoiceDao(invoice);
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);

        invoice.calculateTotal();
        invoiceDao.saveToDb();
        invoicePrinter.printInvoice();
    }
}
package SingleResponsibilityPrinciple.Violating;

// BAD: This class violates SRP by having multiple responsibilities
public class Invoice {
    private Marker marker;
    private int quantity;
    private Double total;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    // Responsibility 1: Calculating total (business logic)
    public void calculateTotal() {
        this.total = marker.price * this.quantity;
    }

    // Responsibility 2: Database Operation
    public void saveToDb() {
        System.out.println("Saving to DB...");
    }

    // Responsibility 3: Printing the invoice
    public void printInvoice() {
        System.out.println("Printing invoice...");
    }
}

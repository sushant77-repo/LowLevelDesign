package SingleResponsibilityPrinciple.Following;

// Good: This class follows SRP by having only one responsibility
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
}

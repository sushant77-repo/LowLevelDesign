package OpenClosedPrinciple;

public class Invoice {
    private Marker marker;
    private int quantity;
    private Double total;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public void calculateTotal() {
        this.total = marker.price * this.quantity;
    }
}

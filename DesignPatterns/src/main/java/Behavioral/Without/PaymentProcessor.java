package Behavioral.Without;

// A simple payment processor class - bloated with payment logic
public class PaymentProcessor {
    public void processPayment(String type, Double amount) {
        switch (type) {
            case "CREDIT_CARD" -> {
                System.out.println("Paid amount " + amount + " using a credit card");
            }

            case "UPI" -> {
                System.out.println("Paid amount " + amount + " using UPI");
            }

            default -> throw new IllegalStateException("Unexpected value: " + type);
        }
        // Adding another payment method(crypto) requires modifying this class
        // This keeps growing with each new payment method
        // bad design

    }
}

package Behavioral.Without;

public class Driver {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        paymentProcessor.processPayment("CREDIT_CARD", 20.0);
        paymentProcessor.processPayment("UPI", 10.0);
    }
}

package BehavioralDesignPatterns.StrategyPattern.With;

// Concrete implementation - for credit card payment strategy
public class CreditCardPayment implements PaymentStrategy {
    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(Double amount) {
        System.out.println("Paid amount " + amount + " using a credit card");
    }
}

package BehavioralDesignPatterns.StrategyPattern.With;

// Concrete implementation - for UPI payment strategy
public class UpiPayment implements PaymentStrategy {
    private final String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(Double amount) {
        System.out.println("Paid amount " + amount + " using UPI");
    }
}

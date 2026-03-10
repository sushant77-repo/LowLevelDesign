package Behavioral.With;

// Context class - holds reference to a strategy object
public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(Double amount) {
        System.out.println(this.paymentStrategy.getClass().getSimpleName() + " :");
        paymentStrategy.pay(amount);
    }
}

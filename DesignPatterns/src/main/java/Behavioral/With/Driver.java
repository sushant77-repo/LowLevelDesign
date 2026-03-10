package Behavioral.With;

public class Driver {
    public static void main(String[] args) {
        // Create a shopping cart and set payment strategy
        ShoppingCart cart = new ShoppingCart();

        // Choosing payment behavior at runtime
        cart.setPaymentStrategy(new CreditCardPayment("000-111-222"));
        cart.checkout(25.0);

        cart.setPaymentStrategy(new UpiPayment("abc@okxyz"));
        cart.checkout(15.0);

        // Adding another payment method(crypto) is as simple as adding a new strategy class
        // No need to modify existing code - good design
        // cart.setPaymentStrategy(new CryptoPayment("BTC"));
        // cart.checkout(400.0);
    }
}

package BehavioralDesignPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

// Concrete Observable
public class IphoneStockObservable implements StockAvailabilityObservable {
    private final String productId;
    private final String productName;
    private final double price;
    private final List<StockNotificationObserver> stockObservers;
    private int stockQuantity;

    public IphoneStockObservable(String productId, String productName, double price, int stockQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.stockObservers = new ArrayList<>();
        this.stockQuantity = stockQuantity;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    @Override
    public void addStockObserver(StockNotificationObserver observer) {
        this.stockObservers.add(observer);
        System.out.println("[+] " + observer.getUserId() + " subscribed for notifications on " + this.productName);
    }

    @Override
    public void removeStockObserver(StockNotificationObserver observer) {
        this.stockObservers.remove(observer);
        System.out.println("[+] " + observer.getUserId() + " unsubscribed for notifications on " + this.productName);
    }

    @Override
    public void notifyStockObservers() {
        if (stockQuantity > 0 && !stockObservers.isEmpty()) {
            System.out.println("Notifying " + stockObservers.size() + " subscribers...");

            // Create a copy to avoid concurrent modification
            List<StockNotificationObserver> observersToNotify = new ArrayList<>(stockObservers);

            for (StockNotificationObserver observer : observersToNotify) {
                observer.update();
            }
        }
    }

    @Override
    public boolean purchase(int quantity) {
        if (stockQuantity >= quantity) {
            stockQuantity -= quantity;
            System.out.println("PURCHASE SUCCESS: " + quantity + " units of "
                    + productName + " | AVAILABLE STOCK: " + stockQuantity);
            return true;
        } else {
            System.out.println("PURCHASE FAILED: " + quantity + " units of "
                    + productName + " | AVAILABLE STOCK: " + stockQuantity);
            return false;
        }
    }

    @Override
    public void restock(int quantity) {
        boolean wasOutOfStock = stockQuantity == 0;
        stockQuantity += quantity;
        System.out.println("RESTOCKED " + productName + " | Added quantity: "
                + quantity + " | Available stock: " + stockQuantity);
        // Only notify if product was previously out of stock
        if (wasOutOfStock && stockQuantity > 0) {
            notifyStockObservers();
        }
    }
}

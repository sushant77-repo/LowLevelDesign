package BehavioralDesignPatterns.ObserverPattern;

// Observer interface for stock availability notifications
public interface StockNotificationObserver {
    void update();

    String getNotificationMethod();

    String getUserId();
}

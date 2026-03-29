package BehavioralDesignPatterns.ObserverPattern;

// Concrete observer for email notifications
public class PushNotificationObserver implements StockNotificationObserver {
    private final String userId;
    private final String deviceId;

    public PushNotificationObserver(String userId, String deviceId) {
        this.userId = userId;
        this.deviceId = deviceId;
    }

    @Override
    public void update() {
        sendPushNotification();
    }

    private void sendPushNotification() {
        System.out.println("!! PUSH NOTIFICATION sent to: " + deviceId + " - Product is back in stock! Hurry up!!");
    }

    @Override
    public String getNotificationMethod() {
        return "Push Notification";
    }

    @Override
    public String getUserId() {
        return userId;
    }
}

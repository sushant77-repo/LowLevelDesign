package BehavioralDesignPatterns.ObserverPattern;

// Concrete observer for email notifications
public class EmailNotificationObserver implements StockNotificationObserver {
    private final String userId;
    private final String emailId;

    public EmailNotificationObserver(String userId, String emailId) {
        this.userId = userId;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendEmail();
    }

    private void sendEmail() {
        System.out.println("!! EMAIL sent to: " + emailId + " - Product is back in stock! Hurry up!!");
    }

    @Override
    public String getNotificationMethod() {
        return "Email";
    }

    @Override
    public String getUserId() {
        return userId;
    }
}

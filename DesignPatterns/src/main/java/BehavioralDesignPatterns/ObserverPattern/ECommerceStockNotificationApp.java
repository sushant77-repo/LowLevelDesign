package BehavioralDesignPatterns.ObserverPattern;

public class ECommerceStockNotificationApp {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("###### E-commerce Store - Stock Availability Notification Feature Demo ######");

        // create an iPhone product with stock of 10
        StockAvailabilityObservable iPhoneStockObservable =
                new IphoneStockObservable("ip17", "iPhone 17", 1200.0, 10);

        // create observers
        StockNotificationObserver john_push = new PushNotificationObserver("John", "johnDevice1");
        StockNotificationObserver katy_push = new PushNotificationObserver("Katy", "katyDevice1");
        StockNotificationObserver jane_email = new EmailNotificationObserver("Jane", "jane@xyz.com");
        StockNotificationObserver cody_email = new EmailNotificationObserver("Cody", "Cody@xyz.com");

        // Black Friday Sale - Purchase all 10 units
        iPhoneStockObservable.purchase(10);

        // stock unavailability leads to users to subscribe to notifications
        boolean success = iPhoneStockObservable.purchase(1);

        if (!success) {
            // register observers - John, Katy, Jane, Cody subscribe for notifications upon stock availability
            iPhoneStockObservable.addStockObserver(john_push);
            iPhoneStockObservable.addStockObserver(katy_push);
            iPhoneStockObservable.addStockObserver(jane_email);
            iPhoneStockObservable.addStockObserver(cody_email);
        }

        // restock 20 units of iPhone
        iPhoneStockObservable.restock(20);

        // users purchase upon receiving notifications
        iPhoneStockObservable.purchase(1); // John purchases 1 iPhone
        iPhoneStockObservable.purchase(1); // Katy purchases 1 iPhone

        // John and Katy unsubscribe since they purchased
        iPhoneStockObservable.removeStockObserver(john_push);
        iPhoneStockObservable.removeStockObserver(katy_push);

        // NYE Sale - all 18 units sold;
        iPhoneStockObservable.purchase(18);
        iPhoneStockObservable.restock(5); // only Jane and Cody are notified now

        // users purchase upon receiving notifications
        iPhoneStockObservable.purchase(1); // Jane purchases 1 iPhone
        iPhoneStockObservable.purchase(1); // Cody purchases 1 iPhone

        // Jane and Cody unsubscribe since they purchased
        iPhoneStockObservable.removeStockObserver(jane_email);
        iPhoneStockObservable.removeStockObserver(cody_email);
    }
}

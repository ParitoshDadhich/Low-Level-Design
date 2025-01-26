package NotifyMe_observerDesignPattern;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Main class
public class Main {
    public static void main(String[] args) {
        NotifyItem iphone = new IphoneNotifyItemImpl();

        AlertSystem observer1 = new EmailAlertSystem(iphone, "xyz1@gmail.com");
        AlertSystem observer2 = new EmailAlertSystem(iphone, "xyz2@gmail.com");
        AlertSystem observer3 = new MessageAlertSystem(iphone, "123456789");

        iphone.add(observer1);
        iphone.add(observer2);
        iphone.add(observer3);

        iphone.setItem(100); // Stock updated to 100
        iphone.setItem(0);   // Stock updated to 0
        iphone.setItem(200); // Stock updated to 200
    }
}

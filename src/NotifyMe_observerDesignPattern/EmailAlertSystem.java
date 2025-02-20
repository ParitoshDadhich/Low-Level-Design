package NotifyMe_observerDesignPattern;

public class EmailAlertSystem implements AlertSystem {
    private final NotifyItem item;
    private final String emailId;

    public EmailAlertSystem(NotifyItem item, String emailId) {
        this.item = item;
        this.emailId = emailId;
    }

    @Override
    public void update(int newStock) {
        sendEmail(emailId, "Product is in stock: " + newStock + " items available. Hurry up!");
        System.out.println("Current stock: " + newStock);
    }

    private void sendEmail(String emailId, String msg) {
        System.out.println("Mail sent to: " + emailId);
        System.out.println("Message: " + msg);
    }
}

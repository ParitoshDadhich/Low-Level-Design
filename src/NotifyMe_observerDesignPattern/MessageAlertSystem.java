package NotifyMe_observerDesignPattern;

public class MessageAlertSystem implements AlertSystem {
    private final NotifyItem item;
    private final String mobileNumber;

    public MessageAlertSystem(NotifyItem item, String mobileNumber) {
        this.item = item;
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void update(int newStock) {
        sendMessage("ITEM is in stock: " + newStock + " available!", mobileNumber);
        System.out.println("Current stock: " + newStock);
    }

    private void sendMessage(String message, String mobileNumber) {
        System.out.println("Message sent to: " + mobileNumber);
        System.out.println("Message: " + message);
    }
}

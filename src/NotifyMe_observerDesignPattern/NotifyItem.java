package NotifyMe_observerDesignPattern;

public interface NotifyItem {
    void add(AlertSystem item);
    void remove(AlertSystem item);
    void setItem(int item);
    int getItem();
}

package NotifyMe_observerDesignPattern;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IphoneNotifyItemImpl implements NotifyItem {
    /*
    Thread-Safety:
If the system needs to handle concurrent observer registrations or stock updates (e.g., in a real-world e-commerce application), you'll need to make methods like add, remove, and notifyMe thread-safe.
Improvement: Use synchronization or thread-safe collections like ConcurrentHashMap for observingList.
     */
    private final Set<AlertSystem> observingList = ConcurrentHashMap.newKeySet();
    private int itemCount = 0;

    /*
    Scalability:
In large systems with numerous observers, sending synchronous notifications could lead to performance bottlenecks.
Improvement: Consider using asynchronous mechanisms (e.g., ExecutorService) to notify observers.
     */
    private final ExecutorService executor = Executors.newCachedThreadPool(); // For async notifications

    @Override
    public void add(AlertSystem item) {
        observingList.add(item);
    }

    @Override
    public void remove(AlertSystem item) {
        observingList.remove(item);
    }

    @Override
    public void setItem(int newItemCount) {
        if (newItemCount > 0 && itemCount == 0) { // Notify only when stock transitions from 0 to positive
            itemCount = newItemCount;
            this.notifyObservers(newItemCount);
        } else {
            itemCount = newItemCount;
        }
    }

    @Override
    public int getItem() {
        return itemCount;
    }

    private void notifyObservers(int newStock) {
        for (AlertSystem observer : observingList) {
            executor.submit(() -> observer.update(newStock)); // Notify asynchronously
        }
    }
}

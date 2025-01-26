package singletonDesignPattern;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton singleton;
    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance(){
        if(singleton == null){
            singleton = new ThreadSafeSingleton();
        }

        return singleton;
    }

    public void getMessage(){
        System.out.println("Message is showed using ThreadSafeSingleton class implemented with Thread-Safe implementation mechanism!");
    }
}

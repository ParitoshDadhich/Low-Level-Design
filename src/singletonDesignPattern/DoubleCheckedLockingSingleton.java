package singletonDesignPattern;

public class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton(){
        if(instance != null){
            throw new IllegalArgumentException("Instance has already been defined!");
        }
    }

    public static DoubleCheckedLockingSingleton getInstance(){
        if(instance == null){
            synchronized (DoubleCheckedLockingSingleton.class){
                if(instance == null){
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }

        return instance;
    }

    public void getMessage(){
        System.out.println("Message is showed using DoubleCheckedLockingSingleton class implemented with Double-Checked Locking mechanism!");
    }
}

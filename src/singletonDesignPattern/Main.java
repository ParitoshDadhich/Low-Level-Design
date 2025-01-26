package singletonDesignPattern;

public class Main {
    public static void main(String[] args) {
        DoubleCheckedLockingSingleton singleton1 = DoubleCheckedLockingSingleton.getInstance();
        singleton1.getMessage();

        StandardSingleton singleton2 = StandardSingleton.getInstance();
        singleton2.getMessage();

        ThreadSafeSingleton singleton3 = ThreadSafeSingleton.getInstance();
        singleton3.getMessage();

        DependencyInjectionSingleton dependencyInjectionSingleton = new DependencyInjectionSingleton(singleton1);
        dependencyInjectionSingleton.doubleCheckedLockingSingleton.getMessage();

        EnumBaadeSingleton enumSingleton = EnumBaadeSingleton.INSTANCE;
        enumSingleton.getMessage();

        DependencyInjectionSingleton enumDependencyInjectionSingleton = new DependencyInjectionSingleton(enumSingleton);
        enumDependencyInjectionSingleton.enumBaadeSingleton.getMessage();
    }
}

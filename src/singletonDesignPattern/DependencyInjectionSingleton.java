package singletonDesignPattern;

public class DependencyInjectionSingleton {
    StandardSingleton standardSingleton;
    DoubleCheckedLockingSingleton doubleCheckedLockingSingleton;
    ThreadSafeSingleton threadSafeSingleton;
    EnumBaadeSingleton enumBaadeSingleton;

    DependencyInjectionSingleton(StandardSingleton standardSingleton){
        this.standardSingleton = standardSingleton;
    }

    DependencyInjectionSingleton(DoubleCheckedLockingSingleton doubleCheckedLockingSingleton){
        this.doubleCheckedLockingSingleton = doubleCheckedLockingSingleton;
    }

    DependencyInjectionSingleton(ThreadSafeSingleton threadSafeSingleton){
        this.threadSafeSingleton = threadSafeSingleton;
    }

    DependencyInjectionSingleton(EnumBaadeSingleton enumBaadeSingleton){
        this.enumBaadeSingleton = enumBaadeSingleton;
    }

}

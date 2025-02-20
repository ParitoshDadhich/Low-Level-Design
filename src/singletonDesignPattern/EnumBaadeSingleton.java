package singletonDesignPattern;

public enum EnumBaadeSingleton {
    INSTANCE;

    public void getMessage(){
        System.out.println("Message is showed using EnumBaadeSingleton enum implemented with Enum Based Implementation mechanism!");
    }
}

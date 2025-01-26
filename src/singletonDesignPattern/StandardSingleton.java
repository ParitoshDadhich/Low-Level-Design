package singletonDesignPattern;

public class StandardSingleton {
    private static StandardSingleton singletonExample;
    private StandardSingleton(){}

    public static StandardSingleton getInstance(){
        if(singletonExample == null){
            singletonExample = new StandardSingleton();
        }
        return singletonExample;
    }

    public void getMessage(){
        System.out.println("Message is showed using StandardSingleton class implemented with Standard Singleton mechanism!");
    }
}

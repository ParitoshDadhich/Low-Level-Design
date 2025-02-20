package strategyDesignPattern.duck.duckBehaviourInterface.interfaceImpl.quackAlgo;

import strategyDesignPattern.duck.duckBehaviourInterface.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}

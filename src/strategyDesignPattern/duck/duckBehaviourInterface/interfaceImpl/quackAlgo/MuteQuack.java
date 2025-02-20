package strategyDesignPattern.duck.duckBehaviourInterface.interfaceImpl.quackAlgo;

import strategyDesignPattern.duck.duckBehaviourInterface.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}

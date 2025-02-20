package strategyDesignPattern.duck.duckBehaviourInterface.interfaceImpl.flyAlgo;

import strategyDesignPattern.duck.duckBehaviourInterface.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}

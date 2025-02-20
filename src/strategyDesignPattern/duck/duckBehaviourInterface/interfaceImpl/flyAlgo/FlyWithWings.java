package strategyDesignPattern.duck.duckBehaviourInterface.interfaceImpl.flyAlgo;

import strategyDesignPattern.duck.duckBehaviourInterface.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}

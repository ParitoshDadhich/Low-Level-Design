package strategyDesignPattern.duck.duckTypes;

import strategyDesignPattern.duck.duckBehaviourInterface.interfaceImpl.flyAlgo.FlyWithWings;
import strategyDesignPattern.duck.duckBehaviourInterface.interfaceImpl.quackAlgo.Quack;

public class MallardDuck extends Duck{

    // setting fly and quack behaviour type
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm real Mallard duck!");
    }
}

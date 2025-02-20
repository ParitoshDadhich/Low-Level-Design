package strategyDesignPattern.duck.duckTypes;

import strategyDesignPattern.duck.duckBehaviourInterface.interfaceImpl.flyAlgo.FlyNoWay;
import strategyDesignPattern.duck.duckBehaviourInterface.interfaceImpl.quackAlgo.Quack;

public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a Model duck!");
    }
}

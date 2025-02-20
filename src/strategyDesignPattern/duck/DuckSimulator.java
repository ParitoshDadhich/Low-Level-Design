package strategyDesignPattern.duck;

import strategyDesignPattern.duck.duckBehaviourInterface.interfaceImpl.flyAlgo.FlyWithWings;
import strategyDesignPattern.duck.duckTypes.Duck;
import strategyDesignPattern.duck.duckTypes.MallardDuck;
import strategyDesignPattern.duck.duckTypes.ModelDuck;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("************************");

        // setting type of fly and quack behavior at run time
        Duck model = new ModelDuck();
        model.display();
        model.performFly(); // using behavior that was defined in constructor
        model.setFlyBehavior(new FlyWithWings());
        model.performFly(); // used fly behavior that is defined at runtime

    }
}

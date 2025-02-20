package pizza_decoratorDesignPattern;

public class MushorrmDecorator extends DecoratorsPizza{
    MushorrmDecorator(BasePizza pizza){
        super(pizza);
    }

    int cost(){
        return pizza.cost() + 30;
    }
}

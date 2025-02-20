package pizza_decoratorDesignPattern;

public class ExtraCheezDecorator extends DecoratorsPizza{
    ExtraCheezDecorator(BasePizza pizza){
        super(pizza);
    }

    @Override
    int cost() {
        return pizza.cost() + 50;
    }
}

package pizza_decoratorDesignPattern;

public abstract class DecoratorsPizza extends BasePizza{
    BasePizza pizza;
    DecoratorsPizza(BasePizza pizza){
       this.pizza = pizza;
    }
}

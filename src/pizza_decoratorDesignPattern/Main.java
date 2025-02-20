package pizza_decoratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        // Basic margerita pizza
        BasePizza margeritaPizza = new MargeritaPizza();
        System.out.println("Cost of margerita pizza: " + margeritaPizza.cost());

        // margerita pizza + extra cheez
        BasePizza extraCheez_margeritaPizza = new ExtraCheezDecorator(margeritaPizza);
        System.out.println("Cost of extra cheez margerita pizza: " + extraCheez_margeritaPizza.cost());

        // maregita pizza + extra cheez + mushroom
        BasePizza extraCheez_mushroom_margeritaPizza = new MushorrmDecorator(extraCheez_margeritaPizza);
        System.out.println("Cost of extra cheez + Mushroom + margerita pizza: " + extraCheez_mushroom_margeritaPizza.cost());

    }
}

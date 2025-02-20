package bridgeDesignPattern.livingThings;

public class Main {
    public static void main(String[] args) {
        LivingThings dog = new Dog(new LandBreetheProcess());
        dog.breetheProcess();

        LivingThings fish = new Fish(new WaterBreetheProcess());
        fish.breetheProcess();

        LivingThings tree = new Tree(new TreeBreetheProcess());
        tree.breetheProcess();

    }
}

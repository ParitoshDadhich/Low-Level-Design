package bridgeDesignPattern.livingThings;

public class Tree extends LivingThings{
    Tree(BreetheImplementor breetheImplementor) {
        super(breetheImplementor);
    }

    @Override
    void breetheProcess() {
        breetheImplementor.breetheProcess();
    }
}

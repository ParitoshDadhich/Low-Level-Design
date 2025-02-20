package bridgeDesignPattern.livingThings;

public class Fish extends LivingThings{
    Fish(BreetheImplementor breetheImplementor) {
        super(breetheImplementor);
    }

    @Override
    void breetheProcess() {
        breetheImplementor.breetheProcess();
    }
}

package bridgeDesignPattern.livingThings;

public class Dog extends LivingThings{
    Dog(BreetheImplementor breetheImplementor) {
        super(breetheImplementor);
    }

    @Override
    void breetheProcess() {
        breetheImplementor.breetheProcess();
    }
}

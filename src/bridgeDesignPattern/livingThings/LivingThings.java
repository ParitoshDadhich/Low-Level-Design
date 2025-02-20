package bridgeDesignPattern.livingThings;

public abstract class LivingThings {
    protected BreetheImplementor breetheImplementor;
    LivingThings(BreetheImplementor breetheImplementor){
        this.breetheImplementor = breetheImplementor;
    }

    abstract void breetheProcess();
}

package implementare;

public abstract class DecoratorAbstract implements IComanda {
    // campul in decoratorul abstract
    private IComanda comanda;

    // constructor public
    public DecoratorAbstract(IComanda comanda) {
        this.comanda = comanda;
    }

    // metodele implementate - this.comanda.operatie()
    @Override
    public void inchideComanda() {
        this.comanda.inchideComanda();
    }

    @Override
    public void addProdus(float pret) {
        this.comanda.addProdus(pret);
    }

    @Override
    public void printeazaBon() {
        this.comanda.printeazaBon();
    }

    @Override
    public double getTotal() {
        return this.comanda.getTotal();
    }
}

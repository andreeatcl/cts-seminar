package implementare;

public class DecoratorMartie extends DecoratorAbstract {
    // adaugam un camp sau o metoda in plus
    private boolean esteFemeie;

    public DecoratorMartie(IComanda comanda, boolean esteFemeie) {
        super(comanda);
        this.esteFemeie = esteFemeie;
    }

    // suprascriem metodele
    @Override
    public void printeazaBon() {
        if (esteFemeie) {
            System.out.println("** La multi ani! **");
        }
        super.printeazaBon();
    }

    @Override
    public double getTotal() {
        if(esteFemeie) {
            return 0.9 * super.getTotal();
        }
        return super.getTotal();
    }
}

package implementare;

public class ActiuneBursa {
    private String ticker;
    private int stoc;

    public ActiuneBursa(String ticker, int stoc) {
        this.ticker = ticker;
        this.stoc = stoc;
    }

    public void sell(int cantitate) {
        if (cantitate <= this.stoc) {
            this.stoc -= cantitate;
            System.out.println("S-au vandut " + cantitate + " actiuni " + ticker);
        }
        else {
            System.out.println("Stoc insuficient!");
        }
    }

    public void buy(int cantitate) {
        this.stoc += cantitate;
        System.out.println("S-au cumparat " + cantitate + " actiuni " + ticker);
    }
}

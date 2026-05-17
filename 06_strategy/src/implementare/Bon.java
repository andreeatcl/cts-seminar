package implementare;

public class Bon {
    private IStrategy strategie;
    private float total;

    public Bon(float total) {
        this.total = total;
    }

    public void setStrategie(IStrategy strategie) {
        this.strategie = strategie;
    }

    public void inchideBon() {
        if (this.strategie != null) {
            this.strategie.plata(total);
        }
    }
}

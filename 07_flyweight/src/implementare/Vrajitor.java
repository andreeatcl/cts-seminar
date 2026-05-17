package implementare;

public class Vrajitor implements IFlyweight {
    private String denumire;
    private String vraja;

    public Vrajitor(String denumire, String vraja) {
        this.denumire = denumire;
        this.vraja = vraja;
    }

    @Override
    public void pozitionare(int x, int y) {
        System.out.println("Vrajitorul " + denumire + " specialist in vraja " + vraja + " s-a pozitionat la " + x + " " + y);
    }

    @Override
    public void ataca() {
        System.out.println("Vrajitorul " + denumire + " a atacat cu vraja " + vraja);
    }
}

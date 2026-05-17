package implementare;

public class Monstru implements IFlyweight {
    private String denumire;
    private String culoare;

    public Monstru(String denumire, String culoare) {
        this.denumire = denumire;
        this.culoare = culoare;
    }

    @Override
    public void pozitionare(int x, int y) {
        System.out.println("Monstrul " + denumire + " de culoare " + culoare + " s-a pozitionat la " + x + " " + y);
    }

    @Override
    public void ataca() {
        System.out.println("Monstrul " + denumire + " de culoare " + culoare + " a atacat!");
    }
}

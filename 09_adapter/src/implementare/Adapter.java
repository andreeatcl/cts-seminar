package implementare;

public class Adapter implements IEvaluareClientFirmaB {
    IEvaluareClientFirmaA referinta = new EvaluareClientFirmaA();
    @Override
    public void analizaClientFirmaB(Client client) {
        System.out.println("Adapter: ");
        referinta.analizaClientFirmaA(calculeazaCostTotal(client));
    }

    private int calculeazaCostTotal(Client client) {
        int total = 0;
        for (var cost : client.getCostEvenimente()) {
            total += cost;
        }
        return total;
    }
}

package implementare;

public class EvaluareClientFirmaA implements IEvaluareClientFirmaA {
    @Override
    public void analizaClientFirmaA(int costTotalEvenimente) {
        if (costTotalEvenimente > 1000) {
            System.out.println("Firma are discount de 0.1");
        }
    }
}

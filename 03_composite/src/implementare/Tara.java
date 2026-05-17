package implementare;

import java.util.ArrayList;
import java.util.List;

public class Tara implements INod {
    private String denumire;
    private List<INod> listaFii;

    public Tara(String denumire) {
        this.denumire = denumire;
        this.listaFii = new ArrayList<>();
    }

    @Override
    public int getTotalCazuri() {
        int sum = 0;
        for (INod virus : listaFii) {
            sum += virus.getTotalCazuri();
        }
        return sum;
    }

    @Override
    public float getRataMortalitate() {
        throw new UnsupportedOperationException("Aceasta metoda nu este pentru tari!");
    }

    @Override
    public boolean esteSiguraDeVizitat() {
        return this.getTotalCazuri() <= 1000;
    }

    @Override
    public void addNod(INod nod) {
        listaFii.add(nod);
    }

    @Override
    public void removeNode(INod nod) {
        listaFii.remove(nod);
    }

    @Override
    public INod getNode(int index) {
        return listaFii.get(index);
    }
}

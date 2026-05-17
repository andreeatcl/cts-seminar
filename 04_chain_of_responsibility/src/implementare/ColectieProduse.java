package implementare;

import java.util.ArrayList;
import java.util.List;

public class ColectieProduse {
    private List<Produs> listaProduse;
    private String detalii;

    public ColectieProduse(String detalii) {
        this.listaProduse = new ArrayList<>();
        this.detalii = detalii;
    }

    public List<Produs> getListaProduse() {
        return listaProduse;
    }

    public void setListaProduse(List<Produs> listaProduse) {
        this.listaProduse = listaProduse;
    }

    public void addProdus(Produs produs) {
        this.listaProduse.add(produs);
    }

    public void removeProdus(Produs produs) {
        this.listaProduse.remove(produs);
    }

    @Override
    public String toString() {
        return "ColectieProduse{" +
                "listaProduse=" + listaProduse +
                ", detalii='" + detalii + '\'' +
                '}';
    }
}

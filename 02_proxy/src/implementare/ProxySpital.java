package implementare;

import java.util.HashMap;
import java.util.Map;

public class ProxySpital implements ISpital {
    private ISpital spital; // referinta obiectului controlat
    private Map<String, String> vizite;

    // constructor
    public ProxySpital(ISpital spital) {
        this.spital = spital;
        this.vizite = new HashMap<>();
    }

    // override method - adaugam vizitatori daca un pacient nu a fost vizitat
    // trecem neaparat prin metoda accesSpital a spitalului (pacientul x a fost vizitat de y)
    @Override
    public void accesSpital(String vizitator, String pacient) {
        if(vizite.containsKey(pacient)){
            System.out.println("Nu se poate!");
            System.out.println(pacient + " a mai fost vizitat de " + vizite.get(pacient));
        }
        else{
            vizite.put(pacient, vizitator);
            this.spital.accesSpital(vizitator, pacient); //obligatoriu!!!
        }
    }

    public void resetZi() {
        vizite.clear();
    }
}

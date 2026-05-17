package program;

import implementare.*;

public class Main {
    public static void main(String[] args) {
        ColectieProduse colectie = new ColectieProduse("Masini");

        colectie.addProdus(new Produs("Tesla", 100, 3.25f, 10, true, 10));
        colectie.addProdus(new Produs("Suzuki", 150, 3.25f, 0, false, 10));
        colectie.addProdus(new Produs("Golf", 125, 0.00f, 10, true, 0));
        colectie.addProdus(new Produs("Dacia", 200, 3.25f, 10, true, 25));
        colectie.addProdus(new Produs("Tesla2", 100, 3.75f, 10, true, 5));

        IHandler f1 = new FiltrarePret();
        IHandler f2 = new FiltrareRecenzii();
        IHandler f3 = new FiltrarePremium();

        f1.setNextHandler(f2);
        f2.setNextHandler(f3);

        Client client = new Client("Gigel", 150, false, true);
        System.out.println("Colectie inainte de filtrare: " + colectie);
        colectie = f1.filtrareProduse(colectie, client);
        System.out.println("Colectie dupa filtrare: " + colectie);
    }
}
package program;

import implementare.Comanda;
import implementare.DecoratorMartie;
import implementare.IComanda;

public class Main {
    public static void main(String[] args) {
        // comanda decorata
        IComanda comanda=new DecoratorMartie(new Comanda(1), true) ;

        comanda.addProdus(1);
        comanda.addProdus(2);
        comanda.addProdus(4);

        comanda.inchideComanda();
        comanda.printeazaBon();

        System.out.println("Total comanda: " + comanda.getTotal());
    }
}
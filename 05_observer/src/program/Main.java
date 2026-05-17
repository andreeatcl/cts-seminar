package program;

import implementare.Client;
import implementare.IObserver;
import implementare.IServiciuMeteo;
import implementare.ServiciuMeteo;

public class Main {
    public static void main(String[] args) {
        IObserver obs1 = new Client();
        IObserver obs2 = new Client();
        IObserver obs3 = new Client();

        IServiciuMeteo serviciuMeteo = new ServiciuMeteo(10);
        System.out.println("Temperatura fara observers: ");
        serviciuMeteo.setTemperatura(15);

        System.out.println("Temperatura cu observers: ");
        serviciuMeteo.adaugaObserver(obs1);
        serviciuMeteo.adaugaObserver(obs2);
        serviciuMeteo.adaugaObserver(obs3);
        serviciuMeteo.setTemperatura(30);
    }
}
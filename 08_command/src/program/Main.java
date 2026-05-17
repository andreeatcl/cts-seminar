package program;

import implementare.ActiuneBursa;
import implementare.Broker;
import implementare.ComandaBuy;
import implementare.ComandaSell;

public class Main {
    public static void main(String[] args) {
        Broker broker = new Broker("Gigel");

        ActiuneBursa a1 = new ActiuneBursa("AAPL", 500);
        ActiuneBursa a2 = new ActiuneBursa("MSFT", 300);

        broker.addComanda(new ComandaBuy(a1, 200));
        broker.addComanda(new ComandaSell(a1, 400));
        broker.addComanda(new ComandaBuy(a1, 100));
        broker.addComanda(new ComandaSell(a2, 500));

        broker.lansareIntarziata();
    }
}
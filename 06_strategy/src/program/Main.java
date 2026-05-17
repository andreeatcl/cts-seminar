package program;

import implementare.Bon;
import implementare.PlataCard;
import implementare.PlataCash;

public class Main {
    public static void main(String[] args) {
        Bon bon1 = new Bon(40f);
        bon1.setStrategie(new PlataCard());
        bon1.inchideBon();

        bon1.setStrategie(new PlataCash());
        bon1.inchideBon();
    }
}
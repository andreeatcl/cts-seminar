package program;

import implementare.Adapter;
import implementare.Client;
import implementare.IEvaluareClientFirmaB;

public class Main {
    public static void main(String[] args) {
        System.out.println("RESTAURANT B folosind ADAPTER OBIECTE");
        IEvaluareClientFirmaB adapter = new Adapter();
        int[] costuri = new int[]{100,200,300,400,1000};
        Client client = new Client("Gigel",5,costuri);
        adapter.analizaClientFirmaB(client);
    }
}
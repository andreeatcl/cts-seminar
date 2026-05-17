package implementare;

public class FiltrarePremium extends AbstractHandler {
    @Override
    public ColectieProduse filtrareProduse(ColectieProduse colectieProduse, Client client) {
        if (client.isInteresatPremium()) {
            System.out.println("Eliminam produsele care nu sunt premium...");
            for (var produs : colectieProduse.getListaProduse()) {
                if (!produs.isEstePremium()) {
                    // colectieProduse.removeProdus(produs); - concurrent modification exception
                    System.out.println("Am eliminat " + produs.getDenumire());
                }
            }
        }
        System.out.println("S-a filtrat dupa premium!");

        if (this.getNextHandler() != null) {
            return this.getNextHandler().filtrareProduse(colectieProduse, client);
        }

        return colectieProduse;
    }
}

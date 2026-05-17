package implementare;

public class FiltrareRecenzii extends AbstractHandler {
    @Override
    public ColectieProduse filtrareProduse(ColectieProduse colectieProduse, Client client) {
        if (client.isInteresatRecenzii()) {
            System.out.println("Eliminam produsele care au recenzii proaste...");
        }
        System.out.println("S-a filtrat dupa recenzii!");
        if (this.getNextHandler() != null) {
            return this.getNextHandler().filtrareProduse(colectieProduse, client);
        }

        return colectieProduse;
    }
}

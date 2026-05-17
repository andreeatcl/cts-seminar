package implementare;

public interface IHandler {
    ColectieProduse filtrareProduse(ColectieProduse colectieProduse, Client client);
    void setNextHandler(IHandler nextHandler);
    IHandler getNextHandler();
}

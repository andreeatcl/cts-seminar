package implementare;

public class PlataCard implements IStrategy {
    @Override
    public void plata(float suma) {
        System.out.println("Plata card: " + suma + " lei.");
    }
}

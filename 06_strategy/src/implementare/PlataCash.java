package implementare;

public class PlataCash implements IStrategy {
    @Override
    public void plata(float suma) {
        System.out.println("Plata cash: " + suma + " lei.");
    }
}

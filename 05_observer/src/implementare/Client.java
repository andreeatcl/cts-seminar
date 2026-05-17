package implementare;

public class Client implements IObserver {
    @Override
    public void mesaj(float temperatura) {
        System.out.println("Clientul a fost anuntat. Temperatura noua este: " + temperatura);
    }
}

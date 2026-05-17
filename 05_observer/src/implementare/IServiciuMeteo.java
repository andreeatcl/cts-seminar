package implementare;

public interface IServiciuMeteo {
    void adaugaObserver(IObserver observer);
    void eliminaObserver(IObserver observer);
    void notificaObservers(float temperatura);
    void setTemperatura(float temperatura);
}

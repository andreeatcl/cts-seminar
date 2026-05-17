package implementare;

import java.util.ArrayList;
import java.util.List;

public class ServiciuMeteo implements IServiciuMeteo {
    private List<IObserver> observers;
    private float temperatura;

    public ServiciuMeteo(float temperatura) {
        this.observers = new ArrayList<>();
        this.temperatura = temperatura;
    }

    @Override
    public void adaugaObserver(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void eliminaObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notificaObservers(float temperatura) {
        for (var observer : observers) {
            observer.mesaj(temperatura);
        }
    }

    @Override
    public void setTemperatura(float temperatura) {
        if (this.temperatura != temperatura) {
            this.temperatura = temperatura;
        }
        notificaObservers(temperatura);
    }
}

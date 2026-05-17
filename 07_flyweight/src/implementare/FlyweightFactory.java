package implementare;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlyweightFactory {
    private List<IFlyweight> colectie = new ArrayList<>();

    public FlyweightFactory() {
        initColectie();
    }

    public void initColectie() {
        colectie.add(new Monstru("Bzz", "Roz"));
        colectie.add(new Monstru("Zzz", "Gri"));
        colectie.add(new Vrajitor("Ozzy", "Abracadabra"));
        colectie.add(new Monstru("Buzz", "Galben"));
        colectie.add(new Vrajitor("Huzz", "Open Sesame"));
    }

    public IFlyweight getPersonaj() {
        Random rand = new Random();
        return colectie.get(rand.nextInt(colectie.size()));
    }
}

package program;

import implementare.FlyweightFactory;
import implementare.IFlyweight;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        IFlyweight personaj = factory.getPersonaj();
        personaj.pozitionare(20, 40);
        personaj.ataca();
        factory.getPersonaj().pozitionare(20, 50);
        factory.getPersonaj().pozitionare(10, 30);
        factory.getPersonaj().ataca();
    }
}
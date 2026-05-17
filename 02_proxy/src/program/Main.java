package program;

import implementare.ISpital;
import implementare.ProxySpital;
import implementare.Spital;

public class Main {
    public static void main(String[] args) {
        ISpital spital = new ProxySpital(new Spital("Spitalul nr. 9"));

        spital.accesSpital("Gigel", "Pacient 1");
        spital.accesSpital("Ionel", "Pacient 1");
        spital.accesSpital("Fanel", "Pacient 2");
        spital.accesSpital("Ninel", "Pacient 3");

        ((ProxySpital)spital).resetZi();
        System.out.println("\nO noua zi!");
        spital.accesSpital("Costel", "Pacient 2");

    }
}
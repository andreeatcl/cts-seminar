package implementare;

public interface IComanda {
    // interfata pentru obiectul ce va fi decorat
    void inchideComanda();
    void addProdus(float pret);
    void printeazaBon();
    double getTotal();
}

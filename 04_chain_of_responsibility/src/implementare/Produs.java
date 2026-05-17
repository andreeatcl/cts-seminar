package implementare;

public class Produs {
    private String denumire;
    private float pret;
    private float ratingMediu;
    private int nrRecenzii;
    private boolean estePremium;
    private float procentReducere;

    public Produs(String denumire, float pret, float ratingMediu, int nrRecenzii, boolean estePremium, float procentReducere) {
        this.denumire = denumire;
        this.pret = pret;
        this.ratingMediu = ratingMediu;
        this.nrRecenzii = nrRecenzii;
        this.estePremium = estePremium;
        this.procentReducere = procentReducere;
    }

    public String getDenumire() {
        return denumire;
    }

    public float getPret() {
        return pret;
    }

    public float getRatingMediu() {
        return ratingMediu;
    }

    public int getNrRecenzii() {
        return nrRecenzii;
    }

    public boolean isEstePremium() {
        return estePremium;
    }

    public float getProcentReducere() {
        return procentReducere;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                ", ratingMediu=" + ratingMediu +
                ", nrRecenzii=" + nrRecenzii +
                ", estePremium=" + estePremium +
                ", procentReducere=" + procentReducere +
                '}';
    }
}

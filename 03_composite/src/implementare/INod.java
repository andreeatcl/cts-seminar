package implementare;

public interface INod {
    int getTotalCazuri(); // pt toate nodurile
    float getRataMortalitate(); // doar pt nod frunza (virusi)
    boolean esteSiguraDeVizitat(); // doar pt noduri structura (tari)

    void addNod(INod nod);
    void removeNode(INod nod);
    INod getNode(int index);
}

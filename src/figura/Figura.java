package figura;

public interface Figura  extends Comparable<Figura>{

    void translatare(int x, int y);

    void afisare();

    Figura duplicare();

    //TODO Implementeaza o lista

}

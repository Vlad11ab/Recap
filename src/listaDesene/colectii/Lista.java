package listaDesene.colectii;

public interface Lista<T extends Comparable<T>> {

    void addStart(T data);

    void addLast(T data);

    void addPosition(T data, int pos);

    void removeStart();

    void removePosition(int pos);

    void remove(T data);

    void showList();

    int getSize();


}

package listaDesene;

import figura.Figura;
import listaDesene.colectii.Lista;
import listaDesene.colectii.ListaImpl;
import listaDesene.colectii.Node;

import java.util.ArrayList;
import java.util.List;

public class Desen implements Figura, Comparable<Figura> {

    private Lista<Figura> elemente;


    public Desen() {
        this.elemente = new ListaImpl<>();
    }

    public void add(Figura fig) {
        elemente.addLast(fig);
    }

    public void remove(Figura fig) {
        elemente.remove(fig);
    }

    @Override
    public void translatare(int x, int y) {
        Node<Figura> current = elemente.getHead();

        while(current != null){
            current.getData().translatare(x,y);
            current = current.getNext();
        }

    }

    @Override
    public void afisare() {
        System.out.println("Lista desene:");
        elemente.showList();

    }

    @Override
    public Figura duplicare() {
        Desen listaNoua = new Desen();
        Node<Figura> current = elemente.getHead();

        while (current != null){
            listaNoua.add(current.getData().duplicare());
            current = current.getNext();
        }
        return listaNoua;
    }

    @Override
    public int compareTo(Figura object) {
        return 0;
    }

}

package listaDesene;

import figura.Figura;
import listaDesene.colectii.Lista;
import listaDesene.colectii.ListaImpl;

import java.util.ArrayList;
import java.util.List;

public class Desen implements Figura, Comparable<Figura>{

    private Lista<Figura> elemente;


    public  Desen(){
        this.elemente = new ListaImpl<>();
    }

    public void add(Figura fig){
        elemente.addLast(fig);
    }

    public void remove(Figura fig){
        elemente.remove(fig);
    }

    @Override
    public void translatare(int x, int y) {
//        for (Figura fig : elemente){
//            fig.translatare(x,y);
//        }
    }

    @Override
    public void afisare() {
        System.out.println("Lista desene:");
        elemente.showList();

    }

    @Override
    public Figura duplicare() {
        Desen listaNoua = new Desen();


        return listaNoua;
    }

    @Override
    public int compareTo(Figura o) {
        return 0;
    }
}

//TODO: Make it work

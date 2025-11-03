import figura.Cerc;
import figura.Eticheta;
import figura.Figura;
import figura.Punct;
import listaDesene.Desen;
import listaDesene.colectii.Lista;
import listaDesene.colectii.ListaImpl;

public class Main {
    public static void main(String[] args) {

        Punct p1 = new Punct(10,5);
        p1.afisare();
        p1.translatare(1,1);
        p1.afisare();

        System.out.println("========================");

        Desen desen = new Desen();
        Punct punct = new Punct(5,5);
        Cerc cerc = new Cerc(new Punct(5,5),5);
        Eticheta eticheta = new Eticheta(new Punct(5,5),new Punct(5,5), "eticheta");

        desen.add(punct);
        desen.add(cerc);
        desen.add(eticheta);

        desen.afisare();
        System.out.println("---------------");

        desen.remove(eticheta);

        desen.afisare();

        System.out.println("Liste");

        Lista<Figura> figuraLista= new ListaImpl<Figura>();
        figuraLista.addStart(cerc);
        figuraLista.addStart(punct);

        figuraLista.showList();
        figuraLista.getSize();
        figuraLista.removeStart();
        figuraLista.getSize();

        figuraLista.addLast(eticheta);
        figuraLista.showList();
        figuraLista.getSize();

        System.out.print("AddPos");
        figuraLista.addPosition(p1,0);
        figuraLista.removePosition(2);

        System.out.println("---");

        desen.afisare();
        desen.duplicare();
        desen.translatare(2,2);
        desen.afisare();
        desen.add(eticheta);

        Figura listaNoua = desen.duplicare();




        listaNoua.afisare();
        listaNoua.translatare(1,1);




        }
    }

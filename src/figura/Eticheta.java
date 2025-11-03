package figura;

public class Eticheta implements Figura,Comparable<Figura>{
    private Punct p1;
    private Punct p2;
    private String text;


    public Eticheta(Punct p1, Punct p2, String text){
        this.p1 = p1;
        this.p2 = p2;
        this.text = text;
    }

    @Override
    public void translatare(int x, int y) {
        p1.translatare(x,y);
        p2.translatare(x,y);

    }

    @Override
    public void afisare() {
        System.out.println(this);
    }

    @Override
    public Figura duplicare() {
        return new Eticheta(p1,p2,text);
    }

    @Override
    public String toString() {
        return "Eticheta:" + "p1= " + p1 + ", p2= " + p2 + ", text= " + text ;
    }

    @Override
    public int compareTo(Figura o) {
        Eticheta e = (Eticheta) o;
        return e.p1.compareTo(this.p1);
    }
}

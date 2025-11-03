package figura;

public class Cerc implements Figura, Comparable<Figura>{
    private Punct p;
    private int r;


    public Cerc(Punct p, int r){
        this.p = p;
        this.r = r;
    }

    @Override
    public void translatare(int x, int y) {

        p.translatare(x,y);
    }

    @Override
    public void afisare() {
        System.out.println(this);
    }

    @Override
    public Figura duplicare() {
        return new Cerc(p ,r);
    }

    @Override
    public String toString() {
        return "Cerc: " + "p= " + p + ", r= " + r;
    }

    @Override
    public int compareTo(Figura o) {
        Cerc c = (Cerc) o;
        return c.p.compareTo(this.p);
    }
}

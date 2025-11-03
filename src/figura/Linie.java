package figura;



public class Linie implements Figura,Comparable<Figura>{
    private Punct p1;
    private Punct p2;


    public Linie(Punct p1, Punct p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public void translatare(int x, int y) {
        p1.translatare(x, y);
        p2.translatare(x, y);

    }

    @Override
    public void afisare() {
        System.out.println(this);
    }

    @Override
    public  Figura duplicare() {
        return new Linie(p1, p2);
    }

    @Override
    public String toString() {
        return "Linie: " + "p1= " + p1 + ", p2= " + p2;
    }

    @Override
    public boolean equals(Object obj){
        Linie l = (Linie) obj;

        if(l.p1 == p1 && l.p2 == p2){
            return true;
        }
        else return false;

    }

    @Override
    public int compareTo(Figura f){
        Linie l = (Linie) f;
        return l.p1.compareTo(this.p1);
    }
}

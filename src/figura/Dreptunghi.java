package figura;

public class Dreptunghi implements Figura, Comparable<Figura>{
    private Punct p1;
    private Punct p2;


    public Dreptunghi(Punct p1, Punct p2){
        this.p1 = p1;
        this.p2 = p2;
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
        return new Dreptunghi(p1, p2);
    }

    @Override
    public String toString(){
        return "Dreptunghi: " + "p1= " + p1 + "p2= " + p2;
    }

    @Override
    public boolean equals(Object obj){
        Dreptunghi d = (Dreptunghi) obj;

        if(d.p1 != p1 && d.p2 != p2){
            return false;
        }
        else return true;
    }

    @Override
    public int compareTo(Figura f){
        Dreptunghi d = (Dreptunghi) f;
        return d.p1.compareTo(this.p1);
    }
}

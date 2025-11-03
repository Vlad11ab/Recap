package figura;

public class Punct implements Figura ,Comparable<Figura>{
    private int x;
    private int y;


    public Punct(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void translatare(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void afisare() {
        System.out.println(this);
    }

    @Override
    public Figura duplicare() {
        return new Punct(x, y);
    }

    @Override
    public String toString() {
        return "Punct: " + "x= " + x + ", y= " + y;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Punct) {
            Punct p = (Punct) obj;
            if (p.x != x || p.y != y) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int compareTo(Figura f) {
        Punct p = (Punct) f;

        if(p.x == this.x && p.y == this.y){
            return 0;
        }
        else if (p.x > this.x && p.y > this.y){
            return 1;
        }
        else return -1;

    }

}


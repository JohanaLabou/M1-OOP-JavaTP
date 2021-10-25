package td1;

import java.util.Objects;

public class Point {

    private int x;
    private int y;
    private static int cpt;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(Point p2){
        this.x = p2.x;
        this.y = p2.y;
    }

    public int getAbscissePoint(){return this.x;}
    public int getOrdonneePoint(){return this.y;}
    public void setAbscisse(int x){this.x = x;}
    public void setOrdonnee(int y){this.y = y;}

    public boolean isSameAs(Point p){
        return (p.x==this.x) && (p.y==this.y);
    }

    public void translate(int dx, int dy){
        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof Point){
            Point p = (Point) o;
            return (p.x == x && p.y == y);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return x^Integer.rotateLeft(y, 16);
    }
}

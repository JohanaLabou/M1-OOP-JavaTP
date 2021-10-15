package td1;

import java.util.LinkedList;

public class Polyline {
    private LinkedList<Point> list;

    public Polyline(){}

    public Polyline (Point p){
        this.list.add(p);
    }

    public void add(Point p){
        this.list.add(p);
    }

    public int pointCapacity(){
        return this.list.size() ;
    }

    public int nbPoints(){
        int cpt = 0;
        for (Point p: this.list){
            cpt = cpt+1;
        }
        return cpt;
    }

    public boolean contains(Point p){
        for (Point pt: this.list){
            if (pt == p){
                return true;
            }
        }
        return false;
    }
}

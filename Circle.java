package fr.dauphine.javaavance.td1;
import java.lang.Math;

public class Circle {
    private Point center;
    private int radius;

    public Circle(){}

    public Circle (Point center, int radius){
        this.center = center;
        this.radius = radius;
    }

    public String toString(){
        return ("Cercle de centre ("+ center.getAbscissePoint() + ","+ center.getOrdonneePoint()+ "), de rayon "+ radius + " et d'aire égale à "+ this.area() + '\n');
    }

    public void translate (int dx, int dy){
        center.setAbscisse(center.getAbscissePoint()+dx);
        center.setOrdonnee(center.getOrdonneePoint()+dy);
    }

    public Point getCenter(){return this.center;}
    public int getRadius(){return this.radius;}

    public void setRadius(int radius){
        this.radius = radius;
    }

    public double area(){
        return this.radius * Math.PI;
    }

    public boolean contains(Point p){
        double distance = Math.sqrt(Math.pow(center.getAbscissePoint() - p.getAbscissePoint(),2) + Math.pow(center.getOrdonneePoint() - p.getOrdonneePoint(),2));
        return (distance <= radius);
    }
}

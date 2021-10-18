package td1;

public class Ring extends Circle {
    private int innerRadius;

    public Ring(Point p, int radius, int innerRadius){
        super(p, radius);
        if (innerRadius >= getRadius()) {
            int temp = getRadius();
            setRadius(innerRadius);
            this.innerRadius = temp;
        }
        else{
            this.innerRadius = innerRadius;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Ring){
            Ring r = (Ring) obj;
            return ((this.getCenter() == r.getCenter()) && (this.getRadius() == r.getRadius()) && (this.innerRadius == r.innerRadius));
        }
        return false;
    }

    @Override
    public String toString() {
        return ("Anneau de centre (" + getCenter().getAbscissePoint() + "," + getCenter().getOrdonneePoint()+") de rayon " + getRadius()+ " et de rayon interne "+ innerRadius);
    }

    @Override
    public boolean contains(Point p) {
        return super.contains(p);
    }
}

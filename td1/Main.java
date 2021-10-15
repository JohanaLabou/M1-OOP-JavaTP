package td1;

public class Main {
    public static void main(String[] args){

        /*
        Point p1=new Point(1,2);
        Point p2 = p1;
        Point p3 = new Point(1,2);
        //System.out.println("("+p1.x+","+p1.y+")");
         */

        /*
        ArrayList<Point> list = new ArrayList<>();
        list.add(p1);
        System.out.println(list.indexOf(p2));
        System.out.println(list.indexOf(p3));
         */

        //System.out.println(p1==p2);
        //System.out.println(p1==p3);


        /*
        Polyline polyline1 = new Polyline();
        polyline1.add(null);
        System.out.println(polyline1);
         */

        /*
        Point p = new Point(1,2);
        Circle c = new Circle(p,1);

        Point p2 = new Point(1,2);

        Circle c2 = new Circle(p2,2);
        c2.translate(1,1);
        System.out.println(c + "" + c2);
         */

        /*
        Circle c = new Circle(new Point(1,2), 1);
        c.getCenter().translate(1,1);
        System.out.println(c);
         */

        /*
        Circle c = new Circle (new Point (1,3), 1);
        System.out.println(c);
        System.out.println(c.contains(new Point(3,3)));
         */

        Ring ring = new Ring(new Point (1,2), 4, 5);
        System.out.println(ring);
        System.out.println(ring.contains(new Point(7,5)));

    }
}

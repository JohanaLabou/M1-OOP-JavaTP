package td4;

import td1.Circle;
import td1.Point;

import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;

import static java.util.Objects.hash;

public class
Main {
    public static void main(String[] args){






        //Exercice 3

        Map<Point, Circle> m = new HashMap<>();
        td1.Point p1 = new td1.Point(1, 2);
        td1.Circle c1 = new td1.Circle(p1, 100);

        m.put(p1,c1);
        System.out.println(m.containsKey(p1)); //Vrai
        System.out.println(m.containsKey(new td1.Point(1,2))); //Faux
    }
}

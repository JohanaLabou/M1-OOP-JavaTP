package td3.model;

import java.util.List;

public class Model {

    private static List<Circle> listOfCircles;

    public List<Circle> getListOfCircles(){
        return listOfCircles;
    }

    public static void main (String[] arg){
        listOfCircles.add(new Circle(new Point(0,0),5));
    }

}

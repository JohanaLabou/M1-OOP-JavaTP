package td8;

public class Exercice1 {

    public static <E extends Comparable<? super E>> E myMax (E first, E ... others){
        E max = first;
        for (E o: others){
            if (o.compareTo(max) > 0){
                max = o;
            }
        }
        return max;
    }
}

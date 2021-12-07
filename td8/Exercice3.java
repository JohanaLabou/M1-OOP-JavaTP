package td8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Exercice3 {

    //Question 1
    public static <T extends CharSequence> List<Integer> listLength(List<T> list){
        ArrayList<Integer> length = new ArrayList<Integer>();
        for(int i=0; i<list.size(); i++){
            T seq = list.get(i);
            length.add(seq.length());
        }
        return length;
    }

    //Question 2
    public static List<Integer> listLength2(List<? extends CharSequence> list){
        ArrayList<Integer> length = new ArrayList<Integer>();
        for(int i=0; i<list.size(); i++){
            CharSequence seq = (CharSequence) list.get(i);
            length.add(seq.length());
        }
        return length;
    }
}

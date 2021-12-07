package td8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exercice4 {

    //ArrayList
    public static <T>List<T> fusion(List<? extends T> l1, List<? extends T> l2){
        if((l1.size()!= l2.size()) || l1.isEmpty() || l2.isEmpty()){ return Collections.emptyList();}
        List<T> fusion = new ArrayList<>();
        for (int i=0; i<l1.size(); i++){
            fusion.add(i, l1.get(i));
            fusion.add(i+1, l2.get(i));
        }
        return fusion;
    }

    //LinkedList
    public static <T>List<T> fusion1(List<? extends T> l1, List<? extends T> l2){
        if (l1.size()!= l2.size()) {
            throw new IllegalArgumentException();
        }
        if (l1.isEmpty()) return Collections.emptyList();
        List<T> sol = new ArrayList<T>(l1.size());
        Iterator<? extends T> it1 = l1.iterator();
        Iterator<? extends T> it2 = l2.iterator();

        while(it1.hasNext()){
            sol.add(it1.next());
            sol.add(it2.next());
        }
        return sol;
    }


}

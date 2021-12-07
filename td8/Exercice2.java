package td8;

import javax.sound.midi.Sequence;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercice2 {
    public static void print(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main (String[] args){
        List<String> list = Arrays.asList("foo", "toto");
        print(list);


    }

    // Question 3

    private static <T extends CharSequence> void printLength(List<T> list){
        for (CharSequence o:list){
            System.out.println(o.length());
        }
    }

    private static void printLength2(List<? extends CharSequence> list){
        for (CharSequence o:list){
            System.out.println(o.length());
        }
    }
}



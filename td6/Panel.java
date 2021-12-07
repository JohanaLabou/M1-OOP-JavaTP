package td6;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

public class Panel extends AbstractList<Integer> implements Iterable<Integer>
{
    private int upper_bound;
    private int lower_bound;

    public static Iterator<Integer> panel1(int lower, int upper) {
        return new Panel(lower, upper).iterator();
    }

    public static Iterable<Integer> panel2(int lower, int upper) {
        return new Panel(lower, upper);
    }

    public static List<Integer> panel(int lower, int upper) {
        return new Panel(lower, upper);
    }

    public Panel (int lower_bound, int upper_bound)
    {
        if (upper_bound < lower_bound) throw new IllegalArgumentException();

        this.upper_bound = upper_bound;
        this.lower_bound = lower_bound;
    }

    @Override
    public Integer get (int index)
    {
        if (index > (upper_bound - lower_bound)) throw new IndexOutOfBoundsException();

        return lower_bound + index;
    }

    @Override
    public Iterator<Integer> iterator ()
    {
        return new Iterator<Integer>()
        {
            int currentNb = 0;
            @Override
            public boolean hasNext ()
            {
                return (lower_bound + currentNb) <= upper_bound;
            }

            @Override
            public Integer next ()
            {
                return lower_bound + currentNb++;
            }
        };
    }

    @Override
    public int size ()
    {
        return 1 + upper_bound - lower_bound;
    }

    public static void main (String[] args)
    {
        Iterator<Integer> it = new Panel(1, 5).iterator();
        Panel two = new Panel(0, 2);
        List<Integer> panel3 = new Panel(3, 6);


        for (int i: two)
        {
            System.out.println(i);
        }

    }
}

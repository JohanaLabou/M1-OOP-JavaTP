package td4;

public class MyList <T> {
    public Cell first = null;
    private int size;

    public void add(String s){
        Cell c = new Cell (s, first);
        first = c;
        size++;
    }

    public void addLast(String s){
        Cell c = new Cell (s, null);
        if (first == null){
            first = c;
            size++;
        }
        Cell it = first;
        for(int i=0; i<size-1;++i){
            it=it.getNext();
        }
        it.setNext(c);
        size++;
    }

    public T get(int index){
        if (index>=size || size<0){
            throw new IndexOutOfBoundsException();
        }
        Cell it = first;
        for (int i=0; i<index; i++){
            it=it.getNext();
        }
        return (T) it.getData();
    }

    public int sumLetter(){
        int sum = 0;
        Cell<T> it = first;
        for (int i=0; i<size; i++){
            T s= it.getData();
            sum += s.toString().length();
            it.getNext();
        }
        return sum;
    }
}

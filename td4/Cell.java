package td4;

public class Cell <T> {
    private T data;
    private Cell next;

    public Cell (T s, Cell c){
        data = s;
        next = c;
    }

    public T getData(){
        return data;
    }

    public Cell getNext(){
        return next;
    }

    public void setNext(Cell c){
        next = c;
    }
}

package td2;

public class Add implements Expr {
    private Expr v1;
    private Expr v2;

    @Override
    public double eval() {return v1.eval() + v2.eval();}

    public Add(Expr v1, Expr v2){
        this.v1 = v1;
        this.v2 = v2;
    }
}

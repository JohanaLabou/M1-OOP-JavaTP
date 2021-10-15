package td2;

public class Sqrt implements Expr {

    private Expr v;

    @Override
    public double eval() {
        return Math.sqrt(v.eval());
    }

    public Sqrt(Expr v){
        this.v = v;
    }
}

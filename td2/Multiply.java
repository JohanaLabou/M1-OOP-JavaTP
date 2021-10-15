package td2;

public class Multiply implements Expr{
     private Expr m1, m2;

    @Override
    public double eval() {
        return m1.eval()*m2.eval();
    }

    public Multiply(Expr m1, Expr m2){
        this.m1 = m1;
        this.m2 = m2;
    }
}

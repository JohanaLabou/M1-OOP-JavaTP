package td2;

public class Val implements Expr {
    private double v;

    @Override
    public double eval() {return v;}

    public Val (double v){ this.v = v;}
}

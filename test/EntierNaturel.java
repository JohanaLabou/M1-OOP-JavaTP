package test;

public class EntierNaturel {
    private int n;

    public EntierNaturel(int val) throws ErrConst {
        if (val < 0) throw new ErrConst("value should be positive" + val);
        n = val;
    }

    public int getN (){
        return n;
    }

    @Override
    public String toString() {
        return "EntierNaturel = " + n;
    }

    public static EntierNaturel somme(EntierNaturel entier1, EntierNaturel entier2) throws ErrS, ErrConst {
        long s = (long) entier1.getN() + (long) entier2.getN();
        if ( s > Integer.MAX_VALUE){ throw new ErrS (entier1.getN(), entier2.getN());}
        return new EntierNaturel(entier1.getN() + entier2.getN());
    }

    public static EntierNaturel difference(EntierNaturel entier1, EntierNaturel entier2) throws ErrD, ErrConst {
        long s = (long) entier1.getN() - (long) entier2.getN();
        if (s < Integer.MIN_VALUE){ throw new ErrD(entier1.getN(), entier2.getN()); }
        return new EntierNaturel(entier1.getN() - entier2.getN());
    }

    public static EntierNaturel produit (EntierNaturel entier1, EntierNaturel entier2) throws ErrP, ErrConst {
        long s = (long) entier1.getN() * (long) entier2.getN();
        if (s > Integer.MAX_VALUE || s < Integer.MIN_VALUE){ throw new ErrP(entier1.getN(), entier2.getN()); }
        return new EntierNaturel(entier1.getN() * entier2.getN());
    }
}

class ErrConst extends Exception{
    public ErrConst (String s){
        super (s);
    }
}

abstract class ErrOp extends Exception{
    protected int n1, n2;

    public ErrOp(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    public abstract void printMessage();
}

class ErrS extends ErrOp {
    public ErrS (int n1, int n2) {
        super(n1, n2);
    }

    public void printMessage(){
        System.out.println("It is not possible to do sum between "+ n1 + " and "+ n2);
    }
}
class ErrD extends ErrOp {
    public ErrD(int n1, int n2) {
        super(n1, n2);
    }

    public void printMessage() {
        System.out.println("It is not possible to do diffence between " + n1 + " and " + n2);
    }
}

class ErrP extends ErrOp {
    public ErrP(int n1, int n2) {
        super(n1,n2);
    }

    public void printMessage() {
        System.out.println("It is not possible to do product between "+ n1 + " and "+ n2);
    }
}

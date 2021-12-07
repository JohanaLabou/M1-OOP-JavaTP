package test;

public class Main {

    public static void main(String[] args) throws ErrConst {

        try{
            EntierNaturel a = new EntierNaturel(Integer.MAX_VALUE);
            EntierNaturel b = new EntierNaturel(Integer.MAX_VALUE);
            EntierNaturel.produit(a,b);
        } catch(ErrConst e){
            e.printStackTrace();
            //System.out.println(e.getMessage());
        } catch (ErrOp e){
            e.printMessage();
        }
    }
}

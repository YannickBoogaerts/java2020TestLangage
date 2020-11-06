package javaConstructeur;

public class Anc {

    private int nbr = 1;

    { nbr = 2;}

    public Anc(){
        this(3);
    }

    public Anc(int i) {
        super();
        nbr = i;
    }


    protected void test(){
        System.out.println("Anc.test");
    }
}

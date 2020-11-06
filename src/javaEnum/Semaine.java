package javaEnum;

public enum Semaine {
    LUNDI(8),MARDI(8),MERCREDI(8),JEUDI(8),VENDREDI(7),SAMEDI(0),DIMANCHE(0)
    ;
    private int nbrHeure ;

    private Semaine(int nbr){
        this.nbrHeure = nbr;
    }

    public int getNbrHeure() {
        return nbrHeure;
    }
}

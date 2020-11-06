package javaEnum;

import java.util.Arrays;

public class EnumTest {

    public static void main(String[] args) {
        Semaine jour;
        jour = Semaine.MARDI;
        Semaine rendezVous = Semaine.JEUDI;

        if( jour == rendezVous){
            System.out.println("c'est aujourd'hui");
        }else{
            System.out.println(" pas de rendez-vous aujourd'hui");
        }

        // string --> enum
        rendezVous = Semaine.valueOf("VENDREDI");

        // récupérer un tableau de toutes les valeurs
        Semaine[] values = Semaine.values();
        System.out.println(values.length);//7
        System.out.println(Arrays.toString(values));

        // récupérer la position d'un enum
        int ordinal = jour.ordinal();
        System.out.println("position de "+jour+" est "+ ordinal);

        // les enum sont comparables (il implémente l'interface Comparable)
        Comparable<Semaine> x = jour;
        int compare = jour.compareTo(rendezVous);
        System.out.println(compare);

        // on peux ajouter des méthodes et des propriétés aux enums
        System.out.println(rendezVous.getNbrHeure());
    }
}

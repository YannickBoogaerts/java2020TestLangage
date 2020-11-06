package data;

import java.time.LocalDate;
import java.time.Month;

public class PersonneFactory {

    //private static Personne denis = new Personne(7,"Dupont", "Denis", LocalDate.of(2012, Month.MAY, 14));

    public static Personne[] getDataForTest(){
        Personne denis = getDenis();
        return new Personne[]{
                denis,
                new Personne(2,"Durant", "Toto", LocalDate.of(2012, Month.MAY, 14)),
                new Personne(2,"Durant", "Toto", LocalDate.of(2012, Month.MAY, 14)),
                new Personne(3,"Durant", "Dédé", LocalDate.of(2012, Month.MAY, 14)),
                new Personne(4,"Durant", "Louis", LocalDate.of(2012, Month.MAY, 14)),
                new Personne(5,"Durant", "Sophie", LocalDate.of(2013, Month.DECEMBER, 25)),
        };
    }

    public static Personne getDenis() {
        return new Personne(1,"Dupont", "Denis", LocalDate.of(2012, Month.MAY, 14));
    }

    public static Personne getHector() {
        return new Personne(7, "Hector","Denis", LocalDate.of(1825, Month.MAY, 14));
    }
}

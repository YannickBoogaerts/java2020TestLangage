package javaCollection.set;

import data.Position;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String... args) {
        SortedSet<Position> positions = new TreeSet<>(getMyComparator());

        positions.add(new Position(1, 2));
        positions.add(new Position(1, 2));
        positions.add(new Position(2, 1));
        positions.add(new Position(3, 5));
        positions.add(new Position(3, 0));

        for (Position p : positions) {
            System.out.println(p);
        }
    }

    /*   private static Comparator<Position> getMyComparator() {
           return (o1,o2)->{
               int compare = 0;
               compare = o1.getColumn() - o2.getColumn();
               if (compare == 0) {
                   compare = o1.getLine() - o2.getLine();
               }
               return compare;
           };
       }*/
    private static Comparator<Position> getMyComparator() {
        return (o1, o2) -> o1.getColumn() - o2.getColumn() == 0 ? o1.getLine() - o2.getLine() : o1.getColumn() - o2.getColumn();

    }
/*
    private static MyComparator getMyComparator() {
        return new MyComparator();
    }

*/
 /*   private static Comparator<Position> getMyComparator() {
        // classe anonyme interne
        return new Comparator<Position>() {
            @Override
            public int compare(Position o1, Position o2) {
                int compare = 0;
                compare = o1.getColumn() - o2.getColumn();
                if (compare == 0) {
                    compare = o1.getLine() - o2.getLine();
                }
                return compare;
            }
        };
    }

  */


}

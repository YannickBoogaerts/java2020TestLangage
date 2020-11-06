package javaCollection.set;

import data.Position;

import java.util.Comparator;

public class MyComparator implements Comparator<Position> {


    @Override
    public int compare(Position o1, Position o2) {
        int compare = 0;
        compare = o1.getColumn() - o2.getColumn();
        if (compare == 0) {
            compare = o1.getLine() - o2.getLine();
        }
        return compare;
    }

}

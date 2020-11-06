package javaCollection.set;

import data.Position;

import java.util.HashSet;
import java.util.Set;

public class SetTest1 {

    public static void main(String[] args) {

        Position position1 = new Position(3, 4);
        Position position2 = new Position(3, 4);
        System.out.println(position1.hashCode());
        System.out.println(position2.hashCode());

        Set<Position> monSet = new HashSet<>();

        System.out.println(position1.equals(position2));
        System.out.println(position1 == position2);

        System.out.println(monSet.add(position1));
        System.out.println(monSet.add(position2));
        //monSet.add("toto");

        System.out.println(monSet.size());
    }
}

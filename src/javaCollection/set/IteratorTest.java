package javaCollection.set;

import data.Position;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class IteratorTest {

    public static void main(String[] args) {
        HashSet<Position> positions = new LinkedHashSet<>();

        for(int i = 0; i<4; i++){
            positions.add(new Position(i,0));
        }

/*        for(Position p : positions){
            System.out.println(p);
        }
*/
        for(Position p : positions){
            p.setColumn(p.getColumn()+1);
            System.out.println(p);
        }

        System.out.println();
        for(Position p : positions){
            System.out.println(p);
        }

        Iterator<Position> iterator = positions.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for(Iterator<Position> i = positions.iterator();i.hasNext();){
            Position po =i.next();
            System.out.println(po);
        }

    }
}

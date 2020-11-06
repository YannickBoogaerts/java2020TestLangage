package javaCollection.map;

import data.Position;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test1 {

    public static void main(String[] args) {
        Map<String, Position> maMap = new HashMap<>();

        maMap.put("A1",new Position(0,0));
        maMap.put("A2",new Position(1,2));
        maMap.put("A2",new Position(0,1));
        maMap.put("A3",null);

        System.out.println(maMap.size());
        System.out.println(maMap.isEmpty());
        System.out.println(maMap.get("A2"));
        System.out.println(maMap.get("A3"));

        System.out.println(maMap.containsKey("A3"));
        System.out.println(maMap.containsValue(new Position(1,2)));
        System.out.println(maMap.containsValue(new Position(0,1)));

        for(String s : maMap.keySet()){
            System.out.println(s);
        }

        Iterator<String> iterator = maMap.keySet().iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }

        System.out.println();
        Iterator<Position> iterator2 = maMap.values().iterator();
        int col = 0;
        while (iterator2.hasNext() && col == 0){
            Position p = iterator2.next();
            col = p.getColumn();
            System.out.println(p);
        }

        for(Map.Entry e : maMap.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

    }
}

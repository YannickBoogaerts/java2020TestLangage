package javaCollection;

import java.util.AbstractSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class testCopyOnWriteList {

    public static void main(String[] args) {
        CopyOnWriteArrayList<Object> list = new CopyOnWriteArrayList<>();

        list.add("toto");
        list.toArray();

        CopyOnWriteArraySet set = new CopyOnWriteArraySet();
        set.add("toto");
        AbstractSet test;
    }
}

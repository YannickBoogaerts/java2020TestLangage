package javaCollection.collection;


import java.util.*;
import java.util.function.Predicate;

public class CollectionTest<T> {
    Collection<T> collection;

    public CollectionTest(Collection<T> collection) {
        collection = collection;
    }

    public String getCollectionTypeName(){
        StringBuilder builder = new StringBuilder();
        builder.append(collection.getClass().getSimpleName());
        builder.append(" implements ");
        if(collection instanceof Iterable) builder.append("Iterable, ");
        if(collection instanceof Collection) builder.append("Collection, ");
        if(collection instanceof Set) builder.append("Set, ");
        if(collection instanceof SortedSet) builder.append("SortedSet, ");
        if(collection instanceof List) builder.append("List, ");
        if(collection instanceof Queue) builder.append("Queue, ");
        if(collection instanceof Deque) builder.append("Deque, ");

        return builder.toString();
    }

    // methode sur les éléments

    void test_contains(T p) {
        if (collection.contains(p)) {
            System.out.printf("   - La collection contient : %s%n", p);
        } else {
            System.out.printf("   - La collection ne contient pas : %s%n", p);
        }
    }

    public void test_add(T p) {
        try {
            if (collection.add(p)) {
                // Ajout refusé
                System.out.printf("   - accepté : %s%n", p);
            } else {
                // ajout accepté
                System.out.printf("   - refusé  : %s%n", p);
            }

        } catch (NullPointerException e) {
            // la collection refuse les valeur null
            System.out.printf("   - refus de la valeur null%n", p);
        } catch (UnsupportedOperationException e) {
            // la collection n'implémente pas la méthode
            System.out.println("   - la méthode add n'est pas supportée");
        }
    }

    public void test_remove( T p) {
        try {
            if (collection.remove(p)) {
                System.out.printf("   - Suppression réussie pour : %s%n", p);
            } else {
                System.out.printf("   - Suppression ratée pour : %s%n", p);
            }
        } catch (UnsupportedOperationException e) {
            System.out.println("   - la méthode remove n'est pas supportée");
        }

    }

    // utilisation de l'itérateur

    public void test_iterator() {
        Iterator<T> iterator = collection.iterator();
        while (iterator.hasNext()){
            T next = iterator.next();
            System.out.println(next);
        }
    }

    // méthode sur l'ensemble de la Collection

    public void test_size() {
        final int size = collection.size();
        System.out.printf("   - La collection contient : %d éléments%n", size);
    }

    public void test_isEmpty() {
        final boolean empty = collection.isEmpty();
        System.out.println("   - La collection " + (empty ? "est" : "n'est pas") + " vide");
    }

    public void test_containsAll(Collection<T> data) {
        final boolean b = collection.containsAll(data);
        System.out.println("   - La collection " + (b ? "contient" : "ne contient pas") + " tous les éléments de data");
    }

    public void test_addAll(Collection<T> data) {
        try {
            collection.addAll(data);
        } catch (NullPointerException e) {
            System.out.printf("   - addAll refuse la valeur null%n");
        } catch (UnsupportedOperationException e) {
            System.out.println("   - la méthode addAll n'est pas supportée");
        }
    }

    public void test_removeAll(Collection<T> data) {
        try {
            boolean remove = collection.removeAll(data);
            System.out.println("   - removeAll " + (remove ? "a" : "n'a pas") + " supprimer au moins un élément");
        } catch (NullPointerException e) {
            System.out.printf("   - removeAll refuse la valeur null%n");
        } catch (UnsupportedOperationException e) {
            System.out.println("   - la méthode removeAll n'est pas supportée");
        }
    }

    public void test_removeIf(Predicate<? super T> filter) {
        try {
            boolean remove = collection.removeIf(filter);
            System.out.println("   - removeIf " + (remove ? "a" : "n'a pas") + " supprimer au moins un élément");
        } catch (NullPointerException e) {
            System.out.printf("   - removeIf refuse la valeur null%n");
        } catch (UnsupportedOperationException e) {
            System.out.println("   - la méthode removeIf n'est pas supportée");
        }
    }

    public void test_retainAll(Collection<T> data) {
        try {
            boolean remove = collection.retainAll(data);
            System.out.println("   - retainAll " + (remove ? "a" : "n'a pas") + " supprimer au moins un élément");
        } catch (NullPointerException e) {
            System.out.printf("   - retainAll refuse la valeur null%n");
        } catch (UnsupportedOperationException e) {
            System.out.println("   - la méthode retainAll n'est pas supportée");
        }
    }

    public void test_clear() {
        try {
           collection.clear();
        } catch (UnsupportedOperationException e) {
            System.out.println("   - la méthode clear n'est pas supportée");
        }
    }


}

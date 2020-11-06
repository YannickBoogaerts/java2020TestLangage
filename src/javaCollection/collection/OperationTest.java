package javaCollection.collection;


import data.Personne;
import data.PersonneFactory;

import java.util.*;
import java.util.stream.Collectors;

public class OperationTest {

    public static void main(String[] args) {
        testCollection(Arrays.asList(PersonneFactory.getDataForTest()));
        testCollection(new HashSet<Personne>());
        //testCollection(new TreeSet<Personne>());
        testCollection(new LinkedHashSet<Personne>());
        testCollection(new ArrayList<Personne>());
        testCollection(new LinkedList<Personne>());
        testCollection(new ArrayDeque<Personne>());
    }

    public static void testCollection(Collection<Personne> collection) {
        System.out.printf("%n test Collection %s implements %s%n", collection.getClass().getName(),
                getInterfaceName(collection));

        test_isEmpty(collection);
        test_add(collection, PersonneFactory.getDenis());
        test_add(collection, null);
        test_add(collection, PersonneFactory.getDenis());
        test_isEmpty(collection);
        test_size(collection);
        test_addAll(collection, PersonneFactory.getDataForTest());
        test_size(collection);
        testOrdre(collection);
        test_contains(collection, PersonneFactory.getDenis());
        test_contains(collection, PersonneFactory.getHector());
        test_containsAll(collection, Arrays.asList(PersonneFactory.getDataForTest()));
        test_remove(collection, PersonneFactory.getDenis());
        test_remove(collection, PersonneFactory.getHector());
        test_iterator(collection);
    }

    private static void test_iterator(Collection<Personne> collection) {
        Iterator<Personne> iterator = collection.iterator();
        while (iterator.hasNext()){
            Personne next = iterator.next();
            System.out.println(next);
        }
    }

    private static void test_containsAll(Collection<Personne> collection, List<Personne> data) {
        System.out.println("   - La collection " + (collection.containsAll(data) ? "contient" : "ne contient pas") + " tous les éléments de data");
    }

    private static void test_addAll(Collection<Personne> collection, Personne[] dataForTest) {
        Collection<? extends Personne> personnes = Arrays.asList(dataForTest);
        try {
            collection.addAll(personnes);
        } catch (NullPointerException e) {
            System.out.printf("   - addAll refuse la valeur null%n");
        } catch (UnsupportedOperationException e) {
            System.out.println("   - la méthode addAll n'est pas supportée");
        }
    }

    private static void test_isEmpty(Collection<Personne> collection) {
        System.out.println("   - La collection " + (collection.isEmpty() ? "est" : "n'est pas") + " vide");
    }

    private static void test_size(Collection<Personne> collection) {
        System.out.printf("   - La collection contient : %d éléments%n", collection.size());
    }

    private static void test_remove(Collection<Personne> collection, Personne p) {
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

    private static void test_contains(Collection<Personne> collection, Personne p) {
        if (collection.contains(p)) {
            System.out.printf("   - La collection contient : %s%n", p);
        } else {
            System.out.printf("   - La collection ne contient pas : %s%n", p);
        }
    }

    private static String getInterfaceName(Collection<Personne> collection) {
        return Arrays
                .stream(collection.getClass().getInterfaces())
                .map(c -> c.getSimpleName())
                .collect(Collectors.joining(", "));
    }

    private static void testOrdre(Collection<Personne> collection) {
        System.out.print("   - ordre des éléments : ");
        for (Personne p : collection) {
            System.out.print((p != null ? p.getOdre() : "null") + " ");
        }
        System.out.println();
    }

    private static void test_add(Collection<Personne> collection, Personne p) {
        try {
            if (collection.add(p)) {
                System.out.printf("   - accepté : %s%n", p);
            } else {
                System.out.printf("   - refusé  : %s%n", p);
            }

        } catch (NullPointerException e) {
            System.out.printf("   - refus de la valeur null%n", p);
        } catch (UnsupportedOperationException e) {
            System.out.println("   - la méthode add n'est pas supportée");
        }
    }
}

package Lessons.lesson16;

import java.util.TreeSet;

public class TreeSetExp {

    public static void main(String[] args) {

        TreeSet<String> myTreeSet = new TreeSet();

        myTreeSet.add("C");
        myTreeSet.add("D");
        myTreeSet.add("E");
        myTreeSet.add("R");
        myTreeSet.add("G");
        myTreeSet.add("A");
        myTreeSet.add("A");
        myTreeSet.add("L");
        myTreeSet.add("K");

        System.out.println(myTreeSet); // [A, C, D, E, G, K, L, R]
        //отсировал в алфавитном порядке

        TreeSet<Integer> myTreeSetNumbers = new TreeSet();

        myTreeSetNumbers.add(11);
        myTreeSetNumbers.add(23);
        myTreeSetNumbers.add(3);
        myTreeSetNumbers.add(4);
        myTreeSetNumbers.add(9);
        myTreeSetNumbers.add(5);

        System.out.println(myTreeSetNumbers); // [3, 4, 5, 9, 11, 23]
        //отсортировал от меньшего к большему


    }
}

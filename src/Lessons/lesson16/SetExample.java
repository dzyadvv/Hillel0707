package Lessons.lesson16;

import java.util.HashSet;

public class SetExample {

    public static void main(String[] args) {
        HashSet<Integer> myHash = new HashSet<>();

        myHash.add(1);
        myHash.add(2);
        myHash.add(3);

        System.out.println(myHash.contains(1)); // true

        System.out.println("Hashset is empty? - " + myHash.isEmpty()); // false


        // myHash.add(1);
        // не выводится, потому что хэшсет хранит только уникальные значения

        System.out.println("Before remove:");
        for (Integer i : myHash) {
            System.out.print(i + " ");
        }

        myHash.remove(1); // удаляет объект, а не индекс

        System.out.println();
        System.out.println("After remove:");
        for (Integer i : myHash) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println(myHash.contains(1)); // false

        System.out.println(myHash.size()); // 2

        myHash.clear(); // удаляет все эелементы из сета
        System.out.println(myHash.size()); // 0

        System.out.println("Hashset is empty? - " + myHash.isEmpty()); // true
    }
}

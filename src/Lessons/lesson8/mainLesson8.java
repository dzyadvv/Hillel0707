package Lessons.lesson8;

import java.util.Scanner;

public class mainLesson8 {

    int time = 3600; // свойство или поле

    public static void main(String[] args) {
        int n = 9;
        int k = 4;
        int m = n % k;
        System.out.println(m); // 1

        // 9-4=5
        // 5-4=1

        int iYear, twoDiggit;
        iYear = 2013;
        twoDiggit = iYear % 100;
        System.out.println(twoDiggit); // 13


//        // разные объекты
//        Scanner scanner = new Scanner();
//        Scanner scanner1 = new Scanner();
//        Scanner scanner2 = new Scanner();
//        Scanner scanner3 = new Scanner();

    }

    public void sayHello() { // метод
        System.out.println("Hello");
    }


}

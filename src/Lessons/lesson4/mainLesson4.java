package Lessons.lesson4;

import java.util.Scanner;

public class mainLesson4 {
    public static void main(String[] args) {

//        System.out.println("Введите число 12, 24 или 35");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt(); // проинициализировали

//        if (number == 12) {
//            System.out.println("Вы ввели число 12");
//        } else if (number == 24) {
//            System.out.println("Вы ввели число 24");
//        } else if (number == 35) {
//            System.out.println("Вы ввели число 35");
//        } else {
//            System.out.println("Вы ввели неверное число");
//        }

//        switch (number) {
//            case 12:
//                System.out.println("Вы ввели число 12");
//                break;
//            case 24:
//                System.out.println("Вы ввели число 24");
//                break;
//            case 35:
//                System.out.println("Вы ввели число 35");
//                break;
//            default:
//                System.out.println("Вы ввели неверное число");
//        }

//        switch (number) {
//            case 12 -> System.out.println("Вы ввели число 12");
//            case 24 -> System.out.println("Вы ввели число 24");
//            case 35 -> System.out.println("Вы ввели число 35");
//            default -> System.out.println("Вы ввели неверное число");
//        }

//        int[] array1 = {1, 2, 3, 4}; // тип переменной, название, значения
//
//        String[] array2 = {"Hello", "World"};

//        int array2Length = array2.length; // длина массива
//        System.out.println(array2Length);
//
//        int array1Length = array1.length; // длина массива
//        System.out.println(array1Length);

//        // индексация начинается с нуля
//        System.out.println(array1[1]);
//        System.out.println(array2[0]);
//
//        int[] array3 = new int[3]; // пустой массив с длиной 3
//        array3[0] = 5; // обращаемся к нулевому элементу массива и присваиваем ей цыфру 5
//        array3[1] = 66;
//        array3[2] = 58;
//        System.out.println(array3[1]);

        //int = 0
        //String = null
        //boolean = false
        //float, double = 0.0

//        String[] array4 = new String[3];
//        System.out.println(array4[0]);

//        int i = 1;
//        while (i < 8) {
//            System.out.println(i);
//            i++;
//        }

//        int i = 100;
//        while (i>=100){
//            System.out.println("reverse : " + i);
//            i -= 10;
//        }

//        int i = 1;
//        do {
//            i++;
//            System.out.println(i);
//        } while (i < 5);

//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Alex");
//        }

//        for (int i =3; i>= -3; i--) {
//            System.out.println(i + " ");
//        }

        int[] array6 = {2, 3, 4};
        //System.out.println(array6[0]);

//        for (int i = 0; i < array6.length; i++) {
//            System.out.println(array6[i]);
//        }

        for (int temp : array6) {
            System.out.println(temp);
        }

//        for (int i = 5; i >= 1; i--) {
//            System.out.println(i);
//        }

//        int i = 100;
//        while (i >= 10) {
//            System.out.println(i);
//            i -= 10;
//        }

    }
}

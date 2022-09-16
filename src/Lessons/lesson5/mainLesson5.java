package Lessons.lesson5;

import java.util.Arrays;
import java.util.Locale;

public class mainLesson5 {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[3][4];
        twoDimArray[0][0] = 5;
        twoDimArray[0][1] = 4;
        twoDimArray[0][2] = 4;
        twoDimArray[0][3] = 4;

        System.out.println(twoDimArray[0][1]);
        System.out.println(twoDimArray[1][1]);

        int[][] twoDimArray2 = {{2, 5, 7, 13}, {7, 4, 2, 3}, {2, 3, 4, 7}};

        for (int i = 0; i < twoDimArray2.length; i++) { // первый цикл
            for (int j = 0; j < twoDimArray2[i].length; j++) { // цикл внутри первого цикла
                System.out.print(" " + twoDimArray2[i][j] + " ");
            }
            System.out.println();
        }

        int[][] twoDimArray3 = {{2, 5, 7, 13}, {7, 4, 2, 3}, {2, 3, 4, 7}};
        System.out.println(Arrays.deepToString(twoDimArray3));


        sayHello();
        mySum(3, 5);

        int mathOperation = mySum2(10, 2);
        int finalResult = mathOperation + 7;
        System.out.println(finalResult);

        sayNameAndAge("Alex", 33);


        String name = "Hello, i am Alex";
        System.out.println(name.length()); // считает длину строки включая пробел

        String text1 = "Hello";
        String text2 = " I am Maks";
        System.out.println(text1.concat(text2)); // конкатинация строк

        String text3 = "   Hello world    ";
        String text4 = "   Hello world    ";
        System.out.println(text3);
        System.out.println(text4.trim()); // режет пробелы

        String text5 = "Hallo i am Maks";
        boolean end1 = text5.endsWith("Maks");
        boolean end2 = text5.endsWith("Alex");
        System.out.println(end1);
        System.out.println(end2);

        String text6 = "Hello studenTs";
        System.out.println(text6.toUpperCase()); // верхний регистр
        System.out.println(text6.toLowerCase()); // нижний регистр

        String text7 = "Alex";
        String text8 = "Maks";
        System.out.println(text7.equals(text8)); // сравнивает текст

        String text9 = "Hello, i am Alex";
        String text10 = "Alex";
        System.out.println(text9.contains(text10)); // проверяет содерживается ли текст в другом тексте

        String name2 = "Hello, i am Alex";
        System.out.println(name2.charAt(4)); //показывает что содержится в 4 символе

        System.out.println(name2.indexOf("l")); // какой номер у символа в строке
        System.out.println(name2.lastIndexOf("l")); // какой номер у последнего символа в строке

        System.out.println(name2.substring(5)); // отрезает символы
        System.out.println(name2.substring(2, 6)); // отрезает символы между


        String name3 = "Hello, i am Maks";
        System.out.println(name3.replace("Maks", "Igor")); // заменяет символы

        String name4 = "Hello, i am Maks, i am 34";
        System.out.println(name4.replaceAll(",", "!"));

        String text11 = "Hello people";
        char[] arr = text11.toCharArray(); // массив из верхней строки
        System.out.println(arr[2]); // l

        char[] arrChar = {'H', 'e', 'l', 'l', 'o'};
        String temp = null;
        temp = temp.copyValueOf(arrChar);
        System.out.println(temp);


    }

    static void sayHello() {
        System.out.println("Hello world!");
    }

    static void mySum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    static int mySum2(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static void sayNameAndAge(String name, int age) {
        System.out.println(name + " " + age);
    }

}

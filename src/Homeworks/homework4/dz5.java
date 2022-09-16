package Homeworks.homework4;

public class dz5 {
    public static void main(String[] args) {

        /* Необходимо вывести на экран вот такую последовательность чисел с помощью цикла while:
        7 14 21 28 35 42 49 56 63 70 77 84 91 98 */

        int number = 7; // создаем переменную number
        while (number <= 98) { // условие
            System.out.println(number); // выводится значение увеличнной переменной пока не выполнится условие
            number += 7; // увеличение переменной
        }
    }
}

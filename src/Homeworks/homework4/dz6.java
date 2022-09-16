package Homeworks.homework4;

public class dz6 {
    public static void main(String[] args) {

        /* Необходимо вывести на экран вот такую последовательность чисел с помощью цикла while:
        1 2 4 8 16 32 64 128 256 512 */

        int number = 1; // объявляем переменную
        while (number <= 521) { // условие
            System.out.println(number); // выводится значение удвоенной переменной пока не выполнится условие
            number *= 2; // удвоение переменной
        }
    }
}
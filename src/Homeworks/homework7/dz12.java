package Homeworks.homework7;

public class dz12 {
    public static void main(String[] args) {
        /* Вывести ряд чисел от 1 до 100 через пробел, с изменениями:
        - если число кратно 3 то вместо него вывести Hello
        - если число кратно 5 то вместо него вывести World
        - если число кратно и 3 и 5 то вместо него вывести HelloWorld
        */

        for (int i = 1; i <= 100; i++)
            if ((i % 3 != 0) && (i % 5 != 0)) { // числа не кратные "3" или "5"
                System.out.print(i + " "); // выводим ряд чисел через пробел
            } else if ((i % 3 == 0) && (i % 5 == 0)) { // числа не кратные и "3" и "5"
                System.out.print("HelloWorld ");
            } else { // блок альтернативы
                if (i % 3 == 0) {  // число кратно "3"
                    System.out.print("Hello ");
                }
                if (i % 5 == 0) { // число кратно "5"
                    System.out.print("World ");
                }
            }
    }
}
package Homeworks.homework2;

public class Test3 {
    public static void main(String[] args) {

        int nameAlex = 7; // Переменная Alex
        int nameMaks = 9; // Переменная Maks

        nameMaks++; // Постфиксная инкрементация переменной Maks
        int sumName = nameAlex + nameMaks; // Сумма переменных Alex и Maks

        // int sumName = nameAlex + ++nameMaks; // Сумма переменных Alex и Maks (префиксная инкрементация переменной Maks)

        System.out.println("Сумма значений переменных Alex и Maks = " + sumName); // Вывод в консоль суммы Alex и Maks

    }
}

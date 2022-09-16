package Homeworks.homework6;

public class dz10 {
    public static void main(String[] args) {
        for (int lines = 0; lines < 5; lines++) { // кол-во строк, i - количество строк = 5
            for (int gaps = 0; gaps < (5 - lines); gaps++) { // кол-во пробелов перед "*" в каждой строке (5-0, 5-1, 5-2, 5-3, 5-4)
                System.out.print(" "); // пробелы
            }
            for (int stars = 0; stars < (lines + 1); stars++) { // кол-во "*" в каждой строке (0+1, 1+1, 2+1, 3+1, 4+1)
                System.out.print("* "); // звездочки
            }
            System.out.println(); // перенос строки для создания табличной формы
        }

    }
}

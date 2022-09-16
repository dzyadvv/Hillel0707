package Homeworks.homework6;

public class dz11 {
    public static void main(String[] args) {
        for (int lessonNumber = 1; lessonNumber <= 3; lessonNumber++) { // количество уроков (1, 2, 3)
            System.out.println("Это " + lessonNumber + "-ый урок!");
            if (lessonNumber <= 2) { // Условие: выполнены только 1 и 2 домашнее задание
                System.out.println("   Я выполнил все домашние задания " + lessonNumber + "-го урока.");
            } else { // Блок альтернативы
                System.out.println("   Я не выполнил домашние задания " + lessonNumber + "-го урока.");
            }
        }
    }
}

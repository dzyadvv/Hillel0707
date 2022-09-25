package Homeworks.homework17;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        menu();
        String clientInput1 = dopIn();
        String clientInput2 = addIngredient();
        int sum = sumOfOrder(clientInput1, clientInput2);
        System.out.println("Сумма заказа: " + sum + "грн");
    }

    public static void menu() {
        System.out.println("Стоимость бургера = 50грн");
        System.out.println("""
                Дополнительные ингридиенты:\s
                 1. Соус - 10грн
                 2. Сыр - 20грн
                 3. Котлета - 30грн""");
        System.out.println("Укажите дополнительный игридиент или его номер: ");
    }

    public static String dopIn() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String addIngredient() {
        System.out.println("Хотите добавить второй ингридиент?");
        String[] answer = {"Да", "Нет"};
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext(Arrays.toString(answer))) {
            String answer1 = scanner.nextLine();
            String yes = "Да";
            String no = "Нет";
            if (yes.equalsIgnoreCase(answer1)) {
                System.out.println("Укажите дополнительный игридиент или его номер: ");
                return scanner.nextLine();
            } else if (no.equalsIgnoreCase(answer1)) {
                return null;
            } else {
                System.out.println("Введите да или нет");
            }
        }

        return scanner.nextLine();
    }

    public static int sumOfOrder(String clientInput1, String clientInput2) {
        int result = 50;
        for (eMenu c : eMenu.values()) {
            if (c.name().equalsIgnoreCase(clientInput1) | c.getNumber().equalsIgnoreCase(clientInput1)) {
                result += c.getPrice();
            }
            if (c.name().equalsIgnoreCase(clientInput2) | c.getNumber().equalsIgnoreCase(clientInput2)) {
                result += c.getPrice();
            }
        }
        return result;
    }
}
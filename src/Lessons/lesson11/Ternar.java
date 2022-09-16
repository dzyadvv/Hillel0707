package Lessons.lesson11;

public class Ternar {
//    public static void main(String[] args) {
//        String str = "blalblabla?"; // 11 знаков
//        System.out.println(str.length()); // 11
//        System.out.println(str.length() - 1); // 10
//        System.out.println(str.charAt(str.length() - 1)); // ?
//
//    }
//
//    public void check(String str) {
//        var lastChar = str.charAt(str.length() - 1); // charAt - возвращает значение
//        if (lastChar == '?') { // если lastChar = ?
//            System.out.println("Question in the end"); // результат
//        } else {
//            System.out.println("With out question");
//        }
//    }
//}


    public static void main(String[] args) {
        String str = "blalblabla?"; // 11 знаков
        String str2 = "blalblabla"; // 11 знаков
        check(str); // Question in the end
        check(str2); // Without question

        checkWithTernar(str);
        checkWithTernar(str2);

    }

    public static void check(String str) {
        var lastChar = str.charAt(str.length() - 1); // charAt - возвращает значение
        if (lastChar == '?') { // если lastChar = ?
            System.out.println("Question in the end"); // результат
        } else {
            System.out.println("Without question");
        }
    }

    // Тернарный оператор:
    public static void checkWithTernar(String str) {
        var lastChar = str.charAt(str.length() - 1);
        System.out.println(lastChar == '?' ? "Question in the end" : "Without question");

        // <predicate> ? <expression on true> : <expression on false>.
    }
}
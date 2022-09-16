package Lessons.lesson12;

// final class modFinal // нельзя наследовать

public class modFinal {

    // недоступно переопределение для наследника
    final void sayName() {
        System.out.println("Alex");
    }


}

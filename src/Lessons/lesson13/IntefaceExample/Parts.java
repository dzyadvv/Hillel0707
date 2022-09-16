package Lessons.lesson13.IntefaceExample;

public interface Parts {

    void hoodOrder();

    void WheelsOrder();

    void filtersOrder();

    default void countWheels() {
        System.out.println("4");
    }
}

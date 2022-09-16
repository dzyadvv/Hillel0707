package Lessons.lesson11;

public class TestThis {

    // поля класса:
    int num = 10;
    int num2 = 30;

    // Метод
    public void main(String[] args) {
        int num = 20;

        System.out.println(num); // 20
        System.out.println(this.num); // this - который относится к главному объекту = 10
        // this это ссылка на поле
        System.out.println(num2); // 30

    }
}

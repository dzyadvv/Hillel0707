package Lessons.lesson14.exceptions.myException;

public class myException extends Exception {
    private int detail;

    public myException(int detail, String message) {
        super(message);
        this.detail = detail;
    }

    @Override
    public String toString() { // позволяет преобразовать объект в стринговый вид
        return "myException{" +
                "detail=" + detail +
                " " + getMessage() +
                '}';
    }
}

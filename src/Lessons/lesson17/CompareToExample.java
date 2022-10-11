package Lessons.lesson17;

public class CompareToExample {
    public static void main(String[] args) {
        String strSample = "a";
        System.out.println("Compare to 'a' b is " + strSample.compareTo("b")); // -1

        strSample = "b";
        System.out.println("Compare to 'a' b is " + strSample.compareTo("a")); // 1

        strSample = "b";
        System.out.println("Compare to 'a' b is " + strSample.compareTo("b")); // 0

        //a
        //b
        //a-b , b ниже а, -1
        //b-a, a выше b, 1
        //a-a, 0

        
    }
}

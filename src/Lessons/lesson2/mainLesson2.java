package Lessons.lesson2;

public class mainLesson2 {

    public static void main(String[] args) {
        int k = 10;
        System.out.println(k);

        int m;
        m = 2 + 7;
        System.out.println(m);

        int l = 2;
        //  l = l + 2;
        l += 2;
        System.out.println(l);

        int n = 2;
        n++; // n+1=3
        System.out.println(n);

        int g = 2;
        g--; // g-1=1
        System.out.println(g);

        System.out.println("---------------");
        int t = 2;
        int r = 2;
        int a = 2 * t++;
        int b = 2 * ++r;
        System.out.println(a); //4
        System.out.println(t); //3
        System.out.println(b); //6
        System.out.println(r); //3
    }
}

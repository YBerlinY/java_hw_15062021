package hw2;

public class MainClass {
    public static void main(String[] args) {

        boolean z = method1(3, 76);
        System.out.println(z);

        String x = method2(-58);
        System.out.println("Данное число: " + x);

        boolean y = method3(-126);
        System.out.println(y);

        method4("Hello GeekBrains", 3);

        boolean w=method4(2021);
        System.out.println(w);


    }

    public static boolean method1(int a, int b) {
        if (10 <= a + b && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static String method2(int c) {
        if (0 <= c) {
            return "Положительное";
        } else {
            return "Отрицательное";
        }
    }

    public static boolean method3(int d) {
        if (d < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void method4(String e, int f) {
        for (int i = 0; i < f; i++) {
            System.out.println(e);
        }
    }

    public static boolean method4(int j) {
        if (j % 4 == 0 && j % 100 != 0 || j % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

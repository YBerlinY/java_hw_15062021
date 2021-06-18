package hw1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();


    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    public static void checkSumSign() {
        int a=-9;
        int b=7;
        if (a+b>0){
            System.out.println("Сумма положительная");
        }else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value= 104;
        if (value<=0){
            System.out.println("Красный");
        }else if (0<value && value<=100){
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }

    }
    public static void compareNumbers() {
        int a=35;
        int b=27;
        if (a>=b){
            System.out.printf("%d>=%d",a,b);
        }else{
            System.out.printf("%d<%d",a,b);
        }
    }
}

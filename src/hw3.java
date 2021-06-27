import java.util.Arrays;

public class hw3 {

    public static void main(String[] args) {

        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Задание №1 данный массив: " + Arrays.toString(arr1));
        replacingElements(arr1);
        System.out.println("Задание №1 итоговый массив: " + Arrays.toString(arr1));
        System.out.println("");

        int[] arr2 = new int[100];
        fillingInTheArray(arr2);
        System.out.println("Задание №2 итоговый массив: " + Arrays.toString(arr2));
        System.out.println("");

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Задание №3 данный массив: " + Arrays.toString(arr3));
        multiplication(arr3);
        System.out.println("Задание №3 итоговый массив: " + Arrays.toString(arr3));
        System.out.println("");

        System.out.println("Задание №4 итоговый массив: ");
        int[][] arr4 = new int[7][7];
        diagonal(arr4);
        System.out.println("");

        int len = (int) (Math.random() * 10);
        int initialValue = (int) (Math.random() * 100);
        int[] arr5 = new int[len];
        creatingAnArray(len, initialValue, arr5);
        System.out.println("Задание №5 итоговый массив: " + Arrays.toString(arr5));
        System.out.println("");

        int[] arr6 = {12, 25, 6, 9, 65, 97, 48, 5, 98, 63, 3, 7, 2, 57, 3, 14};
        int min = arr6[0];
        int max = arr6[0];
        int maxFin = arr6Max(arr6, max);
        int minFin = arr6Min(arr6, min);
        System.out.println("Задание №6");
        System.out.println("Минимальное число из массива: " + minFin);
        System.out.println("Максимальное число из массива: " + maxFin);
        System.out.println("");

        System.out.println("Задание №7");
        int[] arr7 = {14, 25, 6, 9, 65, 97, 48, 5, 98, 65};
        float summ = summArr(arr7);
        boolean balance = checkBalance(arr7, summ);
        System.out.println(balance);


    }

    public static int[] replacingElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }

    public static int[] fillingInTheArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }


    public static int[] multiplication(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        return arr;
    }

    public static void diagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || i + j == arr.length - 1) {
                    arr[i][j] = 1;
                }
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] creatingAnArray(int len, int initialValue, int[] arr) {
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static int arr6Max(int[] arr, int max) {
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int arr6Min(int[] arr, int min) {
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }

        }

        return min;
    }

    public static float summArr(int[] arr) {
        float summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
        }
        return summ;
    }

    public static boolean checkBalance(int[] arr, float summ) {

        int midle = 0;
        for (int i = 0; i < arr.length; i++) {
            midle += arr[i];
            if (midle == summ / 2) {
                break;
            }
        }
        return midle == summ / 2 ;
    }

}






package mod2.hw2l;


//1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, при подаче массива другого
// размера необходимо бросить исключение MyArraySizeException.
//
// 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. Если в каком-то
// элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть
// брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
//
// 3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и
// MyArrayDataException, и вывести результат расчета.
public class AppHw2l {
    public static void main(String[] args) {
        final AppHw2l appHw2l = new AppHw2l();

        String[][] arr = {{"5", "1", "2", "4"},
                {"55", "7", "2", "44",},
                {"15", "7", "5", "41"},
                {"7", "5", "7", "6"}};

        int[][] arr1 = new int[4][4];


        int finalSumm = appHw2l.array(arr, arr1);
        System.out.println("Сумма всех чисел массива :" + finalSumm);

    }

    private int array(String[][] arr, int[][] arr1) {
        int summ = 0;
        if (arr.length != 4) {
            throw new MyArraySizeExceptionl();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i].length != 4) {
                    throw new MyArraySizeExceptionl();
                }
                try {
                    arr1[i][j] = Integer.parseInt(arr[i][j]);
                    summ += arr1[i][j];
                }catch (Exception e){
                    throw new MyArrayDataExceptionl(i,j,arr[i][j]);
                }
            }

        }

        return summ;
    }
}
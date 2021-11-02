package mod2.lesson2.hw2;

public class MyArraySizeException extends RuntimeException {
    private static final String MSG = "Ошибка: MyArraySizeException!\n Размер массива НЕ 4x4";

    public MyArraySizeException() {
        super(String.format(MSG));
    }
}

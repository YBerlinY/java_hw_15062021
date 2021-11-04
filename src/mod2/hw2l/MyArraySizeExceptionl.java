package mod2.hw2l;

public class MyArraySizeExceptionl extends RuntimeException {
    private static final String MSG = "Ошибка: MyArraySizeException!\n Размер массива НЕ 4x4";

    public MyArraySizeExceptionl() {
        super(String.format(MSG));
    }
}

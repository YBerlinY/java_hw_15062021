package mod2.lesson2.hw2;

public class MyArrayDataException extends RuntimeException{
    private static final String MSG="Ошибка: MyArrayDataException!\n Неверные данные лежат в ячейке: arr[%d][%d]\n" +
            " Неверное значение: %s";
    public MyArrayDataException(int i,int j,String s){
        super(String.format(MSG,i,j,s));

    }

}

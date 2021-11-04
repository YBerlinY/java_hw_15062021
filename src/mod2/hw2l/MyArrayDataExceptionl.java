package mod2.hw2l;

public class MyArrayDataExceptionl extends RuntimeException{
    private static final String MSG="Ошибка: MyArrayDataException!\n Неверные данные лежат в ячейке: arr[%d][%d]\n" +
            " Неверное значение: %s";
    public MyArrayDataExceptionl(int i,int j,String s){
        super(String.format(MSG,i,j,s));

    }


}
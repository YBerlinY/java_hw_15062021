package mod2.lesson3.hw3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
//        из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.
//
//2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
//        В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер
//        телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
//        тогда при запросе такой фамилии должны выводиться все телефоны.

//   Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись
//        добавлять еще дополнительные поля (имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.).
//        Консоль желательно не использовать (в том числе Scanner), тестировать просто из метода main() прописывая add() и get().
public class AppHw3 {
    public static void main(String[] args) {
        T1();
        T2();

    }

    private static void T1() {
        Map<String, Integer> s = new HashMap<>();
        String[] words = {
                "monday", "thursday", "monday",
                "friday", "friday", "monday",
                "friday", "tuesday", "sunday",
                "friday", "monday", "wednesday",
                "saturday", "friday", "saturday",
                "monday", "saturday", "sunday",
                "saturday", "sunday"
        };

        for (int i = 0; i < words.length; i++) {
            if (s.containsKey(words[i]))
                s.put(words[i], s.get(words[i]) + 1);
            else
                s.put(words[i], 1);
        }
        System.out.println(s);

    }
    private static void T2() {
        Phonebook  directory = new Phonebook ();

        directory.add("Eremin", "8(926)715-9863");
        directory.add("Logunova", "8(916)349-8647");
        directory.add("Lapygina", "8(916)964-8596");
        directory.add("Lapygina", "8(926)354-9873");
        directory.add("Eremin", "8(903)167-9857");
        directory.add("Sherbakov", "8(905)349-6189");
        directory.add("Eremin", "8(903)467-9825");
        directory.add("Sherbakov", "8(965)967-853");

        System.out.println("Eremin:   "+directory.get("Eremin"));
        System.out.println("Sherbakov:"+directory.get("Sherbakov"));
        System.out.println("Lapygina: "+directory.get("Lapygina"));
        System.out.println("Logunova: "+directory.get("Logunova"));

    }
}

    class Phonebook  {
        private Map<String, List<String>> Phonebook  = new HashMap<>();
        private List<String> phoneNumber;

        public void add(String surname, String phone_number) {
            if (Phonebook .containsKey(surname)) {
                phoneNumber = Phonebook .get(surname);
                phoneNumber.add(phone_number);
                Phonebook .put(surname, phoneNumber);
            } else {
                phoneNumber = new ArrayList<>();
                phoneNumber.add(phone_number);
                Phonebook .put(surname, phoneNumber);
            }
        }

        public List<String> get(String surname) {
            return Phonebook .get(surname);
        }

    }
package hw6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Сотрудник[] persArray = {
                new Сотрудник("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30),
                new Сотрудник("Pavlov Artem", "Manager", "Pavlov@mailbox.com", "89036589547", 50000, 45),
                new Сотрудник("Sergienco Igor", "Director", "Sergienco@mailbox.com", "892364312", 80000, 50),
                new Сотрудник("Kadeeva Elnara", "Engineer", "Kadeeva@mailbox.com", "892345792", 100000, 25),
                new Сотрудник("Semenova Sofiya", "Manager", "Semenova@mailbox.com", "896423312", 45000, 43)
        };

        System.out.println("Исходный массив: ");
        System.out.println(" ");
        System.out.println(Arrays.toString(persArray));
        System.out.println(" ");

        System.out.println("Сотрудники старше 40 лет: ");
        System.out.println(" ");
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getВозраст() > 40) {
                System.out.println(persArray[i]);


            }

        }

    }
}



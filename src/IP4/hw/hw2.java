package IP4.hw;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {

        // Создаем объекты
        Player bot = new Player(); // Есть конструкор без параметров
        Player alex = new Player(VARIANTS.SCISSORS, "Alex"); // А есть конструктор с параметрами
        System.out.println(bot.variants);
// Получаем результат
System.out.println(bot.whoWins(bot, alex));
    }
}
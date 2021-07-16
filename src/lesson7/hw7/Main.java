package lesson7.hw7;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(100);



        Cat[] cats ={
                new Cat("Рыжик",10),
                new Cat("Барсик",20),
                new Cat("Миша",70),
                new Cat("Пушистик",5),
        };
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.println(cats[i]);

        }





    }
}

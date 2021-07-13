package lesson6.hw6;

import lesson6.hw6.Animals.Animals;
import lesson6.hw6.Animals.Cat;
import lesson6.hw6.Animals.Dog;

public class Main {
    public static void main(String[] args) {
        Animals[] animals= {
                new Cat("Barsik"),
                new Cat ("Puma", 500, 30),
                new Cat ("lion", 300, 40),
                new Cat("Mishka"),
                new Dog("Rex"),
                new Dog("Wolf",1000,20),
                new Dog("Barbos")
        };
        for (int i = 0; i <animals.length; i++) {
            animals[i].run(150);
            animals[i].swim(15);

        }
        System.out.println("Было создано: "+Animals.getCount()+" Животных");
        System.out.println("Было создано: "+Cat.getCount()+" Кота");
        System.out.println("Было создано: "+Dog.getCount()+" Собаки");
    }
}

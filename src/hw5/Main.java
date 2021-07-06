package hw5;

public class Main {
    public static void main(String[] args) {
        Cat cat=new Cat("Barsik","red",5);
        Cat cat2=new Cat("Myrka","white",3);
        Cat cat3=new Cat("Tigr");



        cat.info();
        cat.jump();
        cat.sleep();

        System.out.println(cat.getName());
        cat.setAge(500);
        cat.info();

    }
}

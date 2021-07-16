package lesson7.hw7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {

        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (plate.ChangeFood(appetite)) {
            System.out.println(name + " eat");
           satiety=true;
        }else {System.out.println(name + " не смог покушать");

        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }
}


package hw5;

public class Cat {
    private String name;
    private String color;
    private int age;

    public Cat() {
    }

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Cat(String name) {
        this.name = name;
        this.color = "black";
        this.age = 1;
    }

    public void info() {
        System.out.printf("Cat %s %s %d\n ", name, color, age);

    }

    public void jump() {
        System.out.println(name + " jump");
    }

    public void sleep() {
        System.out.println(name + " sleep");
    }


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0 || age>100){
            System.out.println("не допустимо");
            return;
        }
        this.age = age;
    }
}

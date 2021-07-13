package lesson6.hw6.Animals;

public class Cat extends Animals {
    private static int count;
    public Cat(String name, int maxDistanceRun, int maxDicnanceSwim) {
        super(name, "Кот", maxDistanceRun, maxDicnanceSwim);
        count++;
    }
    public Cat(String name) {
        super(name, "Кот",200, 0);
    count++;
    }

    public static int getCount() {
        return count;
    }
}

package lesson6.hw6.Animals;

public class Dog extends Animals{
    private static int count;
    public Dog(String name, int maxDistanceRun, int maxDicnanceSwim) {
        super(name, "Пёс", maxDistanceRun, maxDicnanceSwim);
        count++;
    }
    public Dog(String name) {
        super(name, "Пёс", 500, 10);
        count++;
    }

    public static int getCount() {
        return count;
    }
}

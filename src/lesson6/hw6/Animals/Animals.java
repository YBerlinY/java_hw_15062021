package lesson6.hw6.Animals;

public class Animals {
    String name;
    String type;
    private static int count;

    int maxDistanceRun;
    int maxDicnanceSwim;

    public Animals(String name, String type, int maxDistanceRun, int maxDicnanceSwim) {
        this.name = name;
        this.type = type;
        this.maxDistanceRun = maxDistanceRun;
        this.maxDicnanceSwim = maxDicnanceSwim;
        count++;
    }

    public void run(int dist) {
        if (maxDistanceRun == 0) {
            System.out.printf("%s %s не умеет бегать\n", type, name);
            return;
        }
        if (dist < 0) {
            System.out.println("Введите положительное число");
            return;
        }
        if (dist <= maxDistanceRun) {
            System.out.printf("%s %s Пробежал %d метров\n", type, name, dist);

        } else {
            System.out.printf("%s %s Не смог пробежать %d метров\n", type, name, dist);

        }

    }


    public void swim(int dist) {
        if (maxDicnanceSwim == 0) {
            System.out.printf("%s %s не умеет плавать\n", type, name);
            return;
        }
        if (dist < 0) {
            System.out.println("Введите положительное число");
            return;
        }
        if (dist <= maxDicnanceSwim) {
            System.out.printf("%s %s Проплыл %d метров\n", type, name, dist);

        } else {
            System.out.printf("%s %s Не смог проплыть %d метров\n", type, name, dist);

        }

    }

    public static int getCount() {
        return count;
    }
}



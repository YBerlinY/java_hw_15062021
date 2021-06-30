package hw4;

import java.util.Random;
import java.util.Scanner;


public class hw4 {
    static final int SIZE = 3;
    static final int DOTS_TO_WIN = 3;
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';
    static char[][] map;

    static final Scanner sc = new Scanner(System.in);
    static final Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();

            if (isAllWinLine(DOT_X, DOTS_TO_WIN)) {
                System.out.println("Вы победили!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
            computerTurn();
            printMap();
            if (isAllWinLine(DOT_O, DOTS_TO_WIN)) {
                System.out.println("Вы проиграли, попробуйте ещё раз!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print(" " + " " + (i + 1));
        }
        System.out.println("");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%2c ", map[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите номер строки, а затем номер столбца");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));
        map[y][x] = DOT_X;

    }

    public static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }


    public static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void computerTurn() {
        int y;
        int x;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = DOT_O;
                    if (isAllWinLine(DOT_O, DOTS_TO_WIN)) {
                        return;

                    }
                    map[i][j] = DOT_EMPTY;
                }

            }
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = DOT_X;
                    if (isAllWinLine(DOT_X, DOTS_TO_WIN)) {
                        map[i][j] = DOT_O;
                        return;

                    }
                    map[i][j] = DOT_EMPTY;
                }

            }
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = DOT_O;
                    if (isAllWinLine(DOT_O, DOTS_TO_WIN - 1) &&
                            Math.random() < 0.5) {
                        return;

                    }
                    map[i][j] = DOT_EMPTY;
                }

            }
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = DOT_X;
                    if (isAllWinLine(DOT_X, DOTS_TO_WIN - 1) &&
                            Math.random() < 0.5) {
                        map[i][j] = DOT_O;
                        return;

                    }
                    map[i][j] = DOT_EMPTY;
                }

            }
        }
        do {
            y = random.nextInt(SIZE);
            x = random.nextInt(SIZE);
        } while (!isCellValid(y, x));
        map[y][x] = DOT_O;
    }

    public static boolean isWinLine(int stY, int stX, int dinY, int dinX, char c, int DOTS_TO_WIN) {
        if (stX + dinX * (DOTS_TO_WIN - 1) > SIZE - 1 || stY + dinY * (DOTS_TO_WIN - 1) > SIZE - 1 || stY + dinY * (DOTS_TO_WIN - 1) < 0) {
            return false;
        }

        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (map[stY + i * dinY][stX + i * dinX] != c) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAllWinLine(char c, int DOTS_TO_WIN) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (
                        isWinLine(i, j, 0, 1, c, DOTS_TO_WIN) ||
                                isWinLine(i, j, 1, 0, c, DOTS_TO_WIN) ||
                                isWinLine(i, j, 1, 1, c, DOTS_TO_WIN) ||
                                isWinLine(i, j, -1, 1, c, DOTS_TO_WIN)) {
                    return true;
                }
            }
        }
        return false;
    }

}







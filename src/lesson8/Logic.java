package lesson8;

import javax.swing.*;
import java.util.Random;


public class Logic {
    private ButtleMap buttleMap;
    static int SIZE;
    static int DOTS_TO_WIN;
    static int y;
    static int x;
    static int yd;
    static int xd;
    static int m;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';
    static char[][] map;


    static final Random random = new Random();
    static boolean isGameFinished;


    public static void go() {

        isGameFinished = true;
        //  printMap();

        if (isAllWinLine(DOT_X, DOTS_TO_WIN)) {
            JOptionPane.showMessageDialog(null, "Поздравляем! Вы победили",
                    "Результат игры", JOptionPane.PLAIN_MESSAGE);

            m=1;
            return ;
        }
        if (isFull()) {
            JOptionPane.showMessageDialog(null, "Ничья, попробуйте ещё раз!",
                    "Результат игры", JOptionPane.PLAIN_MESSAGE);
            return ;
        }
        computerTurn();
//            printMap();
        if (isAllWinLine(DOT_O, DOTS_TO_WIN)) {
            JOptionPane.showMessageDialog(null,"Вы проиграли, попробуйте ещё раз!",
                    "Результат игры",JOptionPane.PLAIN_MESSAGE);
            m=1;
            return;
        }
        if (isFull()) {
            JOptionPane.showMessageDialog(null,"Ничья, попробуйте ещё раз!",
                    "Результат игры",JOptionPane.PLAIN_MESSAGE);
            return ;
       }

        isGameFinished = false;

    }


    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

//    public static void printMap() {
//        for (int i = 0; i < SIZE; i++) {
//            System.out.print(" " + " " + (i + 1));
//        }
//        System.out.println("");
//        for (int i = 0; i < SIZE; i++) {
//            System.out.print(i + 1);
//            for (int j = 0; j < SIZE; j++) {
//                System.out.printf("%2c ", map[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }

    public static void humanTurn(int y, int x) {
        if (isCellValid(y, x)) {
            map[y][x] = DOT_X;
            go();
        }


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
            else{
                yd =dinY;
                xd=dinX;

            }
        }
        return true;
    }


    public static boolean isAllWinLine(char c, int DOTS_TO_WIN) {
        System.out.println(DOTS_TO_WIN);
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (
                                 isWinLine(i, j, 0, 1, c, DOTS_TO_WIN) ||
                                isWinLine(i, j, 1, 0, c, DOTS_TO_WIN) ||
                                isWinLine(i, j, 1, 1, c, DOTS_TO_WIN) ||
                                isWinLine(i, j, -1, 1, c, DOTS_TO_WIN)) {
                    y=i;
                    x=j;
                    return true;
                }
            }
        }
        return false;
    }

}







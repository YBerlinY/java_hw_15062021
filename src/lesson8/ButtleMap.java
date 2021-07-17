package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ButtleMap extends JPanel {
    private GameWindow gameWindow;
    int fieldSize;
    int winLength;
    private boolean isInit;
    private static int cellWidth;
    private static int cellHeigth;


    public ButtleMap(GameWindow gameWindow) {

        this.gameWindow = gameWindow;
        setBackground(Color.gray);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                int cellX = e.getX() / cellWidth;
                int cellY = e.getY() / cellHeigth;


                if (isInit && !Logic.isGameFinished) {
                    Logic.humanTurn(cellY, cellX);
                }
                repaint();
            }
        });
    }

    void StartNewGame(int fieldSize, int winLength) {
        this.fieldSize = fieldSize;
        this.winLength = winLength;
        repaint();
        isInit = true;


    }

    @Override
    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (!isInit) {
            return;
        }
        int panelWidth = getWidth();
        int panelHeight = getHeight();


        cellWidth = panelWidth / fieldSize;
        cellHeigth = panelHeight / fieldSize;

        g.setColor(Color.BLACK);
        ((Graphics2D) g).setStroke(new BasicStroke(4f));


        for (int i = 1; i < fieldSize; i++) {
            int y = i * cellHeigth;
            g.drawLine(0, y, panelWidth, y);

        }
        for (int i = 1; i < fieldSize; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x, panelHeight);
        }

        for (int i = 0; i < Logic.map.length; i++) {
            for (int j = 0; j < Logic.map.length; j++) {
                if (Logic.map[i][j] == Logic.DOT_X) {
                    drawX((Graphics2D) g, i, j);
                }
                if (Logic.map[i][j] == Logic.DOT_O) {
                    drawO((Graphics2D) g, i, j);
                }
            }
        }
        if (Logic.m == 1) {
            drawWinLine((Graphics2D) g, Logic.y, Logic.x, Logic.yd, Logic.xd);
            System.out.printf("%d %d %d %d", Logic.y, Logic.x, Logic.yd, Logic.xd);
        }
    }

    private void drawX(Graphics2D g, int y, int x) {

        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(3f));

        g.drawLine(x * cellWidth, y * cellHeigth,
                (x + 1) * cellWidth, (y + 1) * cellHeigth);
        g.drawLine((x + 1) * cellWidth, y * cellHeigth,
                x * cellWidth, (y + 1) * cellHeigth);

    }

    private void drawO(Graphics2D g, int y, int x) {

        g.setColor(Color.LIGHT_GRAY);
        g.setStroke(new BasicStroke(3f));
        g.drawOval(x * cellWidth, y * cellHeigth,
                cellWidth, cellHeigth);
    }


    public void drawWinLine(Graphics2D g, int y, int x, int yd, int xd) {

        g.setColor(Color.RED);
        g.setStroke(new BasicStroke(7f));
        for (int i = 1; i <= Logic.DOTS_TO_WIN; i++) {

            if (Logic.yd == -1 && Logic.xd == 1) {
                g.drawLine(Logic.x * cellWidth, (Logic.y + 1) * cellHeigth,
                        (Logic.x + i * Logic.xd) * cellWidth, (Logic.y + 1 + i * Logic.yd) * cellHeigth);

            }
            if (Logic.yd == 1 && Logic.xd == 1) {
                g.drawLine(Logic.x * cellWidth, Logic.y * cellHeigth,
                        (Logic.x + i * Logic.xd) * cellWidth, (Logic.y + i * Logic.yd) * cellHeigth);

            }
            if (Logic.yd == 0 && Logic.xd == 1) {
                g.drawLine(Logic.x * cellWidth, Logic.y *cellHeigth + cellHeigth / 2,
                        (Logic.x + i * Logic.xd) * cellWidth, (Logic.y + i * Logic.yd) * cellHeigth + cellHeigth /2);

            }
            if (Logic.yd == 1 && Logic.xd == 0) {
                g.drawLine(Logic.x * cellWidth + cellWidth / 2 , Logic.y * cellHeigth,
                        (Logic.x + i * Logic.xd) * cellWidth + cellWidth / 2, (Logic.y + i * Logic.yd) * cellHeigth);

            }

        }
    }

}


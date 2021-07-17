package lesson8;

import javax.swing.*;
import java.awt.*;

public class Setting extends JFrame {
    private GameWindow gameWindow;
    private JSlider slFieldSize;
    private JSlider slDotsToWin;
    private final int MIN_FIELD_SIZE = 3;
    private final int MAX_FIELD_SIZE = 10;



    public Setting(GameWindow gameWindow) {
        this.gameWindow = gameWindow;

        setBounds(500, 300, 450, 300);
        setTitle("TicTacToe setting");


        slFieldSize = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE);
        slFieldSize.setMajorTickSpacing(1);
        slFieldSize.setPaintTicks(true);
        slFieldSize.setPaintLabels(true);
        slDotsToWin = new JSlider(MIN_FIELD_SIZE, MIN_FIELD_SIZE, MIN_FIELD_SIZE);
        slDotsToWin.setMajorTickSpacing(1);
        slDotsToWin.setPaintTicks(true);
        slDotsToWin.setPaintLabels(true);
        
        slFieldSize.addChangeListener(e-> slDotsToWin.setMaximum(slFieldSize.getValue()));
        
        setLayout(new GridLayout(5, 1));

        add(new Label(" Field size"));
        add(slFieldSize);
        add(new Label(" Winning line"));
        add(slDotsToWin);
        JButton button=new JButton("Start a game");
        add(button);
        button.addActionListener(e->{
            int fieldSize=slFieldSize.getValue();
            int dotsToWin =slDotsToWin.getValue();

            Logic.SIZE=fieldSize;
            Logic.DOTS_TO_WIN=dotsToWin;
            Logic.initMap();
           // Logic.printMap();
            Logic.isGameFinished=false;

            gameWindow.StartNewGame(fieldSize,dotsToWin);
            setVisible(false);

        });
    }

}


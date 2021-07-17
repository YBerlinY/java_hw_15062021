package lesson8;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    private ButtleMap buttleMap;
    private Setting setting;
    public GameWindow()  {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500,300,500,500);
        setTitle("TicTacToe");

        JPanel panel=new JPanel(new GridLayout(1 , 2));
        add(panel,BorderLayout.SOUTH);
        JButton button= new JButton("New game");
        panel.add(button,BorderLayout.SOUTH );
        JButton buttonExit= new JButton("Exit");
        panel.add(buttonExit,BorderLayout.SOUTH );

        buttleMap =new ButtleMap(this);
        add(buttleMap,BorderLayout.CENTER);
        setting=new Setting(this);

        button.addActionListener(e-> {setting.setVisible(true);
        Logic.m=0;
        });
        buttonExit.addActionListener(e->System.exit(0));


        setVisible(true);
    }
    void StartNewGame(int fieldSize,int winLength){
        buttleMap.StartNewGame(fieldSize,winLength);

    }
}

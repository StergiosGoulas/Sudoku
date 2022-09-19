package LetsTry.MainFrame;

import LetsTry.StarterFrame.starterFrame;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static LetsTry.MainFrame.sudokuFrame.getTextField;
import static LetsTry.MainFrame.sudokuFrame.setTextField;
import static LetsTry.MainFrame.aboutController.*;
import static java.awt.Component.CENTER_ALIGNMENT;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public interface sudokuCreate {

    default void createBoard( int i, int j){
        JTextField[][] textField;
        textField = getTextField();
        Font font = new Font(" ", Font.BOLD, 30);
        Border border = BorderFactory.createLineBorder(Color.BLACK,5);

        textField[i][j]=new JTextField(1);
        textField[i][j].setFont(font);
//      textField[i][j].setText(i+","+j);
        textField[i][j].setHorizontalAlignment((int) CENTER_ALIGNMENT);
        if((j<3||j>5)&&(i<3||i>5)) {
            textField[i][j].setBorder(border);
        }else if ((j>2&&j<6)&&(i>2&&i<6))
            textField[i][j].setBorder(border);
        setTextField(textField);
    }

    default void createMenuBar(JMenuBar menuBar) {
        JMenu gameMenu = new JMenu("Game");
        JMenu optionMenu = new JMenu("Option");
        JMenu history = new JMenu("History");
        JMenu help = new JMenu("Help");

        JButton newGame = new JButton("New Game");
        JButton restart = new JButton("    Restart  ");
        JButton exit = new JButton("       Exit      ");
        gameMenu.add(newGame);
        gameMenu.add(restart);
        gameMenu.add(exit);

        JButton showHistory = new JButton("Show History");
        JButton hideHistory = new JButton(" Hide History ");
        history.add(showHistory);
        history.add(hideHistory);
        optionMenu.add(history);

//        JButton about;
//        about = getAbout();
        help.add(getAbout());

        menuBar.add(gameMenu);
        menuBar.add(optionMenu);
        menuBar.add(help);


        newGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                closeFrame();
                starterFrame starterFrame = new starterFrame();

                starterFrame.setSize(500, 500);
                starterFrame.setResizable(false);

                starterFrame.setVisible(true);
                starterFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        aboutModel model = new aboutModel();
        aboutController controller = new aboutController(model);

        setAbout(about);


//        about.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JFrame frame = new JFrame("About");
//                frame.setLocation(100, 100);
//
//                frame.setSize(500,800);
//                frame.setResizable(false);
//
//                ImageIcon image = new ImageIcon("sudokuDetails.png");
//                JLabel imageLabel = new JLabel(image);
//                frame.add(imageLabel);
//
//                frame.setVisible(true);
////                frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//
//            }
//        });
    }

    void closeFrame();
}

package LetsTry.LetsPlay;

import LetsTry.DBConnection.SingletonConnection;
import LetsTry.MainFrame.aboutController;
import LetsTry.MainFrame.aboutModel;
import LetsTry.MainFrame.aboutView;
import LetsTry.StarterFrame.starterFrame;

import java.sql.Connection;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 */
public class sudokuGame {
    public static void main(String[] args) {
        starterFrame starterFrame = new starterFrame();

        Connection conn = SingletonConnection.getCon();

        starterFrame.setSize(500,500);
        starterFrame.setResizable(false);

        starterFrame.setVisible(true);
        starterFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

//        while (starterFrame.nicname.getText().equals("")||starterFrame.nicname.getText().equals("Should give a nickname!")){
//            starterFrame.nicname.setText("Should give a nickname!");
//            starterFrame.button1.setEnabled(false);
//            starterFrame.button2.setEnabled(false);
//            starterFrame.button3.setEnabled(false);
//        }
//        starterFrame.button1.setEnabled(true);
//        starterFrame.button2.setEnabled(true);
//        starterFrame.button3.setEnabled(true);
        }
    }


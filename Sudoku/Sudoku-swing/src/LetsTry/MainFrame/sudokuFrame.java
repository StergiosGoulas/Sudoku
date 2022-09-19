package LetsTry.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class sudokuFrame extends JFrame implements sudokuCreate {
    public static JTextField[][] textField = new JTextField[9][9];
    final JMenuBar menuBar;

    public sudokuFrame() {

//Kataskeuh tou kuriou Frame
        super("Sudoku");
        setLocation(100, 100);
        setLayout(new GridLayout(9, 9));

//Dhmiourgia enos Menu me kapoia Button gia extra leitourgies
        menuBar = new JMenuBar();
        createMenuBar(menuBar);
        setJMenuBar(menuBar);

//H kataskeuh tou Board tou paixnidou Sudoku 9x9
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                createBoard(i,j);
                add(textField[i][j]);
            }
        }

//O algori8mos gia na dexete mono ari8mous kai oxi grammata
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                textField[i][j].addKeyListener(new java.awt.event.KeyAdapter() {

                    public void keyReleased(java.awt.event.KeyEvent evt) {
                        for (int i = 0; i < 9; i++) {
                            for (int j = 0; j < 9; j++) {
                                try {
                                    int number = Integer.parseInt(textField[i][j].getText());
                                } catch (Exception e) {
                                    textField[i][j].setText("");
                                }
                            }
                        }
                    }
                });
            }
        }

    }

//Kleisimo tou frame
    @Override
    public void closeFrame() {
        super.dispose();
    }

    public static JTextField[][] getTextField() {
        return textField;
    }

    public static void setTextField(JTextField[][] textField) {
        sudokuFrame.textField = textField;
    }
}
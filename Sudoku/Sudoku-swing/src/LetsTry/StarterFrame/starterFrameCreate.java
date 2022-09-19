package LetsTry.StarterFrame;

import LetsTry.MainFrame.sudokuFrame;
import LetsTry.MainFrame.sudokuDifficult;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public interface starterFrameCreate {
    default void createButton(JButton button) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                closeFrame();
                sudokuFrame sudokuFrame = new sudokuFrame();
                sudokuFrame.setSize(800,800);
                sudokuFrame.setResizable(false);

                sudokuFrame.setVisible(true);
                sudokuFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        });
        button.addMouseListener(  new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent){
                new sudokuDifficult(button);
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {}

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {}

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {}

            @Override
            public void mouseExited(MouseEvent mouseEvent) {}
        });
    }

    void closeFrame();
}

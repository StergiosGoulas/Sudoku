package LetsTry.MainFrame;

import javax.swing.*;
import java.util.Random;

import static LetsTry.MainFrame.sudokuFrame.getTextField;
import static LetsTry.MainFrame.sudokuFrame.setTextField;

public class sudokuDifficult {
    String easy = "Easy";
    String medium = "Medium";
    String hard = "Hard";
    Random random = new Random();
    JTextField[][] textField;
    public sudokuDifficult(JButton button ){

// Arxikopoihsh tou board kathe fora apo to 0 xwris noumera
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                textField = getTextField();
                textField[i][j].setText("");
            }
        }
        setTextField(textField);

// Topothetoume sto Board k random arithmous se random theseis analoga me to epipedo duskolias
        if(easy.equals(button.getText())){
            for (int k = 0; k < 35; k++){
                int random_x = random.nextInt(9);
                int random_y = random.nextInt(9);
                new sudokuRandom(random_x,random_y);
            }
        }

        if(medium.equals(button.getText())){
            for (int k = 0; k < 20; k++){
                int random_x = random.nextInt(9);
                int random_y = random.nextInt(9);
                new sudokuRandom(random_x,random_y);
            }
        }

        if(hard.equals(button.getText())){
            for (int k = 0; k < 10; k++){
                int random_x = random.nextInt(9);
                int random_y = random.nextInt(9);
                new sudokuRandom(random_x,random_y);
            }
        }
    }
}

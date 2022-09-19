package LetsTry.MainFrame;

import javax.swing.*;
import java.util.Random;

import static LetsTry.MainFrame.sudokuFrame.getTextField;
import static LetsTry.MainFrame.sudokuFrame.setTextField;

public class sudokuRandom {
    JTextField[][] textField;
    public sudokuRandom(int x, int y) {
        textField = getTextField();

        Random random = new Random();
        int random_int = random.nextInt(10);
        int flag = 1;

        for(int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (String.valueOf(random_int).equals(textField[i][y].getText())) {
                    flag = 0;
                }

                if (String.valueOf(random_int).equals(textField[x][i].getText())) {
                    flag = 0;
                }

                if((x == i) && (y == j)){
                    if(x==0||x==3||x==6){
                        flag = yAxon(textField, x, y, random_int,flag);
                    }
                    if(x==1||x==4||x==7){
                        flag = yAxon(textField, x-1, y, random_int,flag);
                    }
                    if(x==2||x==5||x==8){
                        flag = yAxon(textField, x-2, y, random_int,flag);
                    }
                }
            }
        }

        if (flag == 1){
            textField[x][y].setText(String.valueOf(random_int));
            textField[x][y].setEditable(false);
            setTextField(textField);
        }

        if(flag == 0){
            new sudokuRandom(x, y);
        }
    }

    int yAxon(JTextField[][] textField, int x, int y, int random_int, int flag){
        if(y==0||y==3||y==6){
            for(int k = y; k < y + 2; k++) {
                for (int n = x; n < x + 2; n++){
                    if (String.valueOf(random_int).equals(textField[n][k].getText())) {
                        flag = 0;
                    }
                }
            }
        }
        if(y==1||y==4||y==7){
            for(int k = y-1; k < y + 1; k++) {
                for (int n = x; n < x + 2; n++){
                    if (String.valueOf(random_int).equals(textField[n][k].getText())) {
                        flag = 0;
                    }
                }
            }
        }
        if(y==2||y==5||y==8){
            for(int k = y-2; k < y; k++) {
                for (int n = x; n < x + 2; n++){
                    if (String.valueOf(random_int).equals(textField[n][k].getText())) {
                        flag = 0;
                    }
                }
            }
        }
        return flag;
    }
}
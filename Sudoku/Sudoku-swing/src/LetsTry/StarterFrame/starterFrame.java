package LetsTry.StarterFrame;

import javax.swing.*;
import java.awt.*;

public class starterFrame extends JFrame implements starterFrameCreate{
    public JTextField nicname;
    public JButton button1;
    public JButton button2;
    public JButton button3;


    public starterFrame() {
//To proto frame pou emfanizete sto opoio o xrhsths tha bazei to nicname tou kai tha epilegei epipedo duskolias
        super("Sudoku");
        setLocation(100, 100);
        GridLayout gridLayout = new GridLayout(3, 3);
        setLayout(gridLayout);

        JPanel[][] panelHolder = new JPanel[3][3];
        JTextField nicnameTextField = new JTextField("Give me your nicname:\n");
        nicnameTextField.setFont(new Font("", Font.BOLD, 12));
        nicnameTextField.setEditable(false);

        JTextField difficult = new JTextField("Chose difficulty!\n");
        difficult.setFont(new Font("", Font.BOLD, 17));
        difficult.setEditable(false);

        nicname = new JTextField();
        nicname.setPreferredSize(new Dimension(160,20));


        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 3; n++) {
                panelHolder[m][n] = new JPanel();
                add(panelHolder[m][n]);
            }
        }

        button1 = new JButton("Easy");
        button2 = new JButton("Medium");
        button3 = new JButton("Hard");
        createButton(button1);
        createButton(button2);
        createButton(button3);

        panelHolder[0][1].add(difficult);
        panelHolder[1][0].add(button1);
        panelHolder[1][1].add(button2);
        panelHolder[1][2].add(button3);
        panelHolder[2][0].add(nicnameTextField);
        panelHolder[2][1].add(nicname);
    }

    public void closeFrame () {
        super.setVisible(false);
    }
}

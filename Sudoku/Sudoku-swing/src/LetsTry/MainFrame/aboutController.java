package LetsTry.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class aboutController {
    aboutModel model;

    public static JButton about = new JButton("About");

    public aboutController(aboutModel model){
        this.model = model;

        about.addActionListener(new ActionListener() {
            JFrame frame = new JFrame();
            @Override
            public void actionPerformed(ActionEvent e) {
                aboutView view = new aboutView();

                JLabel imageLabel = new JLabel();
                imageLabel.setIcon(model.getImage());
                view.add(imageLabel);
            }
        });
    }

    public static JButton getAbout() {
        return about;
    }

    public static void setAbout(JButton about) {
        aboutController.about = about;
    }

    public aboutModel getModel() {
        return model;
    }

    public void setModel(aboutModel model) {
        this.model = model;
    }
}

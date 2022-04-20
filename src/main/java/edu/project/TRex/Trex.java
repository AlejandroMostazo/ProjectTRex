package edu.project.TRex;

import javax.swing.*;
import java.awt.*;

public class Trex extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(Toolkit.getDefaultToolkit().getImage("src/main/resources/dino.png"),0,0, null);
    }
}

package edu.project.TRex;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Ventana extends JFrame{

    public Ventana () {
        setTitle("Juego T-Rex");
        setSize(1080, 580);
        setLocation(75, 50);
        setVisible(true);
        setIconImage(Toolkit.getDefaultToolkit().createImage("src/main/resources/dino.png"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    int x = 0;

    public void mover(){
        x +=4;
        repaint();   //llama a paint
    }

    public void paint (Graphics g)
    {
        super.paint(g);
        Toolkit t = Toolkit.getDefaultToolkit ();
        Image imagen = t.getImage ("src/main/resources/dino.png");

        g.drawImage(imagen, x, 100, 100, 100, this);


    }

    public static void main(String[] args) {
        Ventana v = new Ventana();
        for (int i = 0; i < 750; i++) {
            try
            {
                Thread.sleep(50);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            v.mover();
        }

    }
}

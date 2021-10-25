package td3.view;

import td3.model.Model;

import javax.swing.*;
import java.awt.*;

public class MyDisplay extends JPanel {

    Model m;

    public MyDisplay(){
        JFrame frame = new JFrame("Java Avance - Graphic Display");
        frame.setSize(new Dimension(500,500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDisplay d = new MyDisplay();
        frame.add(d);
        frame.setVisible(true);

        m = new Model();
    }

    public void drawing(){
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i=0; i<m.getListOfCircles().size(); i++){

        }
    }
}


/**
 * La classe Graphics en java contient des outils pour dessiner. C'est une classe abstraite.
 */

/**
 * La classe JFrame permet de representer une fenetre qui possède un titre,
 * une taille modifiable et eventuellement un menu.
 */


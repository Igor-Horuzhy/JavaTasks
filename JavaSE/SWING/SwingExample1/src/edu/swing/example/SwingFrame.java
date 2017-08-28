package edu.swing.example;

import edu.swing.example2.TriangleShape;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;

public class SwingFrame extends JFrame {

    public SwingFrame() {
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(2,3));
        for(int i=0; i<3; i++) {
            edu.swing.example2.SquareShape shape = new edu.swing.example2.SquareShape();
            contentPane.add(shape);
        }
        for(int i=0; i<3; i++) {
            edu.swing.example2.TriangleShape shape = new TriangleShape();
            contentPane.add(shape);
        }
        setBounds(10, 50, 500, 450);
    }

    public static void main(String[] arg) {
        edu.swing.example2.SwingFrame f = new edu.swing.example2.SwingFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

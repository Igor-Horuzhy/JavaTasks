package edu.swing.example3;

import java.awt.Graphics;
import javax.swing.JComponent;

public class SquareShape extends JComponent implements edu.swing.example3.Shape {

    private int currentGap = 10;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(currentGap, currentGap,
                getWidth() - 2 * currentGap,
                getHeight() - 2 * currentGap);
    }

    public void increase(int value) {
        currentGap -= value;
    }

    public void decrease(int value) {
        currentGap += value;
    }

}

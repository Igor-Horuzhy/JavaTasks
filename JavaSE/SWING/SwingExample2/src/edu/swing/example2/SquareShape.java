package edu.swing.example2;

import java.awt.Graphics;

public class SquareShape extends Shape {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(currentGap, currentGap,
                getWidth() - 2 * currentGap,
                getHeight() - 2 * currentGap);
    }

}

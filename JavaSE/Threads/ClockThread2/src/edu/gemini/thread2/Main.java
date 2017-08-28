package edu.gemini.thread2;

import javax.swing.JFrame;

/**
 *
 * @author ASaburov
 */
public class Main {

    public static void main(String[] args) {
        Clock cl = new Clock();
        cl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cl.setVisible(true);
    }
}

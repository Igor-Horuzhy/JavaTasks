package edu.gemini.thread111;

import javax.swing.JFrame;

/**
 *
 * @author ASaburov
 */
public class Main {

    public static void main(String[] args) {
        edu.gemini.thread2.Clock cl = new edu.gemini.thread2.Clock();
        cl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cl.setVisible(true);
    }

}

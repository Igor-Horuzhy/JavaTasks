package edu.gemini.frame3;

import edu.gemini.print3.PrintMessage;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author ASaburov
 */
public class TestFrame extends JFrame implements ActionListener {

    public TestFrame() {
        PrintMessage pm = new PrintMessage();

        JButton b1 = new JButton("Жми меня наверху");
        b1.addActionListener(this);
        b1.addActionListener(pm);
        getContentPane().add(b1, BorderLayout.NORTH);

        JPanel p = new JPanel();
        getContentPane().add(p, BorderLayout.CENTER);
        p.addMouseMotionListener(pm);

        JButton b2 = new JButton("Жми меня внизу");
        b2.addActionListener(this);
        b2.addActionListener(pm);
        getContentPane().add(b2, BorderLayout.SOUTH);

        setBounds(200, 200, 300, 250);
    }

    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        JOptionPane.showMessageDialog(this, btn.getText());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                edu.gemini.frame2.TestFrame t = new edu.gemini.frame2.TestFrame();
                t.setDefaultCloseOperation(edu.gemini.frame2.TestFrame.EXIT_ON_CLOSE);
                t.setVisible(true);
            }
        });
    }

}

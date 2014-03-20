package GUI.Logika;

import GUI.Grafika;

import javax.swing.*;

/**
 * Created by Mladjan on 20.3.2014.
 */
public class Logika {


    public static void main(String[] args) {
        JFrame frame = new JFrame("Grafika");
        frame.setContentPane(new Grafika().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

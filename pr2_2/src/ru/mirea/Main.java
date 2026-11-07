package ru.mirea;
import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame(" GHBD");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500, 300);
        JButton button = new JButton("Push me");
        //frame.add (button);

        JLabel label = new JLabel("My button");
        JPanel panel = new JPanel();
        panel.setBackground(Color.pink);
        panel.setSize(new Dimension(400, 200));
        panel.add(button);
        panel.add(label);
        JButton button1 = new JButton("do not push me");
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
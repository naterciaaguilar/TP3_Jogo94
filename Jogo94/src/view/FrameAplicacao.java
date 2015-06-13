/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class FrameAplicacao extends JFrame {
    public FrameAplicacao () {
        JFrame frame = new JFrame();
        frame.setSize(300, 550);
        frame.setTitle("94%");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}

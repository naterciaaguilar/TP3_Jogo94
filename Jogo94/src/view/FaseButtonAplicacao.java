/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author User
 */
public class FaseButtonAplicacao extends JButton {
    public static ImageIcon BBB_ICON = new ImageIcon("Imagens/bbb.png");
    public static ImageIcon BBA_ICON = new ImageIcon("Imagens/bba.png");
    public static ImageIcon BAB_ICON = new ImageIcon("Imagens/bab.png");
    public static ImageIcon BAA_ICON = new ImageIcon("Imagens/baa.png");
    public static ImageIcon ABB_ICON = new ImageIcon("Imagens/abb.png");
    public static ImageIcon ABA_ICON = new ImageIcon("Imagens/aba.png");
    public static ImageIcon AAB_ICON = new ImageIcon("Imagens/aab.png");
    public static ImageIcon AAA_ICON = new ImageIcon("Imagens/aaa.png");
    
    public FaseButtonAplicacao(String fase, ImageIcon icone) {
        super(fase, icone);
        this.setHorizontalTextPosition(JButton.CENTER);
        this.setVerticalTextPosition(JButton.BOTTOM);
    }
}

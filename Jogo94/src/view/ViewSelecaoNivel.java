/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class ViewSelecaoNivel extends JInternalFrame {
    
    public ViewSelecaoNivel() {
        super();
        this.setSize(300, 550);
        this.setFrameIcon(null);
        this.setBorder(null);
        
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BorderLayout());
        
        JPanel panelCabecalho = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
        panelCabecalho.setBackground(new Color(46, 217, 255));
        ImageIcon logo = new ImageIcon("Imagens\\logo.png");
        panelCabecalho.add(new JLabel(logo));
        
        contentPane.add(panelCabecalho, "North");
        
        JPanel panelNiveis = new JPanel(new GridLayout(5, 5, 5, 5));
        panelNiveis.setBackground(new Color(46, 217, 255));
        
        ButtonAplicacao nivel1 = new ButtonAplicacao("1", ButtonAplicacao.BBB_ICON, true);
        ButtonAplicacao nivel2 = new ButtonAplicacao("2", ButtonAplicacao.BBB_ICON, false);
        ButtonAplicacao nivel3 = new ButtonAplicacao("3", ButtonAplicacao.BBB_ICON, false);
        ButtonAplicacao nivel4 = new ButtonAplicacao("4", ButtonAplicacao.BBB_ICON, false);
        ButtonAplicacao nivel5 = new ButtonAplicacao("5", ButtonAplicacao.BBB_ICON, false);
        ButtonAplicacao nivel6 = new ButtonAplicacao("6", ButtonAplicacao.BBB_ICON, false);
        ButtonAplicacao nivel7 = new ButtonAplicacao("7", ButtonAplicacao.BBB_ICON, false);
        ButtonAplicacao nivel8 = new ButtonAplicacao("8", ButtonAplicacao.BBB_ICON, false);
        ButtonAplicacao nivel9 = new ButtonAplicacao("9", ButtonAplicacao.BBB_ICON, false);
        ButtonAplicacao nivel10 = new ButtonAplicacao("10", ButtonAplicacao.BBB_ICON, false);
        ButtonAplicacao nivel11 = new ButtonAplicacao("11", ButtonAplicacao.BBB_ICON, false);
        ButtonAplicacao nivel12 = new ButtonAplicacao("12", ButtonAplicacao.BBB_ICON, false);
        ButtonAplicacao nivel13 = new ButtonAplicacao("13", ButtonAplicacao.BBB_ICON, false);
        ButtonAplicacao nivel14 = new ButtonAplicacao("14", ButtonAplicacao.BBB_ICON, false);
        ButtonAplicacao nivel15 = new ButtonAplicacao("15", ButtonAplicacao.BBB_ICON, false);
        ButtonAplicacao nivel16 = new ButtonAplicacao("16", ButtonAplicacao.BBB_ICON, false);
        ButtonAplicacao nivel17 = new ButtonAplicacao("17", ButtonAplicacao.BBB_ICON, false);
        ButtonAplicacao nivel18 = new ButtonAplicacao("18", ButtonAplicacao.BBB_ICON, false);
        ButtonAplicacao nivel19 = new ButtonAplicacao("19", ButtonAplicacao.BBB_ICON, false);
        ButtonAplicacao nivel20 = new ButtonAplicacao("20", ButtonAplicacao.BBB_ICON, false);
        ButtonAplicacao nivel21 = new ButtonAplicacao("21", ButtonAplicacao.BBB_ICON, false);
        ButtonAplicacao nivel22 = new ButtonAplicacao("22", ButtonAplicacao.BBB_ICON, false);
        ButtonAplicacao nivel23 = new ButtonAplicacao("23", ButtonAplicacao.BBB_ICON, false);
        ButtonAplicacao nivel24 = new ButtonAplicacao("24", ButtonAplicacao.BBB_ICON, false);
        ButtonAplicacao nivel25 = new ButtonAplicacao("25", ButtonAplicacao.BBB_ICON, false);
        
        panelNiveis.add(nivel1);
        panelNiveis.add(nivel2);
        panelNiveis.add(nivel3);
        panelNiveis.add(nivel4);
        panelNiveis.add(nivel5);
        panelNiveis.add(nivel6);
        panelNiveis.add(nivel7);
        panelNiveis.add(nivel8);
        panelNiveis.add(nivel9);
        panelNiveis.add(nivel10);
        panelNiveis.add(nivel11);
        panelNiveis.add(nivel12);
        panelNiveis.add(nivel13);
        panelNiveis.add(nivel14);
        panelNiveis.add(nivel15);
        panelNiveis.add(nivel16);
        panelNiveis.add(nivel17);
        panelNiveis.add(nivel18);
        panelNiveis.add(nivel19);
        panelNiveis.add(nivel20);
        panelNiveis.add(nivel21);
        panelNiveis.add(nivel22);
        panelNiveis.add(nivel23);
        panelNiveis.add(nivel24);
        panelNiveis.add(nivel25);
        
        contentPane.add(panelNiveis, "Center");
    }
    
    public int getNumNivelSelecionado() {
        return 0;
    }
}

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
import javax.swing.JButton;
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
        
        FaseButtonAplicacao nivel1 = new FaseButtonAplicacao("1", FaseButtonAplicacao.BBB_ICON);
        FaseButtonAplicacao nivel2 = new FaseButtonAplicacao("2", FaseButtonAplicacao.BBB_ICON);
        FaseButtonAplicacao nivel3 = new FaseButtonAplicacao("3", FaseButtonAplicacao.BBB_ICON);
        FaseButtonAplicacao nivel4 = new FaseButtonAplicacao("4", FaseButtonAplicacao.BBB_ICON);
        FaseButtonAplicacao nivel5 = new FaseButtonAplicacao("5", FaseButtonAplicacao.BBB_ICON);
        FaseButtonAplicacao nivel6 = new FaseButtonAplicacao("6", FaseButtonAplicacao.BBB_ICON);
        FaseButtonAplicacao nivel7 = new FaseButtonAplicacao("7", FaseButtonAplicacao.BBB_ICON);
        FaseButtonAplicacao nivel8 = new FaseButtonAplicacao("8", FaseButtonAplicacao.BBB_ICON);
        FaseButtonAplicacao nivel9 = new FaseButtonAplicacao("9", FaseButtonAplicacao.BBB_ICON);
        FaseButtonAplicacao nivel10 = new FaseButtonAplicacao("10", FaseButtonAplicacao.BBB_ICON);
        FaseButtonAplicacao nivel11 = new FaseButtonAplicacao("11", FaseButtonAplicacao.BBB_ICON);
        FaseButtonAplicacao nivel12 = new FaseButtonAplicacao("12", FaseButtonAplicacao.BBB_ICON);
        FaseButtonAplicacao nivel13 = new FaseButtonAplicacao("13", FaseButtonAplicacao.BBB_ICON);
        FaseButtonAplicacao nivel14 = new FaseButtonAplicacao("14", FaseButtonAplicacao.BBB_ICON);
        FaseButtonAplicacao nivel15 = new FaseButtonAplicacao("15", FaseButtonAplicacao.BBB_ICON);
        FaseButtonAplicacao nivel16 = new FaseButtonAplicacao("16", FaseButtonAplicacao.BBB_ICON);
        FaseButtonAplicacao nivel17 = new FaseButtonAplicacao("17", FaseButtonAplicacao.BBB_ICON);
        FaseButtonAplicacao nivel18 = new FaseButtonAplicacao("18", FaseButtonAplicacao.BBB_ICON);
        FaseButtonAplicacao nivel19 = new FaseButtonAplicacao("19", FaseButtonAplicacao.BBB_ICON);
        FaseButtonAplicacao nivel20 = new FaseButtonAplicacao("20", FaseButtonAplicacao.BBB_ICON);
        FaseButtonAplicacao nivel21 = new FaseButtonAplicacao("21", FaseButtonAplicacao.BBB_ICON);
        FaseButtonAplicacao nivel22 = new FaseButtonAplicacao("22", FaseButtonAplicacao.BBB_ICON);
        FaseButtonAplicacao nivel23 = new FaseButtonAplicacao("23", FaseButtonAplicacao.BBB_ICON);
        FaseButtonAplicacao nivel24 = new FaseButtonAplicacao("24", FaseButtonAplicacao.BBB_ICON);
        FaseButtonAplicacao nivel25 = new FaseButtonAplicacao("25", FaseButtonAplicacao.BBB_ICON);
        
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

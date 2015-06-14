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
    private ButtonAplicacao nivel1;
    private ButtonAplicacao nivel2;
    private ButtonAplicacao nivel3;
    private ButtonAplicacao nivel4;
    private ButtonAplicacao nivel5;
    private ButtonAplicacao nivel6;
    private ButtonAplicacao nivel7;
    private ButtonAplicacao nivel8;
    private ButtonAplicacao nivel9;
    private ButtonAplicacao nivel10;
    private ButtonAplicacao nivel11;
    private ButtonAplicacao nivel12;
    private ButtonAplicacao nivel13;
    private ButtonAplicacao nivel14;
    private ButtonAplicacao nivel15;
    private ButtonAplicacao nivel16;
    private ButtonAplicacao nivel17;
    private ButtonAplicacao nivel18;
    private ButtonAplicacao nivel19;
    private ButtonAplicacao nivel20;
    private ButtonAplicacao nivel21;
    private ButtonAplicacao nivel22;
    private ButtonAplicacao nivel23;
    private ButtonAplicacao nivel24;
    private ButtonAplicacao nivel25;
    
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
        
        this.nivel1 = new ButtonAplicacao("1", ButtonAplicacao.BBB_ICON, true);
        this.nivel2 = new ButtonAplicacao("2", ButtonAplicacao.BBB_ICON, false);
        this.nivel3 = new ButtonAplicacao("3", ButtonAplicacao.BBB_ICON, false);
        this.nivel4 = new ButtonAplicacao("4", ButtonAplicacao.BBB_ICON, false);
        this.nivel5 = new ButtonAplicacao("5", ButtonAplicacao.BBB_ICON, false);
        this.nivel6 = new ButtonAplicacao("6", ButtonAplicacao.BBB_ICON, false);
        this.nivel7 = new ButtonAplicacao("7", ButtonAplicacao.BBB_ICON, false);
        this.nivel8 = new ButtonAplicacao("8", ButtonAplicacao.BBB_ICON, false);
        this.nivel9 = new ButtonAplicacao("9", ButtonAplicacao.BBB_ICON, false);
        this.nivel10 = new ButtonAplicacao("10", ButtonAplicacao.BBB_ICON, false);
        this.nivel11 = new ButtonAplicacao("11", ButtonAplicacao.BBB_ICON, false);
        this.nivel12 = new ButtonAplicacao("12", ButtonAplicacao.BBB_ICON, false);
        this.nivel13 = new ButtonAplicacao("13", ButtonAplicacao.BBB_ICON, false);
        this.nivel14 = new ButtonAplicacao("14", ButtonAplicacao.BBB_ICON, false);
        this.nivel15 = new ButtonAplicacao("15", ButtonAplicacao.BBB_ICON, false);
        this.nivel16 = new ButtonAplicacao("16", ButtonAplicacao.BBB_ICON, false);
        this.nivel17 = new ButtonAplicacao("17", ButtonAplicacao.BBB_ICON, false);
        this.nivel18 = new ButtonAplicacao("18", ButtonAplicacao.BBB_ICON, false);
        this.nivel19 = new ButtonAplicacao("19", ButtonAplicacao.BBB_ICON, false);
        this.nivel20 = new ButtonAplicacao("20", ButtonAplicacao.BBB_ICON, false);
        this.nivel21 = new ButtonAplicacao("21", ButtonAplicacao.BBB_ICON, false);
        this.nivel22 = new ButtonAplicacao("22", ButtonAplicacao.BBB_ICON, false);
        this.nivel23 = new ButtonAplicacao("23", ButtonAplicacao.BBB_ICON, false);
        this.nivel24 = new ButtonAplicacao("24", ButtonAplicacao.BBB_ICON, false);
        this.nivel25 = new ButtonAplicacao("25", ButtonAplicacao.BBB_ICON, false);
        
        panelNiveis.add(this.nivel1);
        panelNiveis.add(this.nivel2);
        panelNiveis.add(this.nivel3);
        panelNiveis.add(this.nivel4);
        panelNiveis.add(this.nivel5);
        panelNiveis.add(this.nivel6);
        panelNiveis.add(this.nivel7);
        panelNiveis.add(this.nivel8);
        panelNiveis.add(this.nivel9);
        panelNiveis.add(this.nivel10);
        panelNiveis.add(this.nivel11);
        panelNiveis.add(this.nivel12);
        panelNiveis.add(this.nivel13);
        panelNiveis.add(this.nivel14);
        panelNiveis.add(this.nivel15);
        panelNiveis.add(this.nivel16);
        panelNiveis.add(this.nivel17);
        panelNiveis.add(this.nivel18);
        panelNiveis.add(this.nivel19);
        panelNiveis.add(this.nivel20);
        panelNiveis.add(this.nivel21);
        panelNiveis.add(this.nivel22);
        panelNiveis.add(this.nivel23);
        panelNiveis.add(this.nivel24);
        panelNiveis.add(this.nivel25);
        
        contentPane.add(panelNiveis, "Center");
    }
    
    public int getNumNivelSelecionado() {
        return 0;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ControllerJogo94;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.ModelJogo94;
import model.ModelNivel;
import model.ModelQuestao;

/**
 * Janela interna principal para selecao do nivel a ser jogado
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
    
    public ViewSelecaoNivel(ControllerJogo94 controlJogo) {
        super();
        this.setSize(300, 550);
        this.setFrameIcon(null);
        this.setBorder(null);
        
        Color corBackground = new Color(46, 217, 255);
        
        // container da tela
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BorderLayout());
        
        // cabecalho da tela com logo do jogo
        JPanel panelCabecalho = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
        panelCabecalho.setBackground(corBackground);
        ImageIcon logo = new ImageIcon("Imagens\\logo.png");
        panelCabecalho.add(new JLabel(logo));
        
        contentPane.add(panelCabecalho, "North");
        
        // panel para os niveis disponiveis no jogo
        JPanel panelNiveis = new JPanel(new GridLayout(5, 5, 5, 5));
        panelNiveis.setBackground(corBackground);
        
        // um botao da classe ButtonAplicacao para cada nivel
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
        
        // inclusao dos botoes no panel
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
        
        // inclusão dos eventos da tela        
        this.nivel1.addActionListener(controlJogo);
        this.nivel2.addActionListener(controlJogo);
        this.nivel3.addActionListener(controlJogo);
        this.nivel4.addActionListener(controlJogo);
        this.nivel5.addActionListener(controlJogo);
        this.nivel6.addActionListener(controlJogo);
        this.nivel7.addActionListener(controlJogo);
        this.nivel8.addActionListener(controlJogo);
        this.nivel9.addActionListener(controlJogo);
        this.nivel10.addActionListener(controlJogo);
        this.nivel11.addActionListener(controlJogo);
        this.nivel12.addActionListener(controlJogo);
        this.nivel13.addActionListener(controlJogo);
        this.nivel14.addActionListener(controlJogo);
        this.nivel15.addActionListener(controlJogo);
        this.nivel16.addActionListener(controlJogo);
        this.nivel17.addActionListener(controlJogo);
        this.nivel18.addActionListener(controlJogo);
        this.nivel19.addActionListener(controlJogo);
        this.nivel20.addActionListener(controlJogo);
        this.nivel21.addActionListener(controlJogo);
        this.nivel22.addActionListener(controlJogo);
        this.nivel23.addActionListener(controlJogo);
        this.nivel24.addActionListener(controlJogo);
        this.nivel25.addActionListener(controlJogo);
    }
    
    /**
     * Ajusta nivel ao voltar da tela de selecao de questao
     * 
     * @param nivelAtual
     */
    public void ajustarNivel(ModelNivel nivelAtual) {
        // ajusta estrelas do nivel que acabou de ser jogado
        // caso o nivel tenha ao menos uma estrela, desbloqueia proximo nivel
        switch (nivelAtual.getNumNivel()) {
            case 1:
                ajustarEstrelasNivel(this.nivel1, nivelAtual);
                this.nivel2.setEnabled(nivelAtual.getNivelFinalizado());
                break;
            case 2:
                ajustarEstrelasNivel(this.nivel2, nivelAtual);
                this.nivel3.setEnabled(nivelAtual.getNivelFinalizado());
                break;
            case 3:
                ajustarEstrelasNivel(this.nivel3, nivelAtual);
                this.nivel4.setEnabled(nivelAtual.getNivelFinalizado());
                break;
            case 4:
                ajustarEstrelasNivel(this.nivel4, nivelAtual);
                this.nivel5.setEnabled(nivelAtual.getNivelFinalizado());
                break;
            case 5:
                ajustarEstrelasNivel(this.nivel5, nivelAtual);
                this.nivel6.setEnabled(nivelAtual.getNivelFinalizado());
                break;
            case 6:
                ajustarEstrelasNivel(this.nivel6, nivelAtual);
                this.nivel7.setEnabled(nivelAtual.getNivelFinalizado());
                break;
            case 7:
                ajustarEstrelasNivel(this.nivel7, nivelAtual);
                this.nivel8.setEnabled(nivelAtual.getNivelFinalizado());
                break;
            case 8:
                ajustarEstrelasNivel(this.nivel8, nivelAtual);
                this.nivel9.setEnabled(nivelAtual.getNivelFinalizado());
                break;
            case 9:
                ajustarEstrelasNivel(this.nivel9, nivelAtual);
                this.nivel10.setEnabled(nivelAtual.getNivelFinalizado());
                break;
            case 10:
                ajustarEstrelasNivel(this.nivel10, nivelAtual);
                this.nivel11.setEnabled(nivelAtual.getNivelFinalizado());
                break;
            case 11:
                ajustarEstrelasNivel(this.nivel11, nivelAtual);
                this.nivel12.setEnabled(nivelAtual.getNivelFinalizado());
                break;
            case 12:
                ajustarEstrelasNivel(this.nivel12, nivelAtual);
                this.nivel13.setEnabled(nivelAtual.getNivelFinalizado());
                break;
            case 13:
                ajustarEstrelasNivel(this.nivel13, nivelAtual);
                this.nivel14.setEnabled(nivelAtual.getNivelFinalizado());
                break;
            case 14:
                ajustarEstrelasNivel(this.nivel14, nivelAtual);
                this.nivel15.setEnabled(nivelAtual.getNivelFinalizado());
                break;
            case 15:
                ajustarEstrelasNivel(this.nivel15, nivelAtual);
                this.nivel16.setEnabled(nivelAtual.getNivelFinalizado());
                break;
            case 16:
                ajustarEstrelasNivel(this.nivel16, nivelAtual);
                this.nivel17.setEnabled(nivelAtual.getNivelFinalizado());
                break;
            case 17:
                ajustarEstrelasNivel(this.nivel17, nivelAtual);
                this.nivel18.setEnabled(nivelAtual.getNivelFinalizado());
                break;
            case 18:
                ajustarEstrelasNivel(this.nivel18, nivelAtual);
                this.nivel19.setEnabled(nivelAtual.getNivelFinalizado());
                break;
            case 19:
                ajustarEstrelasNivel(this.nivel19, nivelAtual);
                this.nivel20.setEnabled(nivelAtual.getNivelFinalizado());
                break;
            case 20:
                ajustarEstrelasNivel(this.nivel20, nivelAtual);
                this.nivel21.setEnabled(nivelAtual.getNivelFinalizado());
                break;
            case 21:
                ajustarEstrelasNivel(this.nivel21, nivelAtual);
                this.nivel22.setEnabled(nivelAtual.getNivelFinalizado());
                break;
            case 22:
                ajustarEstrelasNivel(this.nivel22, nivelAtual);
                this.nivel23.setEnabled(nivelAtual.getNivelFinalizado());
                break;
            case 23:
                ajustarEstrelasNivel(this.nivel23, nivelAtual);
                this.nivel24.setEnabled(nivelAtual.getNivelFinalizado());
                break;
            case 24:
                ajustarEstrelasNivel(this.nivel24, nivelAtual);
                this.nivel25.setEnabled(nivelAtual.getNivelFinalizado());
                break;
            case 25:
                ajustarEstrelasNivel(this.nivel25, nivelAtual);
                break;
        }
    }
    
    /**
     * Ajusta quantidade e posicionamento de estrelas de botao de nivel especifico
     * 
     * @param botao
     * @param nivel
     */
    private void ajustarEstrelasNivel(ButtonAplicacao botao, ModelNivel nivel) {
        boolean estrelaQuestao[] = new boolean[3];
        
        // seta valores das estrelas
        for (int i = 0; i < 3; i++) {
            estrelaQuestao[i] = nivel.getQuestoes().get(i).getQuestaoFinalizada();
        }
        
        // identifica icone utilizado dependendo da quantidade de questoes finalizadas
        if (estrelaQuestao[0]) {
            if (estrelaQuestao[1]) {
                if (estrelaQuestao[2]) {
                    botao.setIcon(ButtonAplicacao.AAA_ICON);
                } else {
                    botao.setIcon(ButtonAplicacao.AAB_ICON);
                }
            } else {
                if (estrelaQuestao[2]) {
                    botao.setIcon(ButtonAplicacao.ABA_ICON);
                } else {
                    botao.setIcon(ButtonAplicacao.ABB_ICON);
                }
            }
        } else {
            if (estrelaQuestao[1]) {
                if (estrelaQuestao[2]) {
                    botao.setIcon(ButtonAplicacao.BAA_ICON);
                } else {
                    botao.setIcon(ButtonAplicacao.BAB_ICON);
                }
            } else {
                if (estrelaQuestao[2]) {
                    botao.setIcon(ButtonAplicacao.BBA_ICON);
                } else {
                    botao.setIcon(ButtonAplicacao.BBB_ICON);
                }
            }
        }
    }
    
    public ButtonAplicacao getNivel1() {
        return this.nivel1;
    }
    
    public ButtonAplicacao getNivel2() {
        return this.nivel2;
    }
    
    public ButtonAplicacao getNivel3() {
        return this.nivel3;
    }
    
    public ButtonAplicacao getNivel4() {
        return this.nivel4;
    }
    
    public ButtonAplicacao getNivel5() {
        return this.nivel5;
    }
    
    public ButtonAplicacao getNivel6() {
        return this.nivel6;
    }
    
    public ButtonAplicacao getNivel7() {
        return this.nivel7;
    }
    
    public ButtonAplicacao getNivel8() {
        return this.nivel8;
    }
    
    public ButtonAplicacao getNivel9() {
        return this.nivel9;
    }
    
    public ButtonAplicacao getNivel10() {
        return this.nivel10;
    }
    
    public ButtonAplicacao getNivel11() {
        return this.nivel11;
    }
    
    public ButtonAplicacao getNivel12() {
        return this.nivel12;
    }
    
    public ButtonAplicacao getNivel13() {
        return this.nivel13;
    }
    
    public ButtonAplicacao getNivel14() {
        return this.nivel14;
    }
    
    public ButtonAplicacao getNivel15() {
        return this.nivel15;
    }
    
    public ButtonAplicacao getNivel16() {
        return this.nivel16;
    }
    
    public ButtonAplicacao getNivel17() {
        return this.nivel17;
    }
    
    public ButtonAplicacao getNivel18() {
        return this.nivel18;
    }
    
    public ButtonAplicacao getNivel19() {
        return this.nivel19;
    }
    
    public ButtonAplicacao getNivel20() {
        return this.nivel20;
    }
    
    public ButtonAplicacao getNivel21() {
        return this.nivel21;
    }
    
    public ButtonAplicacao getNivel22() {
        return this.nivel22;
    }
    
    public ButtonAplicacao getNivel23() {
        return this.nivel23;
    }
    
    public ButtonAplicacao getNivel24() {
        return this.nivel24;
    }
    
    public ButtonAplicacao getNivel25() {
        return this.nivel25;
    }
}

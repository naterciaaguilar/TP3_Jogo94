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
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.ModelNivel;

/**
 * Janela interna principal para selecao do nivel a ser jogado
 * 
 * @author User
 */
public class ViewSelecaoNivel extends JInternalFrame {
    private ArrayList<ButtonAplicacao> niveis;
    
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
        
        // cria um botao da classe ButtonAplicacao para cada nivel e inclui no panel de niveis
        niveis = new ArrayList<ButtonAplicacao>();
        this.niveis.add(new ButtonAplicacao("1", ButtonAplicacao.BBB_ICON, true));
        panelNiveis.add(this.niveis.get(0));
        for (int i = 2; i <= 25; i++) {
            this.niveis.add(new ButtonAplicacao(String.valueOf(i), ButtonAplicacao.BBB_ICON, false));
            panelNiveis.add(this.niveis.get(i - 1));
        }
        
        contentPane.add(panelNiveis, "Center");
        
        // inclusão dos eventos da tela  
        for (int i = 0; i < 25; i++) {
            this.niveis.get(i).addActionListener(controlJogo);
        }
    }
    
    /**
     * Ajusta nivel ao voltar da tela de selecao de questao
     * 
     * @param nivelAtual
     */
    public void ajustarNivel(ModelNivel nivelAtual) {
        // ajusta estrelas do nivel que acabou de ser jogado
        // caso o nivel tenha ao menos uma estrela, desbloqueia proximo nivel
        ajustarEstrelasNivel(this.niveis.get(nivelAtual.getNumNivel() - 1), nivelAtual);
        if (nivelAtual.getNumNivel() < 25) {
            this.niveis.get(nivelAtual.getNumNivel()).setEnabled(nivelAtual.getNivelFinalizado());
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
    
    public ButtonAplicacao getNivel(int i) {
        return this.niveis.get(i - 1);
    }
    
    public ArrayList<ButtonAplicacao> getNiveis() {
        return this.niveis;
    }
}

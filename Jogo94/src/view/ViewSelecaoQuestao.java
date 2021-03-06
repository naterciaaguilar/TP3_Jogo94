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
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.ModelNivel;
import model.ModelQuestao;

/**
 * Janela interna para selecao da questao que sera respondida para cada nivel
 * 
 * @author User
 */
public class ViewSelecaoQuestao extends JInternalFrame {
    private JLabel numNivel;
    private JButton voltar;
    
    private ButtonAplicacao questao1;
    private ButtonAplicacao questao2;
    private ButtonAplicacao questao3;
    
    private int numNivelAtual;
    
    public ViewSelecaoQuestao(ControllerJogo94 controlJogo) {
        super();
        this.setSize(300, 550);
        this.setFrameIcon(null);
        this.setBorder(null);
        
        Color corBackground = new Color(46, 217, 255);
        
        // container da tela
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BorderLayout());

        // cabecalho da tela com botao de volta
        JPanel panelCabecalho = new JPanel(new BorderLayout(10, 10));
        panelCabecalho.setBackground(corBackground);

        this.voltar = new JButton("Voltar");
        panelCabecalho.add(this.voltar);
        
        contentPane.add(panelCabecalho, "North");
        
        // area central da tela com numero do nivel e botoes para cada questao
        JPanel panelGeral = new JPanel(new GridLayout(1, 2));
        panelGeral.setBackground(corBackground);
                
        // area para nome do nivel
        JPanel panelNomeNivel = new JPanel(new GridLayout(4, 1, 10, 10));
        panelNomeNivel.setBackground(corBackground);
        
        JLabel nivel = new JLabel("Nível");
        nivel.setFont(new Font("Arial", Font.PLAIN, 20));
        nivel.setForeground(Color.WHITE);
        nivel.setVerticalAlignment(JLabel.BOTTOM);
        nivel.setHorizontalAlignment(JLabel.CENTER);
        
        this.numNivel = new JLabel("");
        this.numNivel.setFont(new Font("Arial", Font.BOLD, 50));
        this.numNivel.setForeground(Color.WHITE);
        this.numNivel.setVerticalAlignment(JLabel.NORTH);
        this.numNivel.setHorizontalAlignment(JLabel.CENTER);

        panelNomeNivel.add(new JLabel(""));
        panelNomeNivel.add(nivel);
        panelNomeNivel.add(this.numNivel);
        panelNomeNivel.add(new JLabel(""));
        
        panelGeral.add(panelNomeNivel);
        
        // area para os botoes das questoes
        JPanel panelQuestoes = new JPanel(new GridLayout(3, 1, 10, 10));
        panelQuestoes.setBackground(corBackground);
        
        this.questao1 = new ButtonAplicacao("", ButtonAplicacao.B_ICON, true);
        this.questao2 = new ButtonAplicacao("", ButtonAplicacao.B_ICON, true);
        this.questao3 = new ButtonAplicacao("<html><center>Imagem</center></html>", ButtonAplicacao.B_ICON, true);
        
        panelQuestoes.add(this.questao1);
        panelQuestoes.add(this.questao2);
        panelQuestoes.add(this.questao3);
        
        panelGeral.add(panelQuestoes);
        
        contentPane.add(panelGeral, "Center");
        
        // eventos da tela
        this.voltar.addActionListener(controlJogo);
        
        this.questao1.addActionListener(controlJogo);
        this.questao2.addActionListener(controlJogo);
        this.questao3.addActionListener(controlJogo);
        
        // seta valor de numNivel
        this.numNivelAtual = 0;
    }
    
    /**
     * Para cada nivel aberto, a tela e configurada com suas questoes e verificado se possuem ou nao 
     * estrelas (questoes completas)
     * 
     * @param nivel
     */
    public void configurarNivel(ModelNivel nivel) {
        this.numNivel.setText(String.valueOf(nivel.getNumNivel()));
        
        this.questao1.setText("<html><center>" + nivel.getQuestao(0).getDescricao() + "</html></center>");
        this.questao2.setText("<html><center>" + nivel.getQuestao(1).getDescricao() + "</html></center>");
        
        // avalia se questões já foram respondidas para adaptar estrelas
        for (ModelQuestao questao : nivel.getQuestoes()) {
            this.ajustarQuestao(questao);
        }
        
        // seta nivel
        this.numNivelAtual = nivel.getNumNivel();
    }
    
    /**
     * Ajusta estrela da questao de acordo com suas respostas
     * 
     * @param questaoAtual
     */
    public void ajustarQuestao(ModelQuestao questaoAtual) {
        if (questaoAtual.getQuestaoFinalizada()) {
            switch (questaoAtual.getNumQuestao()) {
                case 1:
                    this.questao1.setIcon(ButtonAplicacao.A_ICON);
                    break;
                case 2:
                    this.questao2.setIcon(ButtonAplicacao.A_ICON);
                    break;
                case 3:
                    this.questao3.setIcon(ButtonAplicacao.A_ICON);
                    break;
            }
        } else {
            switch (questaoAtual.getNumQuestao()) {
                case 1:
                    this.questao1.setIcon(ButtonAplicacao.B_ICON);
                    break;
                case 2:
                    this.questao2.setIcon(ButtonAplicacao.B_ICON);
                    break;
                case 3:
                    this.questao3.setIcon(ButtonAplicacao.B_ICON);
                    break;
            }
        }       
    }
    
    public int getNumNivel() {
        return this.numNivelAtual;
    }
    
    public JButton getVoltar() {
        return this.voltar;
    }
    
    public ButtonAplicacao getQuestao1() {
        return this.questao1;
    }
    
    public ButtonAplicacao getQuestao2() {
        return this.questao2;
    }
    
    public ButtonAplicacao getQuestao3() {
        return this.questao3;
    }
}

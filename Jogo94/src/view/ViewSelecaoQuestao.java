/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class ViewSelecaoQuestao extends JInternalFrame {
    private JLabel numNivel;
    
    private ButtonAplicacao questao1;
    private ButtonAplicacao questao2;
    private ButtonAplicacao questao3;
    
    public ViewSelecaoQuestao() {
        super();
        this.setSize(300, 550);
        this.setFrameIcon(null);
        this.setBorder(null);
        
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BorderLayout());

        JPanel panelCabecalho = new JPanel(new BorderLayout(10, 10));
        panelCabecalho.setBackground(new Color(46, 217, 255));

        JButton voltar = new JButton("Voltar");
        panelCabecalho.add(voltar);
        
        contentPane.add(panelCabecalho, "North");
        
        JPanel panelGeral = new JPanel(new GridLayout(1, 2));
        panelGeral.setBackground(new Color(46, 217, 255));
                
        JPanel panelNomeNivel = new JPanel(new GridLayout(4, 1, 10, 10));
        panelNomeNivel.setBackground(new Color(46, 217, 255));
        
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
        
        JPanel panelQuestoes = new JPanel(new GridLayout(3, 1, 10, 10));
        panelQuestoes.setBackground(new Color(46, 217, 255));
        
        this.questao1 = new ButtonAplicacao("", ButtonAplicacao.B_ICON, true);
        this.questao2 = new ButtonAplicacao("", ButtonAplicacao.B_ICON, true);
        this.questao3 = new ButtonAplicacao("<html><center>Imagem</center></html>", ButtonAplicacao.B_ICON, true);
        
        panelQuestoes.add(this.questao1);
        panelQuestoes.add(this.questao2);
        panelQuestoes.add(this.questao3);
        
        panelGeral.add(panelQuestoes);
        
        contentPane.add(panelGeral, "Center");
    }
    
    public void configurarNivel() {
        
    }
    
    public int getNumNivel() {
        return 0;
    }
    
    public int getNumQuestaoSelecionada() {
        return 0;
    }
}

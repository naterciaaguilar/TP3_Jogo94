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
    
    public ViewSelecaoQuestao() {
        super();
        this.setSize(300, 550);
        this.setFrameIcon(null);
        this.setBorder(null);
        
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BorderLayout());

        JPanel panelCabecalho = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        panelCabecalho.setBackground(new Color(46, 217, 255));

        JButton voltar = new JButton("Voltar");
        panelCabecalho.add(voltar);
        
        contentPane.add(panelCabecalho, "North");
        
        JPanel panelGeral = new JPanel(new GridLayout(1, 2));
        panelGeral.setBackground(new Color(46, 217, 255));
                
        JPanel panelNomeNivel = new JPanel(new GridLayout(4, 1, 10, 10));
        panelNomeNivel.setBackground(new Color(46, 217, 255));
        
        JLabel nivel = new JLabel("");
        nivel.setFont(new Font("Arial", Font.PLAIN, 20));
        nivel.setForeground(Color.WHITE);
        nivel.setVerticalAlignment(JLabel.BOTTOM);
        nivel.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel numNivel = new JLabel("");
        numNivel.setFont(new Font("Serif", Font.BOLD, 50));
        numNivel.setForeground(Color.WHITE);
        numNivel.setVerticalAlignment(JLabel.NORTH);
        numNivel.setHorizontalAlignment(JLabel.CENTER);

        panelNomeNivel.add(new JLabel(""));
        panelNomeNivel.add(nivel);
        panelNomeNivel.add(numNivel);
        panelNomeNivel.add(new JLabel(""));
        
        panelGeral.add(panelNomeNivel);
        
        JPanel panelQuestoes = new JPanel(new GridLayout(3, 1, 10, 10));
        panelQuestoes.setBackground(new Color(46, 217, 255));
        
        ButtonAplicacao questao1 = new ButtonAplicacao("", ButtonAplicacao.B_ICON, true);
        ButtonAplicacao questao2 = new ButtonAplicacao("", ButtonAplicacao.B_ICON, true);
        ButtonAplicacao questao3 = new ButtonAplicacao("", ButtonAplicacao.B_ICON, true);
        
        panelQuestoes.add(questao1);
        panelQuestoes.add(questao2);
        panelQuestoes.add(questao3);
        
        panelGeral.add(panelQuestoes);
        
        contentPane.add(panelGeral, "Center");
        
        JPanel panelRodape = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        panelRodape.setBackground(new Color(46, 217, 255));
        
        contentPane.add(panelRodape, "South");
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

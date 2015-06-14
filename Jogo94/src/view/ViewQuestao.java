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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class ViewQuestao extends JInternalFrame {
    
    public ViewQuestao() {
        super();
        this.setSize(300, 550);
        this.setFrameIcon(null);
        this.setBorder(null);
        
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BorderLayout());

        JPanel panelCabecalho = new JPanel(new GridLayout(2, 1, 5, 5));
        panelCabecalho.setBackground(new Color(46, 217, 255));

        JButton voltar = new JButton("Voltar");
        
        JLabel porcentagem = new JLabel("0%");
        porcentagem.setFont(new Font("Arial", Font.BOLD, 15));
        porcentagem.setForeground(Color.WHITE);
        porcentagem.setVerticalAlignment(JLabel.CENTER);
        porcentagem.setHorizontalAlignment(JLabel.CENTER);
               
        panelCabecalho.add(voltar);
        panelCabecalho.add(porcentagem);
        
        contentPane.add(panelCabecalho, "North");
        
        JPanel panelGeral = new JPanel(new GridLayout(2, 1));
        panelGeral.setBackground(new Color(46, 217, 255));
                
        JPanel panelQuestao = new JPanel(new BorderLayout());
        panelQuestao.setBackground(new Color(46, 217, 255));
                
        ImageIcon imgQuestao = new ImageIcon("");
        JLabel questao = new JLabel("<html><center></center></html>", imgQuestao, JLabel.CENTER);
        questao.setFont(new Font("Arial", Font.PLAIN, 20));
        questao.setForeground(Color.WHITE);
        questao.setVerticalAlignment(JLabel.CENTER);
        
        panelQuestao.add(questao);
        
        panelGeral.add(panelQuestao);
        
        JPanel panelRespostas = new JPanel(new GridLayout(3, 3, 10, 10));
        panelRespostas.setBackground(new Color(46, 217, 255));
        
        JButton resp1 = new JButton("0%");
        JButton resp2 = new JButton("0%");
        JButton resp3 = new JButton("0%");
        JButton resp4 = new JButton("0%");
        JButton resp5 = new JButton("0%");
        JButton resp6 = new JButton("0%");
        JButton resp7 = new JButton("0%");
        JButton resp8 = new JButton("0%");
        JButton resp9 = new JButton("0%");
        
        panelRespostas.add(resp1);
        panelRespostas.add(resp2);
        panelRespostas.add(resp3);
        panelRespostas.add(resp4);
        panelRespostas.add(resp5);
        panelRespostas.add(resp6);
        panelRespostas.add(resp7);
        panelRespostas.add(resp8);
        panelRespostas.add(resp9);
        
        panelGeral.add(panelRespostas);
        
        contentPane.add(panelGeral, "Center");
        
        JPanel panelRodape = new JPanel(new GridLayout(2, 1));
        panelRodape.setBackground(new Color(46, 217, 255));
        
        JLabel dica = new JLabel("Para obter uma dica, clique sobre alguma resposta");
        dica.setFont(new Font("Arial", Font.PLAIN, 12));
        dica.setForeground(Color.WHITE);
        dica.setVerticalAlignment(JLabel.CENTER);
        dica.setHorizontalAlignment(JLabel.CENTER);
        
        panelRodape.add(dica);
        
        JPanel panelResposta = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelResposta.setBackground(new Color(46, 217, 255));
        
        JLabel lblResposta = new JLabel("Resposta: ");
        JTextField resposta = new JTextField(12);
        JButton buttonOK = new JButton("OK");
        
        panelResposta.add(lblResposta);
        panelResposta.add(resposta);
        panelResposta.add(buttonOK);
        
        panelRodape.add(panelResposta);
        
        contentPane.add(panelRodape, "South");
    }
    
    public int getNumNivel() {
        return 0;
    }
    
    public int getNumQuestao() {
        return 0;
    }
    
    public String getPalavra() {
        return "";
    }
}

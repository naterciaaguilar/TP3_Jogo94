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
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.ModelQuestao;
import model.ModelResposta;
import model.TipoQuestao;

/**
 * Janela interna para resposta de cada questao para as fases
 * 
 * @author User
 */
public class ViewQuestao extends JInternalFrame {
    private JLabel porcentagem; 
    private JLabel questao;
    
    private JButton voltar;
    private JButton buttonOK;
    private JButton resp1;
    private JButton resp2;
    private JButton resp3;
    private JButton resp4;
    private JButton resp5;
    private JButton resp6;
    private JButton resp7;
    private JButton resp8;
    private JButton resp9;
    
    private JTextField respJogador;
    
    private int numNivelAtual;
    private int numQuestaoAtual;
    
    public ViewQuestao(ControllerJogo94 controlJogo) {
        super();
        this.setSize(300, 550);
        this.setFrameIcon(null);
        this.setBorder(null);
        
        Color corBackground = new Color(46, 217, 255);
        
        // container da tela
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BorderLayout());

        // cabecalho da tela com botao de volta e porcentagem da questao
        JPanel panelCabecalho = new JPanel(new GridLayout(2, 1, 5, 5));
        panelCabecalho.setBackground(corBackground);

        this.voltar = new JButton("Voltar");
        
        this.porcentagem = new JLabel("0%");
        this.porcentagem.setFont(new Font("Arial", Font.BOLD, 15));
        this.porcentagem.setForeground(Color.WHITE);
        this.porcentagem.setVerticalAlignment(JLabel.CENTER);
        this.porcentagem.setHorizontalAlignment(JLabel.CENTER);
               
        panelCabecalho.add(this.voltar);
        panelCabecalho.add(this.porcentagem);
        
        contentPane.add(panelCabecalho, "North");
        
        // area central da tela
        JPanel panelGeral = new JPanel(new GridLayout(2, 1));
        panelGeral.setBackground(corBackground);
        
        // panel para exibicao da questao ou imagem
        JPanel panelQuestao = new JPanel(new BorderLayout());
        panelQuestao.setBackground(corBackground);
                
        this.questao = new JLabel("");
        this.questao.setFont(new Font("Arial", Font.PLAIN, 20));
        this.questao.setForeground(Color.WHITE);
        this.questao.setVerticalAlignment(JLabel.CENTER);
        this.questao.setHorizontalAlignment(JLabel.CENTER);
        
        panelQuestao.add(this.questao);
        
        panelGeral.add(panelQuestao);
        
        // area com todas as respostas e botoes de dicas
        JPanel panelRespostas = new JPanel(new GridLayout(3, 3, 10, 10));
        panelRespostas.setBackground(corBackground);
        
        this.resp1 = new JButton("0%");
        this.resp2 = new JButton("0%");
        this.resp3 = new JButton("0%");
        this.resp4 = new JButton("0%");
        this.resp5 = new JButton("0%");
        this.resp6 = new JButton("0%");
        this.resp7 = new JButton("0%");
        this.resp8 = new JButton("0%");
        this.resp9 = new JButton("0%");
        
        panelRespostas.add(this.resp1);
        panelRespostas.add(this.resp2);
        panelRespostas.add(this.resp3);
        panelRespostas.add(this.resp4);
        panelRespostas.add(this.resp5);
        panelRespostas.add(this.resp6);
        panelRespostas.add(this.resp7);
        panelRespostas.add(this.resp8);
        panelRespostas.add(this.resp9);
        
        panelGeral.add(panelRespostas);
        
        contentPane.add(panelGeral, "Center");
        
        // rodape com mensagem de dicas e area de digitacao da resposta
        JPanel panelRodape = new JPanel(new GridLayout(2, 1));
        panelRodape.setBackground(corBackground);
        
        JLabel dica = new JLabel("Para obter uma dica, clique sobre alguma resposta");
        dica.setFont(new Font("Arial", Font.PLAIN, 12));
        dica.setForeground(Color.WHITE);
        dica.setVerticalAlignment(JLabel.CENTER);
        dica.setHorizontalAlignment(JLabel.CENTER);
        
        panelRodape.add(dica);
        
        JPanel panelResposta = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelResposta.setBackground(corBackground);
        
        JLabel lblResposta = new JLabel("Resposta: ");
        this.respJogador = new JTextField(12);
        this.buttonOK = new JButton("OK");
        
        panelResposta.add(lblResposta);
        panelResposta.add(this.respJogador);
        panelResposta.add(this.buttonOK);
        
        panelRodape.add(panelResposta);
        
        contentPane.add(panelRodape, "South");
        
        // eventos da tela
        this.voltar.addActionListener(controlJogo);

        this.resp1.addActionListener(controlJogo);
        this.resp2.addActionListener(controlJogo);
        this.resp3.addActionListener(controlJogo);
        this.resp4.addActionListener(controlJogo);
        this.resp5.addActionListener(controlJogo);
        this.resp6.addActionListener(controlJogo);
        this.resp7.addActionListener(controlJogo);
        this.resp8.addActionListener(controlJogo);
        this.resp9.addActionListener(controlJogo);
        
        this.buttonOK.addActionListener(controlJogo);
        this.respJogador.addActionListener(controlJogo);
        
        // numeros de nivel e questao
        this.numNivelAtual = 0;
        this.numQuestaoAtual = 0;
    }
    
    /**
     * Configura a tela para nova questao aberta
     * 
     * @param questaoAtual
     */
    public void configurarQuestao(ModelQuestao questaoAtual) {
        // seta valor do label dependendo do tipo de questao
        if (questaoAtual.getTipoQuestao() == TipoQuestao.Pergunta) {
            this.questao.setText("<html><center>" + questaoAtual.getDescricao() + "</center></html>");
            this.questao.setIcon(null);
        } else {
            this.questao.setText(null);
            this.questao.setIcon(new ImageIcon("Imagens/Questoes/" + questaoAtual.getDescricao()));
        }
        
        // ajusta porcentagem de acerto de acordo com respostas já acertadas
        this.ajustarPorcentagem(questaoAtual);        
        
        // configura respostas para a questao
        this.configurarRespostasQuestao(questaoAtual);
        
        // limpa textfield de reposta
        this.respJogador.setText("");
        
        // seta numero do nivel e da questao
        this.numNivelAtual = questaoAtual.getNivel().getNumNivel();
        this.numQuestaoAtual = questaoAtual.getNumQuestao();
    }
    
    /**
     * Ajusta porcentagem de acerto da questao atual
     * 
     * @param questaoAtual
     */
    public void ajustarPorcentagem(ModelQuestao questaoAtual) {
        int porcentagemAcerto = 0;
        
        for (ModelResposta resposta : questaoAtual.getRespostas()) {
            if (resposta.getRespondida()) {
                porcentagemAcerto += resposta.getPorcentagem();
            }
        }
        
        this.porcentagem.setText("<html><center>" + String.valueOf(porcentagemAcerto) + "%</center></html>");
    }
    
    /**
     * Configura os botoes de resposta para todas as repostas da questao
     * 
     * @param questaoAtual
     */
    private void configurarRespostasQuestao(ModelQuestao questaoAtual) {
        int numRespostas = questaoAtual.getRespostas().size();
        ModelResposta resposta;
        
        // deixa visivel apenas o numero de botoes para cada resposta
        this.resp1.setVisible(numRespostas >= 1);
        this.resp2.setVisible(numRespostas >= 2);
        this.resp3.setVisible(numRespostas >= 3);
        this.resp4.setVisible(numRespostas >= 4);
        this.resp5.setVisible(numRespostas >= 5);
        this.resp6.setVisible(numRespostas >= 6);
        this.resp7.setVisible(numRespostas >= 7);
        this.resp8.setVisible(numRespostas >= 8);
        this.resp9.setVisible(numRespostas >= 9);
        
        // configura conteudo das respostas
        if (numRespostas >= 1) {
            resposta = questaoAtual.getRespostas().get(0);
            this.ajustarResposta(resposta, 1);
        }
        if (numRespostas >= 2) {
            resposta = questaoAtual.getRespostas().get(1);
            this.ajustarResposta(resposta, 2);
        }
        if (numRespostas >= 3) {
            resposta = questaoAtual.getRespostas().get(2);
            this.ajustarResposta(resposta, 3);
        }
        if (numRespostas >= 4) {
            resposta = questaoAtual.getRespostas().get(3);
            this.ajustarResposta(resposta, 4);
        }
        if (numRespostas >= 5) {
            resposta = questaoAtual.getRespostas().get(4);
            this.ajustarResposta(resposta, 5);
        }
        if (numRespostas >= 6) {
            resposta = questaoAtual.getRespostas().get(5);
            this.ajustarResposta(resposta, 6);
        }
        if (numRespostas >= 7) {
            resposta = questaoAtual.getRespostas().get(6);
            this.ajustarResposta(resposta, 7);
        }
        if (numRespostas >= 8) {
            resposta = questaoAtual.getRespostas().get(7);
            this.ajustarResposta(resposta, 8);
        }
        if (numRespostas >= 9) {
            resposta = questaoAtual.getRespostas().get(8);
            this.ajustarResposta(resposta, 9);
        }
    }
    
    /**
     * Ajusta questao respondida corretamente pelo usuario
     * 
     * @param resposta
     * @param indexPalavra
     */
    public void ajustarResposta(ModelResposta resposta, int indexPalavra) {
        switch (indexPalavra) {
            case 1:
                if (resposta.getRespondida()) {
                    this.resp1.setText("<html><center>" + String.valueOf(resposta.getPorcentagem()) + "%<br />" + resposta.getPalavra() + "</center></html>");
                } else {
                    this.resp1.setText("<html><center>" + String.valueOf(resposta.getPorcentagem()) + "%</center></html>");                
                }
                this.resp1.setEnabled(!resposta.getRespondida());
                break;
            case 2:
                if (resposta.getRespondida()) {
                    this.resp2.setText("<html><center>" + String.valueOf(resposta.getPorcentagem()) + "%<br />" + resposta.getPalavra() + "</center></html>");
                } else {
                    this.resp2.setText("<html><center>" + String.valueOf(resposta.getPorcentagem()) + "%</center></html>");                
                }
                this.resp2.setEnabled(!resposta.getRespondida());
                break;
            case 3:
                if (resposta.getRespondida()) {
                    this.resp3.setText("<html><center>" + String.valueOf(resposta.getPorcentagem()) + "%<br />" + resposta.getPalavra() + "</center></html>");
                } else {
                    this.resp3.setText("<html><center>" + String.valueOf(resposta.getPorcentagem()) + "%</center></html>");                
                }
                this.resp3.setEnabled(!resposta.getRespondida());
                break;
            case 4:
                if (resposta.getRespondida()) {
                    this.resp4.setText("<html><center>" + String.valueOf(resposta.getPorcentagem()) + "%<br />" + resposta.getPalavra() + "</center></html>");
                } else {
                    this.resp4.setText("<html><center>" + String.valueOf(resposta.getPorcentagem()) + "%</center></html>");                
                }
                this.resp4.setEnabled(!resposta.getRespondida());
                break;
            case 5:
                if (resposta.getRespondida()) {
                    this.resp5.setText("<html><center>" + String.valueOf(resposta.getPorcentagem()) + "%<br />" + resposta.getPalavra() + "</center></html>");
                } else {
                    this.resp5.setText("<html><center>" + String.valueOf(resposta.getPorcentagem()) + "%</center></html>");                
                }
                this.resp5.setEnabled(!resposta.getRespondida());
                break;
            case 6:
                if (resposta.getRespondida()) {
                    this.resp6.setText("<html><center>" + String.valueOf(resposta.getPorcentagem()) + "%<br />" + resposta.getPalavra() + "</center></html>");
                } else {
                    this.resp6.setText("<html><center>" + String.valueOf(resposta.getPorcentagem()) + "%</center></html>");                
                }
                this.resp6.setEnabled(!resposta.getRespondida());
                break;
            case 7:
                if (resposta.getRespondida()) {
                    this.resp7.setText("<html><center>" + String.valueOf(resposta.getPorcentagem()) + "%<br />" + resposta.getPalavra() + "</center></html>");
                } else {
                    this.resp7.setText("<html><center>" + String.valueOf(resposta.getPorcentagem()) + "%</center></html>");                
                }
                this.resp7.setEnabled(!resposta.getRespondida());
                break;
            case 8:
                if (resposta.getRespondida()) {
                    this.resp8.setText("<html><center>" + String.valueOf(resposta.getPorcentagem()) + "%<br />" + resposta.getPalavra() + "</center></html>");
                } else {
                    this.resp8.setText("<html><center>" + String.valueOf(resposta.getPorcentagem()) + "%</center></html>");                
                }
                this.resp8.setEnabled(!resposta.getRespondida());
                break;
            case 9:
                if (resposta.getRespondida()) {
                    this.resp9.setText("<html><center>" + String.valueOf(resposta.getPorcentagem()) + "%<br />" + resposta.getPalavra() + "</center></html>");
                } else {
                    this.resp9.setText("<html><center>" + String.valueOf(resposta.getPorcentagem()) + "%</center></html>");                
                }
                this.resp9.setEnabled(!resposta.getRespondida());
                break;            
        }
    }
        
    /**
     * Mostra mensagem para resposta correta ou incorreta
     * 
     * @param ehCorreta
     */
    public void mostrarMensagemResposta(boolean ehCorreta) {
        if (ehCorreta) {
            JOptionPane.showMessageDialog(null, 
                                          "Parabens! Palavra correta!",
                                          "Resposta", 
                                          JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, 
                                          "Palavra incorreta! Por favor, tente novamente.",
                                          "Resposta", 
                                          JOptionPane.ERROR_MESSAGE);
        }
        
        // limpa textfield de resposta
        this.respJogador.setText("");
    }
        
    /**
     * Mostra mensagem de questao finalizada
     */
    public void mostrarMensagemFinalizacao() {
        JOptionPane.showMessageDialog(null, 
                                      "Parabens! Voce finalizou a questao!",
                                      "Questao Finalizada", 
                                      JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * Mostra dica com numero de letras e letra inicial da rsposta para o jogador
     * 
     * @param resposta
     */
    public void mostrarDica(ModelResposta resposta) {
        JOptionPane.showMessageDialog(null, 
                                      "A palavra contem " + String.valueOf(resposta.getPalavra().length()) + " letras e comeca com a letra " + resposta.getPalavra().substring(0, 1).toUpperCase() + ".",
                                      "Dica", 
                                      JOptionPane.INFORMATION_MESSAGE);
    }
    
    public int getNumNivel() {
        return this.numNivelAtual;
    }
    
    public int getNumQuestao() {
        return this.numQuestaoAtual;
    }
    
    public String getRespostaJogador() {
        return this.respJogador.getText();
    }
    
    public JButton getVoltar() {
        return this.voltar;
    }
    
    public JButton getButtonOK() {
        return this.buttonOK;
    }
    
    public JTextField getRespJogador() {
        return this.respJogador;
    }
    
    public JButton getResp1() {
        return this.resp1;
    }
    
    public JButton getResp2() {
        return this.resp2;
    }
    
    public JButton getResp3() {
        return this.resp3;
    }
    
    public JButton getResp4() {
        return this.resp4;
    }
    
    public JButton getResp5() {
        return this.resp5;
    }
    
    public JButton getResp6() {
        return this.resp6;
    }
    
    public JButton getResp7() {
        return this.resp7;
    }
    
    public JButton getResp8() {
        return this.resp8;
    }
    
    public JButton getResp9() {
        return this.resp9;
    }
}

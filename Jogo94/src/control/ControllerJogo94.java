/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import model.ModelJogo94;
import view.VisaoJogo94;

/**
 *
 * @author User
 */
public class ControllerJogo94 implements ActionListener {
    private ModelJogo94 jogoAtual;
    private VisaoJogo94 viewJogoAtual;
    
    public void inicializarJogo() {
        // cria fases e janelas do jogo
        this.jogoAtual = new ModelJogo94();
        this.viewJogoAtual = new VisaoJogo94(this);
    }
    
    /**
     * Seleciona um nivel quando o usuario clicar no botao e abre tela de selecao de questao
     * para este nivel
     * 
     * @param numNivel
     */
    public void selecionarNivel(int numNivel) {
        // troca tela visível
        this.viewJogoAtual.getTelaSelecaoNivel().setVisible(false);
        this.viewJogoAtual.getTelaSelecaoQuestao().setVisible(true);
        
        // configura nivel atual
        this.viewJogoAtual.getTelaSelecaoQuestao().configurarNivel(this.jogoAtual.getNivel(numNivel - 1));
    }
    
    /**
     * Seleciona uma questao quando o usuario clicar no botao e abre tela de resposta
     * para esta questao
     * 
     * @param numNivel
     * @param numQuestao
     */
    public void selecionarQuestao(int numNivel, int numQuestao) {
        // troca tela visível
        this.viewJogoAtual.getTelaSelecaoQuestao().setVisible(false);
        this.viewJogoAtual.getTelaRespostaQuestao().setVisible(true);
        
        // configura questao selecionada
        this.viewJogoAtual.getTelaRespostaQuestao().configurarQuestao(this.jogoAtual.getNivel(numNivel - 1).getQuestao(numQuestao - 1));
    }
    
    public void responderQuestao() {
        
    }
    
    /**
     * Volta para a tela de selecao de nivel, estando na tela de selecao de questao
     * 
     * @param numNivel
     */
    public void voltarTelaSelecaoNivel(int numNivel) {
        // troca tela visível
        this.viewJogoAtual.getTelaSelecaoQuestao().setVisible(false);
        this.viewJogoAtual.getTelaSelecaoNivel().setVisible(true);
        
        // ajusta mudancas na tela de selecao de nivel
        this.viewJogoAtual.getTelaSelecaoNivel().ajustarNivel(this.jogoAtual.getNivel(numNivel - 1));
    }
    
    /**
     * Volta para a tela de selecao de questao, estando na tela de resposta de questao
     * 
     * @param numNivel
     * @param numQuestao
     */
    public void voltarTelaSelecaoQuestao(int numNivel, int numQuestao) {
        // troca tela visível
        this.viewJogoAtual.getTelaRespostaQuestao().setVisible(false);
        this.viewJogoAtual.getTelaSelecaoQuestao().setVisible(true);
        
        // ajusta mudancas na tela de selecao de nivel
        this.viewJogoAtual.getTelaSelecaoQuestao().ajustarQuestao(this.jogoAtual.getNivel(numNivel - 1).getQuestao(numQuestao - 1));
    }
    
    /**
     * Mostrar ao jogador uma dica para a resposta
     * 
     * @param numNivel
     * @param numQuestao
     * @param numResposta
     */
    public void fornecerDicaResposta(int numNivel, int numQuestao, int numResposta) {
        this.viewJogoAtual.getTelaRespostaQuestao().mostrarDica(this.jogoAtual.getNivel(numNivel - 1).getQuestao(numQuestao - 1).getResposta(numResposta - 1));
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        // tratamento dos eventos da tela de Selecao de Nivel
        if (obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel1() ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel2() ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel3() ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel4() ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel5() ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel6() ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel7() ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel8() ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel9() ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel10() ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel11() ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel12() ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel13() ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel14() ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel15() ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel16() ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel17() ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel18() ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel19() ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel20() ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel21() ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel22() ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel23() ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel24() ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel25()) {
            this.selecionarNivel(Integer.parseInt(((JButton)obj).getText()));
        }
        
        // tratamento dos eventos da tela de Selecao de Questao
        if (obj == this.viewJogoAtual.getTelaSelecaoQuestao().getVoltar()) {
            this.voltarTelaSelecaoNivel(this.viewJogoAtual.getTelaSelecaoQuestao().getNumNivel());
        } else if (obj == this.viewJogoAtual.getTelaSelecaoQuestao().getQuestao1()) {
            this.selecionarQuestao(this.viewJogoAtual.getTelaSelecaoQuestao().getNumNivel(), 1);
        } else if (obj == this.viewJogoAtual.getTelaSelecaoQuestao().getQuestao2()) {
            this.selecionarQuestao(this.viewJogoAtual.getTelaSelecaoQuestao().getNumNivel(), 2);
        } else if (obj == this.viewJogoAtual.getTelaSelecaoQuestao().getQuestao3()) {
            this.selecionarQuestao(this.viewJogoAtual.getTelaSelecaoQuestao().getNumNivel(), 3);
        }
        
        // tratamento dos eventos da tela de Selecao de Resposta
        if (obj == this.viewJogoAtual.getTelaRespostaQuestao().getVoltar()) {
            this.voltarTelaSelecaoQuestao(this.viewJogoAtual.getTelaRespostaQuestao().getNumNivel(),
                                          this.viewJogoAtual.getTelaRespostaQuestao().getNumQuestao());
        } else if (obj == this.viewJogoAtual.getTelaRespostaQuestao().getResp1()) {
            this.fornecerDicaResposta(this.viewJogoAtual.getTelaRespostaQuestao().getNumNivel(),
                                      this.viewJogoAtual.getTelaRespostaQuestao().getNumQuestao(), 1);
        } else if (obj == this.viewJogoAtual.getTelaRespostaQuestao().getResp2()) {
            this.fornecerDicaResposta(this.viewJogoAtual.getTelaRespostaQuestao().getNumNivel(),
                                      this.viewJogoAtual.getTelaRespostaQuestao().getNumQuestao(), 2);
        } else if (obj == this.viewJogoAtual.getTelaRespostaQuestao().getResp3()) {
            this.fornecerDicaResposta(this.viewJogoAtual.getTelaRespostaQuestao().getNumNivel(),
                                      this.viewJogoAtual.getTelaRespostaQuestao().getNumQuestao(), 3);
        } else if (obj == this.viewJogoAtual.getTelaRespostaQuestao().getResp4()) {
            this.fornecerDicaResposta(this.viewJogoAtual.getTelaRespostaQuestao().getNumNivel(),
                                      this.viewJogoAtual.getTelaRespostaQuestao().getNumQuestao(), 4);
        } else if (obj == this.viewJogoAtual.getTelaRespostaQuestao().getResp5()) {
            this.fornecerDicaResposta(this.viewJogoAtual.getTelaRespostaQuestao().getNumNivel(),
                                      this.viewJogoAtual.getTelaRespostaQuestao().getNumQuestao(), 5);
        } else if (obj == this.viewJogoAtual.getTelaRespostaQuestao().getResp6()) {
            this.fornecerDicaResposta(this.viewJogoAtual.getTelaRespostaQuestao().getNumNivel(),
                                      this.viewJogoAtual.getTelaRespostaQuestao().getNumQuestao(), 6);
        } else if (obj == this.viewJogoAtual.getTelaRespostaQuestao().getResp7()) {
            this.fornecerDicaResposta(this.viewJogoAtual.getTelaRespostaQuestao().getNumNivel(),
                                      this.viewJogoAtual.getTelaRespostaQuestao().getNumQuestao(), 7);
        } else if (obj == this.viewJogoAtual.getTelaRespostaQuestao().getResp8()) {
            this.fornecerDicaResposta(this.viewJogoAtual.getTelaRespostaQuestao().getNumNivel(),
                                      this.viewJogoAtual.getTelaRespostaQuestao().getNumQuestao(), 8);
        } else if (obj == this.viewJogoAtual.getTelaRespostaQuestao().getResp9()) {
            this.fornecerDicaResposta(this.viewJogoAtual.getTelaRespostaQuestao().getNumNivel(),
                                      this.viewJogoAtual.getTelaRespostaQuestao().getNumQuestao(), 9);
        }
    }
}

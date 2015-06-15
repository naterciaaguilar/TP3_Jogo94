/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Normalizer;
import javax.swing.JButton;
import model.ModelJogo94;
import model.ModelResposta;
import view.VisaoJogo94;

/**
 *
 * @author User
 */
public class ControllerJogo94 implements ActionListener {
    private ModelJogo94 jogoAtual;
    private VisaoJogo94 viewJogoAtual;
    
    /**
     * Inicializa jogo criando as fases e montando as janelas de interface com o usuario
     */
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
    
    /**
     * Verifica se a resposta fornecida faz parte do conjunto de respostas da questao
     * 
     * @param numNivel
     * @param numQuestao
     * @param resposta
     */
    public void responderQuestao(int numNivel, int numQuestao, String resposta) {
        boolean respostaCorreta = false;
        int indexPalavra = 0;
        
        // busca palavra informada entre as respostas, ignorando letras maiusculas e minusculas
        for (ModelResposta resp : this.jogoAtual.getNivel(numNivel - 1).getQuestao(numQuestao - 1).getRespostas()) {
            indexPalavra++;
            if (removerAcentos(resposta).equals(removerAcentos(resp.getPalavra()))) {
                respostaCorreta = true;
                
                // seta resposta como correta
                resp.acertarResposta();
                this.viewJogoAtual.getTelaRespostaQuestao().ajustarResposta(resp, indexPalavra);
                this.viewJogoAtual.getTelaRespostaQuestao().ajustarPorcentagem(this.jogoAtual.getNivel(numNivel - 1).getQuestao(numQuestao - 1));
                
                // para resposta certa, verificar se todas as respostas da questao estao corretas
                this.jogoAtual.getNivel(numNivel - 1).getQuestao(numQuestao - 1).finalizarQuestao();
                
                // para resposta certa, verificaar se nivel pode ser encerrado
                this.jogoAtual.getNivel(numNivel - 1).finalizarNivel();
            }
        }
        
        // se a questao tiver sido respondida completamente, exibe mensagem e volta à tela de selecao de questao
        // caso contrario, exibe apenas mensagem de palavra correta
        if (this.jogoAtual.getNivel(numNivel - 1).getQuestao(numQuestao - 1).getQuestaoFinalizada()) {
            this.viewJogoAtual.getTelaRespostaQuestao().mostrarMensagemFinalizacao();
            this.voltarTelaSelecaoQuestao(numNivel, numQuestao);
        } else {
            this.viewJogoAtual.getTelaRespostaQuestao().mostrarMensagemResposta(respostaCorreta);
        }
    }
    
    /**
     * Remove acentos das palavras digitadas pelo jogador
     * 
     * @param palavra
     */
    private static String removerAcentos(String palavra) 
    {
        return Normalizer.normalize(palavra.toUpperCase(), Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
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
    
    /**
     * Trata os eventos que acontecem na interface com o usuario
     * 
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        // tratamento dos eventos da tela de Selecao de Nivel
        if (obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel(1) ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel(2) ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel(3) ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel(4) ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel(5) ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel(6) ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel(7) ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel(8) ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel(9) ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel(10) ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel(11) ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel(12) ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel(13) ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel(14) ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel(15) ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel(16) ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel(17) ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel(18) ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel(19) ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel(20) ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel(21) ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel(22) ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel(23) ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel(24) ||
            obj == this.viewJogoAtual.getTelaSelecaoNivel().getNivel(25)) {
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
        } else if (obj == this.viewJogoAtual.getTelaRespostaQuestao().getResp(1)) {
            this.fornecerDicaResposta(this.viewJogoAtual.getTelaRespostaQuestao().getNumNivel(),
                                      this.viewJogoAtual.getTelaRespostaQuestao().getNumQuestao(), 1);
        } else if (obj == this.viewJogoAtual.getTelaRespostaQuestao().getResp(2)) {
            this.fornecerDicaResposta(this.viewJogoAtual.getTelaRespostaQuestao().getNumNivel(),
                                      this.viewJogoAtual.getTelaRespostaQuestao().getNumQuestao(), 2);
        } else if (obj == this.viewJogoAtual.getTelaRespostaQuestao().getResp(3)) {
            this.fornecerDicaResposta(this.viewJogoAtual.getTelaRespostaQuestao().getNumNivel(),
                                      this.viewJogoAtual.getTelaRespostaQuestao().getNumQuestao(), 3);
        } else if (obj == this.viewJogoAtual.getTelaRespostaQuestao().getResp(4)) {
            this.fornecerDicaResposta(this.viewJogoAtual.getTelaRespostaQuestao().getNumNivel(),
                                      this.viewJogoAtual.getTelaRespostaQuestao().getNumQuestao(), 4);
        } else if (obj == this.viewJogoAtual.getTelaRespostaQuestao().getResp(5)) {
            this.fornecerDicaResposta(this.viewJogoAtual.getTelaRespostaQuestao().getNumNivel(),
                                      this.viewJogoAtual.getTelaRespostaQuestao().getNumQuestao(), 5);
        } else if (obj == this.viewJogoAtual.getTelaRespostaQuestao().getResp(6)) {
            this.fornecerDicaResposta(this.viewJogoAtual.getTelaRespostaQuestao().getNumNivel(),
                                      this.viewJogoAtual.getTelaRespostaQuestao().getNumQuestao(), 6);
        } else if (obj == this.viewJogoAtual.getTelaRespostaQuestao().getResp(7)) {
            this.fornecerDicaResposta(this.viewJogoAtual.getTelaRespostaQuestao().getNumNivel(),
                                      this.viewJogoAtual.getTelaRespostaQuestao().getNumQuestao(), 7);
        } else if (obj == this.viewJogoAtual.getTelaRespostaQuestao().getResp(8)) {
            this.fornecerDicaResposta(this.viewJogoAtual.getTelaRespostaQuestao().getNumNivel(),
                                      this.viewJogoAtual.getTelaRespostaQuestao().getNumQuestao(), 8);
        } else if (obj == this.viewJogoAtual.getTelaRespostaQuestao().getResp(9)) {
            this.fornecerDicaResposta(this.viewJogoAtual.getTelaRespostaQuestao().getNumNivel(),
                                      this.viewJogoAtual.getTelaRespostaQuestao().getNumQuestao(), 9);
        } else if (obj == this.viewJogoAtual.getTelaRespostaQuestao().getButtonOK()) {
            this.responderQuestao(this.viewJogoAtual.getTelaRespostaQuestao().getNumNivel(),
                                  this.viewJogoAtual.getTelaRespostaQuestao().getNumQuestao(),
                                  this.viewJogoAtual.getTelaRespostaQuestao().getRespostaJogador());
        } else if (obj == this.viewJogoAtual.getTelaRespostaQuestao().getRespJogador()) {
            this.responderQuestao(this.viewJogoAtual.getTelaRespostaQuestao().getNumNivel(),
                                  this.viewJogoAtual.getTelaRespostaQuestao().getNumQuestao(),
                                  this.viewJogoAtual.getTelaRespostaQuestao().getRespostaJogador());
        }
    }
}

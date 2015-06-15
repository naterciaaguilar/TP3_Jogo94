/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ControllerJogo94;

/**
 * Classe responsavel pela criacao da janela principal com todas as janelas internas
 * 
 * @author User
 */
public class VisaoJogo94 {
    private int numNivelAtual;
    private int numQuestaoAtual;
    
    private FrameAplicacao framePrincipal94;
    private ViewSelecaoNivel telaSelecaoNivel;
    private ViewSelecaoQuestao telaSelecaoQuestao;
    private ViewQuestao telaRespostaQuestao;
    
    public VisaoJogo94(ControllerJogo94 controlJogo) {
        framePrincipal94 = new FrameAplicacao();
        
        // criacao das 3 telas de navegacao do jogo
        telaSelecaoNivel = new ViewSelecaoNivel(controlJogo);
        telaSelecaoQuestao = new ViewSelecaoQuestao();
        telaRespostaQuestao = new ViewQuestao();
        
        // inclusao de todas as telas na janela principal
        framePrincipal94.add(telaSelecaoNivel);
        framePrincipal94.add(telaSelecaoQuestao);
        framePrincipal94.add(telaRespostaQuestao);
        
        // ao iniciar o jogo, apenas a tela de selecao de nivel estara visivel
        telaSelecaoNivel.setVisible(true);
        telaSelecaoQuestao.setVisible(false);
        telaRespostaQuestao.setVisible(false);
    }
    
    public FrameAplicacao getFramePrincipal94() {
        return this.framePrincipal94;
    }
    
    public ViewSelecaoNivel getTelaSelecaoNivel() {
        return this.telaSelecaoNivel;
    }
    
    public ViewSelecaoQuestao getTelaSelecaoQuestao() {
        return this.telaSelecaoQuestao;
    }
    
    public ViewQuestao getTelaRespostaQuestao() {
        return this.telaRespostaQuestao;
    }
}

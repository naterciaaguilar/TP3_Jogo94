/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
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
    
    public VisaoJogo94() {
        framePrincipal94 = new FrameAplicacao();
        
        telaSelecaoNivel = new ViewSelecaoNivel();
        telaSelecaoQuestao = new ViewSelecaoQuestao();
        telaRespostaQuestao = new ViewQuestao();
        
        framePrincipal94.add(telaSelecaoNivel);
        framePrincipal94.add(telaSelecaoQuestao);
        framePrincipal94.add(telaRespostaQuestao);
        
        telaSelecaoNivel.setVisible(true);
        telaSelecaoQuestao.setVisible(false);
        telaRespostaQuestao.setVisible(false);
    }
}

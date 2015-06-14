/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        // métodos para inicializar jogo - model
        
        viewJogoAtual = new VisaoJogo94();
    }
    
    public void selecionarNivel() {
        
    }
    
    public void selecionarQuestao() {
        
    }
    
    public void responderQuestao() {
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

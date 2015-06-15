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
        jogoAtual = new ModelJogo94();
        viewJogoAtual = new VisaoJogo94(this);
    }
    
    public void selecionarNivel(int numNivel) {
        this.viewJogoAtual.getTelaSelecaoNivel().setVisible(false);
        this.viewJogoAtual.getTelaSelecaoQuestao().setVisible(true);
        
        this.viewJogoAtual.getTelaSelecaoQuestao().configurarNivel(jogoAtual.getNivel(numNivel - 1));
    }
    
    public void selecionarQuestao() {
        
    }
    
    public void responderQuestao() {
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
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
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class ModelNivel {
    private int numNivel;
    private boolean nivelFinalizado;
    private List<ModelQuestao> questoes;
    
    public ModelNivel(ModelJogo94 jogo) {
        this.questoes = new ArrayList<ModelQuestao>();
        this.numNivel = jogo.getNumeroNiveis();
        this.nivelFinalizado = false;
    }
    
    public void criaQuestaoNivel (ModelQuestao novaQuestao) {        
        questoes.add(novaQuestao);
    }
    
    public List<ModelQuestao> getQuestoes() {
        return questoes;
    }
    
    public void setQuestoes(List<ModelQuestao> questoes) {
        this.questoes = questoes;
    }
    
    public ModelQuestao getQuestao(int numQuestao) {
        return questoes.get(numQuestao);
    }
    
    public int getNumNivel() {
        return numNivel;
    }
    
    public void setNumNivel(int numNivel) {
        this.numNivel = numNivel;
    }
    
    public boolean getNivelFinalizado() {
        return nivelFinalizado;
    }
    
    public void setNivelFinalizado(boolean nivelFinalizado) {
        this.nivelFinalizado = nivelFinalizado;
    }
    
    public int getNumeroQuestoes() {
        return questoes.size();
    }
}

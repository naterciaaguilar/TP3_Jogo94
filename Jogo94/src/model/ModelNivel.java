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
    private ArrayList<ModelQuestao> questoes;
    
    public ModelNivel(ModelJogo94 jogo) {
        this.questoes = new ArrayList<ModelQuestao>();
        this.numNivel = jogo.getNumeroNiveis();
        this.nivelFinalizado = false;
    }
    
    /**
     * Associa uma nova questao a um nivel
     * 
     * @param novaQuestao
     */
    public void criarQuestaoNivel (ModelQuestao novaQuestao) {        
        questoes.add(novaQuestao);
    }
    
    /**
     * Verifica se o nivel pode ser considerado como finalizado
     * Regra: se houver qualquer uma das 3 questoes do nivel com status de finalizada,
     * o mesmo tambem pode ser considerado como tal, desbloqueando assim o proximo
     */
    public void finalizarNivel() {
        boolean testeNivelFinalizado = false;
        
        for (ModelQuestao questao : this.questoes) {
            if (questao.getQuestaoFinalizada()) {
                testeNivelFinalizado = true;
            }
        }
        
        this.nivelFinalizado = testeNivelFinalizado;
    }
    
    public ArrayList<ModelQuestao> getQuestoes() {
        return questoes;
    }
        
    public ModelQuestao getQuestao(int numQuestao) {
        return questoes.get(numQuestao);
    }
    
    public int getNumNivel() {
        return numNivel;
    }
    
    public boolean getNivelFinalizado() {
        return nivelFinalizado;
    }
    
    public int getNumeroQuestoes() {
        return questoes.size();
    }
}

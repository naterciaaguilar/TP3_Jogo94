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
public class ModelQuestao {
    private String descricao;
    private int numQuestao;
    private boolean questaoFinalizada;
    private ModelNivel nivel;
    private TipoQuestao tipoQuestao;
    private ArrayList<ModelResposta> respostas;
    
    public ModelQuestao() {
        respostas = new ArrayList<ModelResposta>();
    }
    
    public ModelQuestao(int numQuestao, String descricao, ModelNivel nivel, TipoQuestao tipoQuestao, ArrayList<ModelResposta> respostas) {
        this.numQuestao = numQuestao;
        this.descricao = descricao;
        this.nivel = nivel;
        this.tipoQuestao = tipoQuestao;
        this.respostas = respostas;
        this.questaoFinalizada = false;
    }
    
    /**
     * Verifica se a questao pode ser considerado como finalizada
     * Regra: todas as respostas devem ter sido acertadas
     */
    public void finalizarQuestao() {
        boolean testeQuestaoFinalizada = true;
        
        for (ModelResposta resposta : this.respostas) {
            if (!resposta.getRespondida()) {
                testeQuestaoFinalizada = false;
            }
        }
        
        this.questaoFinalizada = testeQuestaoFinalizada;
    }
    
    public String getDescricao() {
        return descricao;
    }
        
    public int getNumQuestao() {
        return numQuestao;
    }
    
    public boolean getQuestaoFinalizada() {
        return questaoFinalizada;
    }
    
    public ModelNivel getNivel() {
        return nivel;
    }
    
    public TipoQuestao getTipoQuestao() {
        return tipoQuestao;
    }
    
    public List<ModelResposta> getRespostas() {
        return respostas;
    }
    
    public ModelResposta getResposta(int numReposta) {
        return respostas.get(numReposta);
    }
}
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
    private List<ModelResposta> respostas;
    
    public ModelQuestao() {
        respostas = new ArrayList<ModelResposta>();
    }
    
    public ModelQuestao(int numQuestao, String descricao, ModelNivel nivel, TipoQuestao tipoQuestao, List<ModelResposta> respostas) {
        this.numQuestao = numQuestao;
        this.descricao = descricao;
        this.nivel = nivel;
        this.tipoQuestao = tipoQuestao;
        this.respostas = respostas;
        this.questaoFinalizada = false;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public int getNumQuestao() {
        return numQuestao;
    }
    
    public void setNumQuestao(int numQuestao) {
        this.numQuestao = numQuestao;
    }
    
    public boolean getQuestaoFinalizada() {
        return questaoFinalizada;
    }
    
    public void setQuestaoFinalizada(boolean questaoFinalizada) {
        this.questaoFinalizada = questaoFinalizada;
    }
    
    public ModelNivel getNivel() {
        return nivel;
    }
    
    public void setNivel(ModelNivel nivel) {
        this.nivel = nivel;
    }
    
    public TipoQuestao getTipoQuestao() {
        return tipoQuestao;
    }
    
    public void setTipoQuestao(TipoQuestao tipoQuestao) {
        this.tipoQuestao = tipoQuestao;
    }
    
    public List<ModelResposta> getRespostas() {
        return respostas;
    }
    
    public void setRespostas(List<ModelResposta> respostas) {
        this.respostas = respostas;
    }
    
    public ModelResposta getResposta(int numReposta) {
        return respostas.get(numReposta);
    }
}
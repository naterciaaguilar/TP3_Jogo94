/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author User
 */
public class ModelResposta {
    private String palavra;
    private int porcentagem;
    private boolean respondida;
    
    public ModelResposta(int porcentagem, String palavra) {
        this.porcentagem = porcentagem;
        this.palavra = palavra;
        this.respondida = false;
    }
    
    public String getPalavra() {
        return palavra;
    }
    
    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }
    
    public int getPorcentagem() {
        return porcentagem;
    }
    
    public void setPorcentagem(int porcentagem) {
        this.porcentagem = porcentagem;
    }
    
    public boolean getRespondida() {
        return respondida;
    }
    
    public void setRespondida(boolean respondida) {
        this.respondida = respondida;
    }
}

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
    private Double porcentagem;
    
    public ModelResposta(Double porcentagem, String palavra) {
        this.porcentagem = porcentagem;
        this.palavra = palavra;
    }
    
    public String getPalavra() {
        return palavra;
    }
    
    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }
    
    public Double getPorcentagem() {
        return porcentagem;
    }
    
    public void setPorcentagem(Double porcentagem) {
        this.porcentagem = porcentagem;
    }
}

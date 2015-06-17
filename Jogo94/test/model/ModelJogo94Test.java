/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author ddayrell
 */
public class ModelJogo94Test {
    
    public ModelJogo94 modelJogo94;
            
    public ModelJogo94Test() {
        this.modelJogo94 = new ModelJogo94();
    }
    
    /* 
     * Testa se ao fornecer corretamente todas as respostas a
     * uma questão faz com que a mesma seja definida como finalizada
    */
    @Test
    public void testarQuestaoFinalizada() {
        System.out.println("testarQuestaoFinalizada");
        boolean questaoFinalizada = false;
        for (ModelResposta resposta : modelJogo94.getNivel(0).getQuestao(0).getRespostas()){
            resposta.acertarResposta();
        }
        modelJogo94.getNivel(0).getQuestao(0).finalizarQuestao();
        questaoFinalizada = modelJogo94.getNivel(0).getQuestao(0).getQuestaoFinalizada();
        assertTrue(questaoFinalizada);
    }
    
    /* 
     * Testa se ao fornecer corretamente todas as respostas a
     * todas as questões de um nível, faz com que ele seja definido como finalizado
    */
    @Test
    public void testarNivelFinalizado() {
        System.out.println("testarNivelFinalizado");
        boolean nivelFinalizado = false;
        for (ModelQuestao questao: modelJogo94.getNivel(0).getQuestoes()){
            for (ModelResposta resposta : questao.getRespostas()){
                resposta.acertarResposta();
            }
            questao.finalizarQuestao();
        }
        modelJogo94.getNivel(0).finalizarNivel();
        nivelFinalizado = modelJogo94.getNivel(0).getNivelFinalizado();
        assertTrue(nivelFinalizado);
    }
    
    /* 
     * Testa se ao não fornecer nenhuma resposta à questão, a mesma
     * não é marcada como finalizada
    */
    @Test
    public void testarQuestaoNaoFinalizadaSemResposta() {
        System.out.println("testarQuestaoNaoFinalizadaSemResposta");
        modelJogo94.getNivel(0).getQuestao(1).finalizarQuestao();
        assertFalse(modelJogo94.getNivel(0).getQuestao(1).getQuestaoFinalizada());
    }
    
    /* 
     * Testa se ao fornecer somente parte das respostas à questão, 
     * a mesma não é marcada como finalizada.
    */
    @Test
    public void testarQuestaoNaoFinalizadaRespostaParcial() {
        System.out.println("testarQuestaoNaoFinalizadaRespostaParcial");
        modelJogo94.getNivel(0).getQuestao(2).getResposta(0).acertarResposta();
        modelJogo94.getNivel(0).getQuestao(2).finalizarQuestao();
        assertFalse(modelJogo94.getNivel(0).getQuestao(2).getQuestaoFinalizada());
    }
    
    /* 
     * Testa se todos os níveis do jogo possuem exatamente 3 questões.
    */
    @Test
    public void testarQuestoesPorNivel() {
        System.out.println("testarQuestoesPorNivel");
        for (ModelNivel nivel : modelJogo94.getNiveis()){
            assertEquals(nivel.getQuestoes().size(), 3);
        }
    }
    
    /** 
     * Testa se o jogo possui exatamente 25 níveis.
    */
    @Test
    public void testarQuantidadeNiveis() {
        System.out.println("testarQuestoesPorNivel");
        assertEquals(modelJogo94.getNiveis().size(), 25);
        
    }
    
    /** 
     * Testa se todas as questões do jogo possuem respostas cujos
     * percentuais somam exatamente 94.
    */
    @Test
    public void testarSomaPercentuais94() {
        System.out.println("testarQuestoesPorNivel");
        int somaPct = 0;
        for (ModelNivel nivel : modelJogo94.getNiveis()){
            for (ModelQuestao questao : nivel.getQuestoes()) {
                somaPct = 0;
                for (ModelResposta resposta : questao.getRespostas()){
                    somaPct += resposta.getPorcentagem();
                }
                System.out.println("Nível: " + nivel.getNumNivel() + ", Questão: " + questao.getDescricao());
                assertTrue(somaPct == 94);
            }
        }
    }
}

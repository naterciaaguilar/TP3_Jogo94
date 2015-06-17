/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import java.awt.event.ActionEvent;
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
public class ControllerJogo94Test {
    
    public ControllerJogo94Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Testa se ao inicializar o jogo, o mesmo abre na tela de seleção de nível.
     */
    @Test
    public void testarAberturaTelaInicial() {
        System.out.println("testarTelaInicial");
        ControllerJogo94 instance = new ControllerJogo94();
        instance.inicializarJogo();
        String telaAberta = instance.getNomeTelaVisivel();
        assertEquals("SeleçãoNível", telaAberta);
    }
    
     /**
     * Testa se ao selecionar um nível, o jogador é levado à tela de seleção de questão.
     */
    @Test
    public void testarSeleçãoNível() {
        System.out.println("testarTelaInicial");
        ControllerJogo94 instance = new ControllerJogo94();
        instance.inicializarJogo();
        instance.selecionarNivel(1);
        String telaAberta = instance.getNomeTelaVisivel();
        assertEquals("SeleçãoQuestão", telaAberta);
    }
    
     /**
     * Testa se ao selecionar uma questão, o jogador é levado á tela de responder questão.
     */
    @Test
    public void testarSeleçãoQuestao() {
        System.out.println("testarTelaInicial");
        ControllerJogo94 instance = new ControllerJogo94();
        instance.inicializarJogo();
        instance.selecionarNivel(1);
        instance.selecionarQuestao(1,1);
        String telaAberta = instance.getNomeTelaVisivel();
        assertEquals("RespostaQuestão", telaAberta);
    }
    
     /**
     * Testa retorno para a tela de seleção de questão, a partir da tela de respostas.
     */
    @Test
    public void testarVoltarSeleçãoQuestao() {
        System.out.println("testarVoltarSeleçãoQuestao");
        ControllerJogo94 instance = new ControllerJogo94();
        instance.inicializarJogo(); // inicializa jogo
        instance.selecionarNivel(1); // seleciona nivel 1
        instance.selecionarQuestao(1,1); // seleciona questão 1 do nivel 1
        instance.voltarTelaSelecaoQuestao(1, 1); // retorna para tela de seleção de questão
        String telaAberta = instance.getNomeTelaVisivel();
        assertEquals("SeleçãoQuestão", telaAberta);
    }
    
    /**
     * Testa retorno para tela de seleção de níveis, a partir da seleção de questão.
     */
    @Test
    public void testarVoltarSeleçãoNível() {
        System.out.println("testarVoltarSeleçãoQuestao");
        ControllerJogo94 instance = new ControllerJogo94();
        instance.inicializarJogo(); // inicializa jogo
        instance.selecionarNivel(1); // seleciona nivel 1
        instance.selecionarQuestao(1,1); // seleciona questão 1 do nivel 1
        instance.voltarTelaSelecaoQuestao(1, 1); // retorna para tela de seleção de questão
        instance.voltarTelaSelecaoNivel(1); // retorna para tela de seleção de nível
        String telaAberta = instance.getNomeTelaVisivel();
        assertEquals("SeleçãoNível", telaAberta);
    }

}

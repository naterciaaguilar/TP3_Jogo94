/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class ModelJogo94 {

    private ArrayList<ModelNivel> niveis;

    public ModelJogo94() {
        niveis = new ArrayList<ModelNivel>();
        criaNiveisJogo(); // Cria os 25 níveis do jogo
    }

    /**
     * Cria os 25 niveis do jogo de acordo com arquivo de dados
     */
    private void criaNiveisJogo() {
        String path = "Dados/";
        int i = 0;
        int aux = 0;
        try {
            File arquivo = new File(path + "94Data.txt"); // Abre o arquivo de dados dos níveis
            FileReader fileReader = new FileReader(arquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            if (arquivo.exists()) { // Verifica se o arquivo existe
                while (bufferedReader.ready()) { // Lê o arquivo até o seu final
                    String Linha[] = bufferedReader.readLine().split(";");

                    // ----- Cada nível contém 3 questões (linhas do arquivo)
                    if (i % 3 == 0 && aux == 0) { // Primeira questão do nível
                        ModelNivel novoNivel = new ModelNivel(this); // Instância de um novo nível

                        ArrayList<ModelResposta> respostas = separaLinha(Linha); // Seleciona respostas do nível
                        ModelQuestao questao = new ModelQuestao(1, Linha[1], novoNivel, TipoQuestao.Pergunta, respostas); // Define questões do nível
                        novoNivel.criarQuestaoNivel(questao); // Adiciona questão ao nível

                        niveis.add(novoNivel);
                    }
                    if (aux == 1) { // Segunda questão do nível
                        ArrayList<ModelResposta> respostas = separaLinha(Linha);
                        ModelQuestao questao = new ModelQuestao(2, Linha[1], niveis.get(niveis.size() - 1), TipoQuestao.Pergunta, respostas); // Define questões do nível
                        niveis.get(niveis.size() - 1).criarQuestaoNivel(questao);
                    }
                    if (aux == 2) { // Terceira questão do nível
                        ArrayList<ModelResposta> respostas = separaLinha(Linha);
                        ModelQuestao questao = new ModelQuestao(3, Linha[1], niveis.get(niveis.size() - 1), TipoQuestao.Imagem, respostas); // Define questões do nível
                        niveis.get(niveis.size() - 1).criarQuestaoNivel(questao);
                        aux = -1;
                    }

                    i++;
                    aux++;
                }
            }
        } catch (FileNotFoundException ex) {
            // TODO Auto-generated catch block
            ex.printStackTrace();
        } catch (IOException ex) {
            // TODO Auto-generated catch block
            ex.printStackTrace();
        }
    }

    /**
     * Separa campos de resposta de uma linha
     * 
     * @param Linha
     * @return respostas
     */
    public ArrayList<ModelResposta> separaLinha(String Linha[]) {
        ArrayList<ModelResposta> respostas = new ArrayList<ModelResposta>(); // ArrayList que armazena as respostas da questão
        int j = 2;
        while (j < Linha.length) {
            ModelResposta answer = new ModelResposta(Integer.parseInt(Linha[j]), Linha[j + 1]);
            respostas.add(answer);
            j += 2;
        }

        return respostas;
    }

    public ModelNivel getNivel(int numNivel) {
        return niveis.get(numNivel);
    }

    public List<ModelNivel> getNiveis() {
        return niveis;
    }

    public int getNumeroNiveis() {
        return niveis.size() + 1;
    }
}
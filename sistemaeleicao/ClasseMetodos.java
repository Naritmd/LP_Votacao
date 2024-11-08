package sistemaeleicao;

import java.io.*;
import javax.swing.*;
import java.util.Random;


public class ClasseMetodos {
    int qtEleitores = 0;
    int votosCandidato = 0;
    public SistemaEleicao[] FCadastraVotacao(SistemaEleicao[]eleicao)
    {
        for (int i = 0; i < 200; i++)
        {
            eleicao[i].NumeroSecao = (int) (Math.random() * (10));
            eleicao[i].NumeroCandidato = (int) (Math.random() * (300));
        }
        JOptionPane.showMessageDialog(null, "Votação Cadastrada");
        return eleicao;
    }
    
    public SistemaEleicao[] FClassificaVotacao(SistemaEleicao[] eleicao)
    {
         for (int i = 0; i < 9; i++){
            for (int j = (i+1); j < 10; j++){
                if (eleicao[i].NumeroSecao > eleicao[j].NumeroSecao){
                    int aux = eleicao[i].NumeroSecao;
                    eleicao[i].NumeroSecao = eleicao[j].NumeroSecao;
                    eleicao[j].NumeroSecao = aux;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Dados Classificados");
        return eleicao;
    }
    
    public SistemaEleicao[] FGravaVotacao(SistemaEleicao[] eleicao) throws IOException
    {
        String fileName = "Votacao2024.txt";
        BufferedWriter gravar = new BufferedWriter(new FileWriter(fileName));
        
        for (int i = 0; i < 200; i++)
        {
            gravar.write(Integer.toString(eleicao[i].NumeroSecao));
            gravar.newLine();
            gravar.write(Integer.toString(eleicao[i].NumeroCandidato));
            gravar.newLine();
        }
        
        JOptionPane.showMessageDialog(null, "Gravação feita com sucesso");
        gravar.close();
        return eleicao;
    }
    
    public void EleitoresSecao(SistemaEleicao[] eleicao) 
    {
        
        for (int i = 0; i < 10; i++)
        {   
            qtEleitores = 0;
            for (int j = 0; j < 200; j++)
        {
            if (eleicao[j].NumeroSecao == i)
            {
            qtEleitores ++; 
            }
        }
            System.out.println("O Numero de eleitores na seçâo " +i+ " é de: " +qtEleitores);
        }
    }
    
    public void MaiorMenor (SistemaEleicao[] eleicao)
    {       int maior = 0;
            int menor = 999;
            int aux = 0;  
            int indiceMaior =0;
            int indiceMenor=0;
            
         for (int i = 0; i < 10; i++)
        {   
            qtEleitores = 0;
            
            for (int j = 0; j < 200; j++)
        {
            if (eleicao[j].NumeroSecao == i)
            {
            qtEleitores ++; 
            }
        }
          if (qtEleitores > maior)
          {
              maior = qtEleitores;
              indiceMaior = i;
          }
          if (qtEleitores < menor)
          {
              menor = qtEleitores;
              indiceMenor = i;
          }
            
        }
        
        JOptionPane.showMessageDialog(null, "A seção com menor numero de votos é: " +indiceMenor+ " e a maior é: " +indiceMaior);
    }
    
    public void VotosCandidato(SistemaEleicao[] eleicao)
    {
}
    }

    public void MaisVotados(SistemaEleicao[] eleicao)
    {
        int maior = 0;
        int menor = 999;
        int aux = 0;  
        int indiceMaior =0;
        int indiceMenor=0;
        
        for (int i = 0; i < 300; i++)
        {
            for (int j = 0; j < 200; i++)
            {
                if (eleicao[i].NumeroCandidato == j)
                {
                    votosCandidato++;
                }
            }
        }
         for (int i = 0; i < 200; i++)
        {   
            votosCandidato = 0;
            
            for (int j = 0; j < 300; j++)
        {
            if (eleicao[j].NumeroCandidato == i)
            {
            votosCandidato++; 
            }
        }
          if (votosCandidato > maior)
          {
              maior = votosCandidato;
              indiceMaior = i;
          }
          if (votosCandidato < menor)
          {
              menor = votosCandidato;
              indiceMenor = i;
          }
            
        }
        
        JOptionPane.showMessageDialog(null, "O candidato com menor numero de votos é: " +indiceMenor+ " e a maior é: " +indiceMaior);
    }   
}

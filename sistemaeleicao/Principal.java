package sistemaeleicao;

import javax.swing.JOptionPane;
import java.io.IOException; 

public class Principal {
    public static void main (String args[]) throws IOException{
        SistemaEleicao[] eleicao = new SistemaEleicao[200]; 
        
        for (int i = 0; i < 200; i++)
        {
            eleicao[i] = new SistemaEleicao();
        }
        
        ClasseMetodos m = new ClasseMetodos();
        
        int opc = 0;
        int opcao = 0;
        
        while (opc !=9)
        {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1-Carregar Seção / Numero Eleitor \n 2 - Classificar por Seção \n 3 - Gravar Registros \n 4 - Mostrar Indicadores \n 9 - Finalizar"));
            
            switch(opc){
                case 1: eleicao = m. FCadastraVotacao(eleicao);
                
                break;
                
                case 2: m.FClassificaVotacao(eleicao);
                
                break;
                
                case 3: m.FGravaVotacao(eleicao);
                
                break;
                
                case 4: 
                    while (opcao != 9)
                    {
                        opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Quantidade Eleitores por Seção \n 2 - Seção com maior e menor n~umero de eleitores \n 3 - Quantidade de votos por candidato \n 4 - 10 Primeiros Colocados \n 9 - Finaliza consulta"));
                        
                        switch (opcao){
                            case 1: m.EleitoresSecao(eleicao);
                            
                            break;
                            
                            case 2: m.MaiorMenor(eleicao);
                            
                            break;
                            
                            case 3: m.VotosCandidato(eleicao);
                            
                            break;
                            
                            case 4: m.MaisVotados(eleicao);
                            
                            break;
                            
                            case 9: JOptionPane.showMessageDialog(null,"Consulta Finalizada");
                          
                            break;
                            
                            default: JOptionPane.showMessageDialog(null, "Opção inválida");
                            
                        }
                    }
                
                break;
                
                case 9: JOptionPane.showMessageDialog(null, "FINALIZADO");
                break;
                
                default: JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        }
    }
}

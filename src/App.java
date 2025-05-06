import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //Cara ou Coroa
        //50% Cara
        //50% Coroa
        //Variável que receba a interação do jogo
        //Randim
        //Switch
        //For, do While e While
        String[] espacoAmostral = {"Cara","Coroa"};
        //VETOR = ARRAYs
        Random random = new Random();
        //Contadores para verificar a destribuíção
        int contCara = 0;
        int contCoroa = 0;
        String mensagem="Espaço Amostral:{Cara,Coroa}\n"+
                        "Probabilidade de Coroa: 50% \n"+
                        "Probabilidade de Cara 50% \n"+
                        "Deseja lançar a moeda?";
//loop de lançamento
        while(true){
        //interação com usuário
        int opcao = JOptionPane.showConfirmDialog(null,mensagem,"Lançando moedas",JOptionPane.YES_NO_OPTION);
        if(opcao != JOptionPane.YES_OPTION){
          String estatisticas = "Jogo finalizado! \n"+
          "Total de lançamentos:"+(contCara+contCoroa)+"\n"+
          "Caras:"+contCara+"\n"+
          "Coroas:"+contCoroa;
          JOptionPane.showMessageDialog(null,estatisticas,"Finalizando jogo",JOptionPane.INFORMATION_MESSAGE);
        
        
        
        break;
        }
        int resultado = random.nextInt(2);//0-Cara 1-Coroa
        if(resultado == 0){
            contCara++;
        }else{
            contCoroa++;
        }
        String saida = "Resultado do lançamento:"+espacoAmostral[resultado]+
                       "\n(Índice gerado)"+resultado+")";
        JOptionPane.showMessageDialog(null,saida,"Resultado",JOptionPane.INFORMATION_MESSAGE);

    }
    }
}

import java.util.Random;
import javax.swing.JOptionPane;

public class DadoAleatorio {
    public static void main(String[] args) {
         
        int jogar = JOptionPane.showConfirmDialog(null, "Considerando que você está jogando um jogo de tabuleiro, utilize isto como um dado de 6 lados.\n\nQuer jogar o dado?", "Jogo de Dados", JOptionPane.YES_NO_OPTION);

        if (jogar ==JOptionPane.YES_OPTION){

        Random random = new Random();

        int resultado = random.nextInt(6) + 1;
        
        JOptionPane.showMessageDialog(null, "O dado rolou e o resultado foi: " + resultado, "Resultado do Dado", JOptionPane.INFORMATION_MESSAGE);
         } else {
       
        JOptionPane.showMessageDialog(null, "Ok, quem sabe na próxima!", "Jogo de Dados", JOptionPane.INFORMATION_MESSAGE);



        }

    }
}

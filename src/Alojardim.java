import javax.swing.JOptionPane;

public class Alojardim {
    public static void main(String[] args) throws Exception {
        JOptionPane.showMessageDialog(null,"Alô Jardim!Seja bem vindo ao serviços de jardim");
        //1.Mensagem de boas vindas com JOptionPane
        JOptionPane.showMessageDialog(null,"Por Favor,ensira os seguintes dados para cadastro");
        //2.Criando cadastro do cliente
        String nome = JOptionPane.showInputDialog("Por favor ensira seu nome completo");
        String endereco = JOptionPane.showInputDialog("Por favor escreva seu endereço");
        String mensagem = "Cliente Cadastrado : \nNome:"+ nome + "\nEndereço:"+ endereco;
        //3.calculando a area do jardim
        JOptionPane.showMessageDialog(null,mensagem);
        JOptionPane.showMessageDialog(null,"Seja bem vindo ao Calculador de área de jardim");

        String larguraStr = JOptionPane.showInputDialog("Coloque a largura do seu terreno aqui");
        String comprimentoStr = JOptionPane.showInputDialog("Coloque o comprimento do seu terreno aqui");

        double largura = Double.parseDouble(larguraStr);
        double comprimento = Double.parseDouble(comprimentoStr);

        double area = (largura * comprimento);

        JOptionPane.showMessageDialog(null, "A área do jardim é: " + area + " m²");

    }
}

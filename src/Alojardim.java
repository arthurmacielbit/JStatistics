import javax.swing.JOptionPane;

public class AloJardim {

    // Verifica e retorna a classificação do jardim
    public static String verificarTamanhoJardim(double areaEmMetrosQuadrados) {
        if (areaEmMetrosQuadrados >= 25) {
            return "Grande";
        } else {
            return "Pequeno";
        }
    }

    // Retorna a descrição do tipo de serviço com base no código
    public static String classificarTipoServico(int codigoServico) {
        switch (codigoServico) {
            case 1: return "Corte de grama";
            case 2: return "Poda de árvores";
            case 3: return "Plantio de flores";
            case 4: return "Irrigação automática";
            default: return "Serviço desconhecido";
        }
    }

    // Aplica desconto por fidelidade com base na quantidade de serviços
    public static double calcularDescontoPorFidelidade(int quantidadeServicos, double valorBase) {
        double desconto = 0;

        if (quantidadeServicos >= 5) {
            desconto = 0.20;
        } else if (quantidadeServicos >= 3) {
            desconto = 0.10;
        }

        return valorBase - (valorBase * desconto);
    }

    public static void main(String[] args) {
        // 1. Entrada: Área do jardim
        String inputArea = JOptionPane.showInputDialog("Informe a área do jardim (em m²):");
        double area = Double.parseDouble(inputArea);

        // 2. Classificação do jardim e exibição
        String tamanhoJardim = verificarTamanhoJardim(area);
        JOptionPane.showMessageDialog(null,
            "Jardim com " + area + " m² classificado como: " + tamanhoJardim);

        // 3. Entrada: Tipo de serviço
        String inputServico = JOptionPane.showInputDialog(
            "Informe o tipo de serviço:\n" +
            "1 - Corte de grama\n" +
            "2 - Poda de árvores\n" +
            "3 - Plantio de flores\n" +
            "4 - Irrigação automática"
        );
        int tipoServico = Integer.parseInt(inputServico);

        // 4. Exibe a descrição do serviço
        String descricaoServico = classificarTipoServico(tipoServico);
        JOptionPane.showMessageDialog(null, "Tipo de Serviço Selecionado: " + descricaoServico);

        // 5. Entrada: Quantidade de serviços contratados
        String inputQtdServicos = JOptionPane.showInputDialog(
            "Informe a quantidade total de serviços contratados:");
        int quantidadeServicos = Integer.parseInt(inputQtdServicos);

        // 6. Cálculo de desconto
        double valorBase = 200.00;
        double valorFinal = calcularDescontoPorFidelidade(quantidadeServicos, valorBase);

        // 7. Exibe valor com desconto
        JOptionPane.showMessageDialog(null,
            "Serviços Contratados: " + quantidadeServicos + "\n" +
            "Valor Original: R$ " + valorBase + "\n" +
            "Valor com Desconto: R$ " + String.format("%.2f", valorFinal)
        );
    }
}

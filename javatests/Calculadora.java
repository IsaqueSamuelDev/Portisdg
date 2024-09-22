import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        // Declaração de variáveis
        int num1, num2;
        double quociente, potencia;
        String resultado;

        try {
            // Recebe dois números inteiros usando interface com usuário
            String input1 = JOptionPane.showInputDialog("Digite o primeiro número inteiro:");
            String input2 = JOptionPane.showInputDialog("Digite o segundo número inteiro:");

            // Converte as entradas para inteiros
            num1 = Integer.parseInt(input1);
            num2 = Integer.parseInt(input2);

            // Verifica se o segundo número é zero para evitar divisão por zero
            if (num2 == 0) {
                JOptionPane.showMessageDialog(null, "Erro: Divisão por zero não é permitida.");
                return; // Interrompe a execução
            }

            // Calcula o quociente da divisão dos dois números
            quociente = (double) num1 / num2;

            // Calcula a potência do primeiro número pelo segundo número
            potencia = Math.pow(num1, num2);

            // Monta a string de resultado
            resultado = "Quociente da divisão de " + num1 + " por " + num2 + " é: " + quociente + "\n" +
                        "Potência de " + num1 + " elevado a " + num2 + " é: " + potencia;

            // Mostra as informações usando interface com usuário
            JOptionPane.showMessageDialog(null, resultado);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Insira apenas números inteiros.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getMessage());
        }
    }
}

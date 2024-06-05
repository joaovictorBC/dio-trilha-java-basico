import java.util.Scanner;

public class ControleSimplesDeSaque {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double valorSaque = scanner.nextDouble();
        double novoLimiteDiario = limiteDiario - valorSaque;
        for (int i = 1;  ; i++) {
        // Loop for para iterar sobre os saques

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido.");
                System.out.println("");
                break; // Encerra o loop
            } else {
                System.out.println("Saque realizado. Limite restante: " + novoLimiteDiario);
                System.out.println("Transacoes encerradas.");
                break;
                //valorSaque < limiteDiario
                // TODO: Atualizar o limite diário e imprimir a saída no formato dos exemplos.
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
    


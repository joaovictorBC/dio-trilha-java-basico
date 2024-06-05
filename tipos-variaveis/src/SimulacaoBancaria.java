import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:{ // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                System.out.println("Qual o valor voce deseja adicionar?");
                double deposito = scanner.nextDouble();
                double novoSaldo = saldo + deposito;
                saldo = novoSaldo;
                System.out.println("Seu novo saldo é de " + saldo);
                }
                    break;
                case 2:{
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Qual o  valor você deseja retirar?");
                    double saque = scanner.nextDouble();
                    if (saque > saldo){
                      System.out.println("Você não possui saldo suficiente");
                    }

                    
                     else {
                     double novoValor = saldo - saque;
                       saldo = novoValor;
                      System.out.println("Seu novo saldo é de " + saldo);
                    }
                }
                    break;
                case 3:
                    System.out.println("Seu saldo atual é de " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
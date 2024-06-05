import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();
        double limiteChequeEspecial =  500;
        double condicaoCheque = saldo + limiteChequeEspecial; 

        if (saque <= saldo) {
            System.out.println("Transação realizada com sucesso");
          
        } else if (saque >= saldo && saque <= condicaoCheque){
          System.out.println("Transação realizada com sucesso utilizando o cheque especial");
        } else {
          System.out.println("Transação não realizada. Limite do chque especial excedido");
        }
           
        scanner.close();
    }
}
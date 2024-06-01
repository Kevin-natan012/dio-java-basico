import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Bem vindo a conta bancaria, opcoes \n 1 deposito \n 2 sacar \n 3 consultar saldo \n 4 encerrar");
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    //System.out.println("Quanto deseja depositar");
                    double saldoDeposito = scanner.nextDouble();
                    saldo =  saldo + saldoDeposito;
                    System.out.printf("Saldo atual: %.1f\n",saldo);
                    
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    break;
                case 2:
                    //System.out.println("Quanto deseja sacar!");
                    double saldoSaque = scanner.nextDouble();
                    if(saldo < saldoSaque){
                        System.out.println("Saldo insuficiente.");
                        } 
                     else if(saldo >= saldoSaque){
                        saldo = saldo -saldoSaque;
                        System.out.printf("Saldo atual: %.1f\n",saldoSaque);}
                    
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    break;
                case 3:
                System.out.printf("Saldo atual: %.1f\n",saldo);
                    // TODO: Exibir o saldo atual da conta.
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
import java.util.Scanner;

public class ContaTerminal {

    public  void CriaConta(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu Nome");
        String nome = scanner.nextLine();

        System.out.println("Digite a Agencia");
        String agencia = scanner.nextLine();

        System.out.println("Numero da Conta");
        int numero = scanner.nextInt();

        System.out.println("Infome o Saldo de deposito");
        double saldo = scanner.nextDouble();

        System.out.println("Ola "+nome+" Obigado por criar uma conta em nosso banco, sua Agencia é "
        +agencia+" Conta: "+numero+" e seu saldo: "+saldo+" ja está disponivel para saques.");


    };
    
}

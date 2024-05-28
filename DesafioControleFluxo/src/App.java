import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite 2 numeros inteiros");
        Scanner terminal = new Scanner(System.in);
        int parametroUm = terminal.nextInt();
        int parametroDois = terminal.nextInt();


        

    }

    static void contar(int parametroUm, int parametroDois)throws ParametrosInvalidosException{

        int contagem = parametroDois - parametroUm;
        for(int i = 0; i <= contagem; i++){
            System.out.println("a sequencia é: "+i);
        }
    }



}

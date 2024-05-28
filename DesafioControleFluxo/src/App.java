import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        int parametroUm = terminal.nextInt();
        int parametroDois = terminal.nextInt();

    }

    static void contar(int parametroUm, int parametroDois){
        int contagem = parametroUm - parametroDois;
        for(int i = 0; contagem <=i; i++){
            System.out.println(contagem);
        }
    }



}

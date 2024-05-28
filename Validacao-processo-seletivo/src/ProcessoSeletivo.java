import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"Candidato1","Candidato2","Candidato3","Candidato4","Candidato5",};
            for(String candidato: candidatos){
                entrandoEmContato(candidato);
            }
    }

        static void entrandoEmContato(String candidato){
            int tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu = false;
            do {
                atendeu = atender();
                continuarTentando = !atendeu;
                if(continuarTentando)
                    tentativasRealizadas ++;
                else 
                    System.out.println("Contato realizado com sucesso");
            }while(continuarTentando && tentativasRealizadas <3);
                if(atendeu)
                    System.out.println("Conseguimos contato com: "+candidato+" Na "+tentativasRealizadas+" tentativas");
                else
                    System.out.println("Nao conseguimos contato com "+candidato+" numero maximo exedido "+tentativasRealizadas);
        }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Candidato1","Candidato2","Candidato3","Candidato4","Candidato5",
        "Candidato6","Candidato7","Candidato8","Candidato9","Candidato10"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O Candidato: "+candidato+" Solicitou esse valor de salario: "+salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O Candidato: "+candidato+" foi selecionado para vaga");
                candidatosSelecionados ++;
                
            }

            candidatosAtual ++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2000);
    }



    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
            
        } else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        } else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}

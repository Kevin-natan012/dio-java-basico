public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv controle = new SmartTv();

        System.out.println("Tv ligada "+ controle.ligada);
        System.out.println("Canal atual "+ controle.canal);
        System.out.println("Volume atual " + controle.volume);
        
        controle.ligar();
        controle.AumentaVolume();
        controle.MudaCanal();

        controle.DiminuirVolume();
        controle.VoltarCanal();
        controle.desligar();

        System.out.println("Tv ligou " + controle.ligada);    
        System.out.println("Tv mudou canal " + controle.canal);
        System.out.println("Tv aumentou volume " + controle.volume);

        System.out.println("Tv desligou " + controle.ligada);
        System.out.println("Tv voltou canal " + controle.canal);
        System.out.println("Tv abaixou volume " + controle.volume);
    
    
    }
}

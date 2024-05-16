public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        
        double saldo = 25.0;
        double ValorSolicitado = 17.0;

        if(ValorSolicitado < saldo){
            saldo = saldo - ValorSolicitado;
            System.out.println("saldo restante: "+saldo);

         } else{
            System.out.println("saldo insuficiente, saldo: "+saldo);
         }


        
    }
}

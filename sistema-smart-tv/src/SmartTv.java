public class  SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;   
    
    public void ligar (){
        ligada = true;
    }

    public void desligar (){
        ligada = false;
    }

    public void AumentaVolume(){
        volume++;
    }

    public void MudaCanal (){
        canal++;
    }

    public void DiminuirVolume(){
        volume --;
    }

    public void VoltarCanal(){
        canal --;
    }
}

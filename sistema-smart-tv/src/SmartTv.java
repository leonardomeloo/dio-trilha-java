public class SmartTv {
  boolean ligada = false;
  int canal = 0;
  int volume = 20;

  public void ligar(){
    ligada = true;
  }
  public void desligar(){
    ligada = false;
  }

  public void passarCanalSuperior(){
    canal++;
  }
  public void passarCanalInferior(){
    canal--;
  }

  public void aumentarVolume(){
    volume++;
  }
  public void diminuirVolume(){
    volume--;
  }

  public void selecionarCanal(int novoCanal){
    canal = novoCanal;
  }
}

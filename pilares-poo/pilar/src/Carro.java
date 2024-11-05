public class Carro extends Veiculo{

  @Override
  public void ligar() {
    confereCombustivel();
    confereCambio();
    System.out.println("CARRO LIGADO");
  }
  
  private void confereCombustivel(){
    System.out.println("conferindo combustivel");
  }
  private void confereCambio(){
    System.out.println("conferindo cambio");
  }
}

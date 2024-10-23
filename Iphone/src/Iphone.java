public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical{
  public void ligar(String numero){
    System.out.println("Ligando Para o numero" + numero);
}
public void atender(){
    System.out.println("Atendendo ligação");
}
public void iniciarCorreioVoz(){
    System.out.println("Correio de voz iniciado");
}

public void exibirPagina(String url){
  System.out.println("URL sendo exibida");
}
public void adicionarNovaAba(){
  System.out.println("Nova aba adicionada");
}
public void atualizarPagina(){
  System.out.println("Atualizando Pagina");
}
public void tocar(){
  System.out.println("Tocando");
}
public void pausar(){
  System.out.println("Musica Pausada");
}
public void selecionarMusica(String Musica){
  System.out.println("Musica selecionada");
}

}

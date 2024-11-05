public class Operadores {
  public static void main(String[] args) {
    int a, b;
    a = 5;
    b = 6;
    /* Operador Ternario. */
    String resultado = a==b ? "verdadeiro" : "false";

    System.out.println(resultado);
    System.out.println("----------------------------------");
    /* Para comprar objetos, usamos o metodo "equals()". Exemplo a baixo */
    String nomeUm = "Leonardo";
    String nomeDois = new String("Leonardo");

    System.out.println(nomeUm.equals(nomeDois));
    System.out.println("----------------------------------");

    /* Operadores Logicos */
    /* && == and || == or */
    boolean cond1 = true;
    boolean cond2 = false;

    if(cond1 && cond2){
      System.out.println("As condições são verdadeiras");
    }
    if (cond1 || cond2) {
      System.out.println("Uma condição é verdadeira");
    }
  }
}

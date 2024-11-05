public class ResultadoEscolar {
  public static void main(String[] args) {
    // int nota = 5 ;

    // if(nota >= 7)
    //   System.out.println("Aprovado");
    // else if (nota >= 5 && nota < 7)
    // System.out.println("Prova de Recuperação");
    // else
    // System.out.println("Reprovado");

    //Usando Condição Ternária(Equivalente a compreenção de lista no python)
    int nota = 7;
    String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Prova de Recuperação" : "Reprovado";
    System.out.println(resultado);
  }
}

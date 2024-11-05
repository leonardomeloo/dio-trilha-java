public class ExemploForArray {
  public static void main(String[] args) {
    String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

    //FOR padrão
    // for(int index=0; index<alunos.length; index++){
    //   System.out.println("O aluno no indice x=" + index + " é " + alunos[index]);
    // }

    //FOR EACH
    for(String aluno : alunos){
      System.out.println("Nome do aluno: " + aluno);
    }
  }
}

import java.util.Scanner;

public class ListaNomes {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] nomes = new String[10];
    for(int i=0; i < 10; i++){
      nomes[i] = sc.next();
    }
    System.out.println(nomes[2]);
    System.out.println();
    System.out.println(nomes[6]);
    System.out.println();
    System.out.println(nomes[8]);
    System.out.println();
  }
}
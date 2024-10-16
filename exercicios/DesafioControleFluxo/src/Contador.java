import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo numero");
        int n2 = sc.nextInt();
        try {
            contar(n1, n2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo numero tem que ser maior que o primeiro.");
        }
       
    }
    static void contar(int n1, int n2) throws ParametrosInvalidosException{
        if(n1 > n2){
            throw new ParametrosInvalidosException();
        }
        int resultado = n2 - n1;
        for(int i=0; i < resultado; i++){
            System.out.println("Imprimindo o número " + (i+1));
        }
        

    }

}

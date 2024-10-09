import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        System.out.println("Digite o numero da conta");
        int numero_conta = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Digite o numero da Agência");
        String numero_agencia = sc.nextLine();
        
        System.out.println("Digite o nome do cliente");
        String nome_cliente = sc.nextLine();
        
        System.out.println("Digite o valor do saldo");
        Double saldo = sc.nextDouble();
        
        System.out.println(numero_conta);
        System.out.println(numero_agencia);
        System.out.println(nome_cliente);
        System.out.println(saldo);

    }
}

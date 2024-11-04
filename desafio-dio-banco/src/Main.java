public class Main {
  public static void main(String[] args) {
    Conta cc = new ContaCorrente();
    Conta cp = new ContaPoupanca();
    System.out.println(cc.agencia);
    System.out.println(cc.numero);
    System.out.println(cc.saldo);
    cc.depositar(1544.25);
    System.out.println(cc.saldo);
    cc.sacar(544);
    System.out.println(cp.saldo);
    System.out.println(cp.agencia);
    System.out.println(cp.numero);
    System.out.println(cp.saldo);
    cc.transferir(500, cp);
    System.out.println(cp.saldo);

    cc.imprimirExtrato();
  }
}

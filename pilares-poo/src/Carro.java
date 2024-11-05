

public class Carro extends Veiculo {

	@Override
	public void ligar() {
		System.out.println("CARRO LIGADO");
	}
	
	private void confereCambio() {
		System.out.println("Conferindo Cambio...");
		System.out.println("Cambio conferido.");
}

private void confereCombustivel() {
	System.out.println("Conferindo combustivel...");
	System.out.println("Combustivel conferido.");
}
}

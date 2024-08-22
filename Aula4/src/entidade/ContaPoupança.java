package entidade;

public class ContaPoupança extends Conta{

	public ContaPoupança(String nome, int numero, double saldo) {
		super(nome, numero, saldo);
	}

	@Override
	public String toString() {
		return "ContaPoupança " + mostrar();
	}

	
	
	
	
}

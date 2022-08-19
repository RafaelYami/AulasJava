package entities;

public class ContaCorrente extends Conta {
	
	public ContaCorrente() {
	}
	
	public ContaCorrente(Cliente titular, int numeroConta, int agencia, double saldo) {
		super(titular, numeroConta, agencia, saldo);
	}
	
	@Override
	public boolean Sacar(double valor) {
		if(valor <= this.saldo) {
			saldo -= valor + 4.90;
			return true;
		}else{
			return false;
		}
	}
}

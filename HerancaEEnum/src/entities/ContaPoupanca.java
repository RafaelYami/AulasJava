package entities;

public class ContaPoupanca extends Conta {

	public ContaPoupanca() {
	}

	public ContaPoupanca(Cliente titular, int numeroConta, int agencia, double saldo) {
		super(titular, numeroConta, agencia, saldo);
	}
	
	@Override
	public boolean Sacar(double valor) {
		if(valor <= this.saldo) {
			saldo -= valor + 1.00;
			return true;
		}else{
			return false;
		}
	}

}

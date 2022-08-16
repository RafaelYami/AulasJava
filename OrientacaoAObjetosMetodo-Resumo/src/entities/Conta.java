package entities;

public class Conta {
	
	private Clientes titularDaConta;
	private int numeroConta;
	private int agencia;
	private double saldo;
	
	public Conta() {
	}

	public Clientes getTitularDaConta() {
		return titularDaConta;
	}

	public void setTitularDaConta(Clientes titularDaConta) {
		this.titularDaConta = titularDaConta;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void Depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean Sacar(double valor) throws ContaException {
		if(valor > this.saldo) {
			return false;
		}else {
			throw new ContaException("Saldo indisponível!");
			//return true;
		}	
	}
	
	public boolean Transferir(double valor, Conta destino) throws ContaException {
		if(valor <= saldo) {
			this.saldo -= valor;
			destino.saldo += valor;
			return true;
		}
		throw new ContaException("Saldo indisponível!");
		//return false;
	}

}

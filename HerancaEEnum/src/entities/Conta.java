package entities;

public class Conta {
	
	private Cliente titular;
	private int numeroConta;
	private int agencia;
	protected double saldo;
	
	public Conta() {
	}
	
	public Conta(Cliente titular, int numeroConta, int agencia, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
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
	
	public boolean Sacar(double valor) {
		if(valor <= this.saldo) {
			saldo -= valor + 2.00;
			return true;
		}else{
			return false;
		}
	}
	
	public void Depositar(double valor) {
		this.saldo += valor;
	}
	
	@Override
	public String toString() {
		return "Titular da conta: " + titular.getNome()
               + "\nCPF: " + titular.getCpf()
               + "\nNúmero da conta: " + numeroConta
			   + "\nAgência: " + agencia
			   +"\nSaldo: R$" + saldo
			   +"\n";
	}
}

package entities;

public class Veiculo {

	private int qtdPneus;
	private String motor;
	private int qtdPassageiros;
	private String combustivel;
	private String tipo;
	private String modelo;

	public Veiculo() {
	}

	public Veiculo(int qtdPneus, String motor, int qtdPassageiros, String combustivel, 
			String tipo, String modelo) {
		super();
		this.qtdPneus = qtdPneus;
		this.motor = motor;
		this.qtdPassageiros = qtdPassageiros;
		this.combustivel = combustivel;
		this.tipo = tipo;
		this.modelo = modelo;
	}

	public int getQtdPneus() {
		return qtdPneus;
	}

	public void setQtdPneus(int qtdPneus) {
		this.qtdPneus = qtdPneus;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public int getQtdPassageiros() {
		return qtdPassageiros;
	}

	public void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Quantidade de pneus: " + qtdPneus 
				+ "\nMotor: " + motor 
				+ "\nQuantidade de passageiros: "+ qtdPassageiros 
				+ "\nCombustivel: " + combustivel 
				+ "\n";
	}
}
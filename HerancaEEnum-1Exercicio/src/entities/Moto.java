package entities;

public class Moto extends Veiculo {

	private String direcao;
	private String fabricante;

	public Moto() {
	}

	public Moto(int qtdPneus, String motor, int qtdPassageiros, String combustivel, String tipo, String modelo,
			String direcao, String fabricante) {
		super(qtdPneus, motor, qtdPassageiros, combustivel, tipo, modelo);
		this.direcao = direcao;
		this.fabricante = fabricante;
	}

	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return super.toString() +  "\nDirecao: " + direcao 
				+ "\nFabricante: " + fabricante 
				+ "\n";
	}
}
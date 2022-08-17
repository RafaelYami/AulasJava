package entities;

public class Carro {
	private String modelo;
	private int ano;
	private String cor;
	private String carroceria;
	private String cambio;
	private String combustivel;
	private String novoUsado;
	private double valor;
	
	public Carro() {
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) throws Exception {
		if(ano >= 2019 && ano < 2023) {
			this.ano = ano;
		}else {
			throw new Exception("Ano inválido!");
		}
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCarroceria() {
		return carroceria;
	}
	public void setCarroceria(String carroceria) {
		this.carroceria = carroceria;
	}
	public String getCambio() {
		return cambio;
	}
	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public String getNovoUsado() {
		return novoUsado;
	}
	public void setNovoUsado(String novoUsado) {
		this.novoUsado = novoUsado;
	}
	public double getValor() {
		return valor;
	}
	public void Valor(double valor) {
		this.valor += (valor + (valor * 0.40));
	}
	
	@Override
	public String toString() {
		
		return "Modelo: " + getModelo()
		+ "\nAno: " + getAno()
		+ "\nCor: " + getCor()
		+ "\nCarroceria: " + getCarroceria()
		+ "\nCambio: " + getCambio()
		+ "\nCombustível: " + getCombustivel()
		+ "\nNovo ou usado: " + getNovoUsado()
		+ "\nValor: " + getValor()
		+ "\n";
	}
}

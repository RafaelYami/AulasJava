package entities;

public class Produto {
	
	private String nomeProduto;
	private int quantidade = 0;
	private double valor;
	
	public Produto() {
		
	}
	
	public void AdicionarItem(int qtd) {
		quantidade += qtd;
	}
	
	public void RemoverItem(int qtd) {
		quantidade -= qtd;
	}
	
	public double ValorTotalEmEstoque() {
		return quantidade * valor;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public void setNomeProduto(String nomeProduto) {
		if(nomeProduto.length() > 3) {
			this.nomeProduto = nomeProduto;
		}else {
			this.nomeProduto = "Padrão";
		}
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public String toString() {
		
		return "Nome produto: " + nomeProduto
			   + "\nQuantidade: " + quantidade
			   + " unidade(s)\nValor unitário: R$" + String.format("%.2f", valor)
		       + "\nValor total em estoque: " + String.format("R$%.2f", ValorTotalEmEstoque());
	}
}

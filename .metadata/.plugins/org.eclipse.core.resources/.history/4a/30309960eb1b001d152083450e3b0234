package entities;

public class Produto {
	
	public String nomeProduto;
	public int quantidade;
	public double valor;
	
	/*public Produto() {
		
	}*/
	
	public Produto(String nomeProduto, int quantidade, double valor) {
		//Atributo da classe | Parâmetro recebido no construtor
		this.nomeProduto =     nomeProduto;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	
	public Produto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
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
	
	/*public void Estoque() {
		System.out.println("Temos em estoque: " + (valor * quantidade) + " unidade(s).");
	}*/

	public String toString() {
		
		return "Nome produto: " + nomeProduto
			   + "\nQuantidade: " + quantidade
			   + " unidade(s)\nValor unitário: R$" + String.format("%.2f", valor)
		       + "\nValor total em estoque: " + String.format("R$%.2f", ValorTotalEmEstoque());
	}
}

package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		//Produto produto = new Produto("Item sem valor", 0, 0.00);
		
		/*System.out.print("Digite o nome do produto: ");
		produto.nomeProduto = sc.nextLine();
		
		System.out.print("Digite a quantidade do produto: ");
		produto.quantidade = sc.nextInt();
		
		System.out.print("Digite o valor unitário do produto: ");
		produto.valor = sc.nextDouble();*/
		
		System.out.print("Digite o nome do produto: ");
		//produto.nomeProduto = sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Digite a quantidade do produto: ");
		int quantidade = sc.nextInt();
		
		System.out.print("Digite o valor unitário do produto: ");
		double valor = sc.nextDouble();
		
		Produto produto = new Produto(nome, quantidade, valor);
		
		System.out.println(produto);
		
		System.out.print("Digite a quantidade a ser adicionada: ");
		int qtd = sc.nextInt();
		produto.AdicionarItem(qtd);
		
		System.out.println("Estoque atualizado: ");
		System.out.println(produto);
		
		System.out.print("Digite a quantidade a ser removida: ");
		qtd = sc.nextInt();
		produto.RemoverItem(qtd);
		
		System.out.println("Estoque atualizado: ");
		System.out.println(produto);
		
		/*
		System.out.print("Produto: " + produto.nomeProduto + ".");
		System.out.print("\nQuantidade do produto: " + produto.quantidade + ".");
		System.out.print("\nValor unitário do produto: R$" + produto.valor + ".\n");
		*/
		
		System.out.println(produto);
		
		sc.close();

	}

}

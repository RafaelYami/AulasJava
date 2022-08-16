package program;

import java.util.Scanner;

import entity.Pessoa;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		
		System.out.print("Digite o nome: ");
		pessoa.nome = sc.nextLine();
		System.out.print("Digite a idade: ");
		pessoa.idade = sc.nextInt();
		System.out.print("Digite o sexo: ");
		pessoa.sexo = sc.next().charAt(0);
		
		System.out.println("Nome: " + pessoa.nome + ".\nIdade: " + pessoa.idade + ".\nSexo: " + pessoa.sexo + ".");
		
		sc.close();

	}

}

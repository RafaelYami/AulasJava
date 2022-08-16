package aulas;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeDoisResolvida {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		String nome;
		int idade = 0;
		char sexo;
		double saldoConta = 0.0;
		
		//leia.nextLine(); para fazer a quebra de linha caso uma string esteja abaixo de outra váriavel.
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Digite seu sexo: ");
		sexo = leia.next().charAt(0);
		
		System.out.println("Digite seu saldo bancário: ");
		saldoConta = leia.nextDouble();
		
		System.out.println(nome + " tem " + idade + " anos, é do sexo " + sexo + " e possui R$" + saldoConta + " reais de saldo em sua conta bancária.");
		
		leia.close();

	}

}

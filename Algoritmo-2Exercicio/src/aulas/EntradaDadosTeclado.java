package aulas;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDadosTeclado {

	public static void main(String[] args) {
		
		//Ctrl+Shift+o importa automaticamente
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		String nome;
		int numero = 0;
		char sexo;
		double x = 10.25;
		
		System.out.println("Entre com um nome: ");
		nome = leia.nextLine();
		
		System.out.println("Entre com um número inteiro: ");
		numero = leia.nextInt();
		
		System.out.println("Entre com o sexo: ");
		sexo = leia.next().charAt(0);
		
		System.out.println("O nome digitado foi: " + nome);
		System.out.println("O número digitado foi: " + numero);
		System.out.println("O sexo digitado foi: " + sexo);
		
		System.out.println("x está valendo: " + x);
		
	    System.out.print("Insira um valor para x: ");
		x = leia.nextDouble();
		
		System.out.print("x agora está valendo: " + x);
		
		leia.close();

	}

}

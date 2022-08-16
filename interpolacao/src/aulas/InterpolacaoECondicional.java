package aulas;

import java.util.Locale;
import java.util.Scanner;

public class InterpolacaoECondicional {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		/*
		String nome = "Rafael Yamí";
		int idade = 20;
		char sexo = 'M';
		double salario = 1700.00;
		
		System.out.printf("%s tem %d anos, é do sexo %c e ganha %.2f", nome, idade, sexo, salario);
        */
		
		int a = 10;
		int b = 20;
		int c = 10;
		double d = 10.0;
	
		/*
		boolean v = true;
		boolean f = false;
		
		if (a == c && b == a || c != d) {
			System.out.println("Sim");
		}
		else {
			System.out.println("Não");
		}
		*/
		
		//System.out.println(a++);
		//System.out.println(++a);
		
		/*int ano = 2020;
		
		if (ano %4 == 0) {
			System.out.println("O ano é bissexto!");
		}else {
			System.out.println("O ano não é bissexto!");
		}*/
		
		System.out.print("Digite uma nota de 0 a 10: ");
		d = leia.nextDouble();
		
		if (d > 0.0 && d <= 10) {
			System.out.println("Nota válida!");
		}else {
			System.out.println("Nota inválida! A nota deve ser um valor de 0 a 10.");
			System.out.print("Digite uma nota: ");
			d = leia.nextDouble();
			if(d > 0.0 && d <= 10) {
				System.out.println("Nota válida!");
			}else {
				System.out.println("Sabe ler não? Tem que ser de 0 a 10.");
			}
		}
		
		leia.close();
	}

}

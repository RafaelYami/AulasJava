package aulas;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		/*
		//Usa-se quando já sabe a quantidade de vezes que executará determinada condição.
		for(int contador = 0; contador <= 10; contador++) {
			System.out.println("O contador está valendo: " + contador);
		}
		
		//Usa-se quando não sabe a quantidade de vezes que executará determinado bloco de código. 
		int i = 0;
		
		while(i <= 10) {
			System.out.println("O contador do While está valendo: " + i);
			i++;
		}
		
		//Usa-se quando
		do {
			System.out.println("O contador do Do While está valendo: " + i);
			i++;
		}while(i < 10);
		*/
		
		int condicao = 0;
		int somar = 0;
		
		/*System.out.print("Digite o número 1 para sim e 2 para não: ");
		condicao = sc.nextInt();*/
		
		/*
		while(condicao == 1) {
			System.out.println("Digitou 1!");
			somar++;
		}
		*/
		
		/*
		do {
			System.out.print("Digite o número 1 para sim e 2 para não: ");
			condicao = sc.nextInt();
		
		}while(condicao == 1);
		
		System.out.println("Saiu do bloco de repetição!");
		*/
		
		String nome = "Rafael";
		
		String aux;
		
		System.out.print("Digite um nome: ");
		aux = sc.nextLine();
		
		if(nome.equals(aux)) {
			System.out.println("Imprimiu!");
		}
		
		sc .close();

	}

}

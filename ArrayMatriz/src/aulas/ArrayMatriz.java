package aulas;

import java.util.Locale;
import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		/*
		int[] numero = new int[5]; //declara a quantidade de posições do array
		int[] numero2 = {1, 25, 10}; //inicializa o array
		
		System.out.println(numero2[1]); //obtem o valor do array no índice indicado
		System.out.println(numero[4]); //resultado vai ser zero, pois temos somente a quantidade de posições
		System.out.println(numero.length); //obtem o tamanho do array

		System.out.print("Digite a quantidade: ");
		int qtd = sc.nextInt();
		
		int[] passadoTeclado = new int[qtd];
		
		System.out.println("Quantidade de posições: " + passadoTeclado.length);
		*/
		
		int[] numeros = {1, 10, 25, 9, 50};
		
		/*for(int i = 0; i < numeros.length; i++) {
			System.out.println("Posição: " + i + ", valor no array: " + numeros[i]);
		}*/
		
		/*for(int i : numeros) {
			System.out.println(i);
		}*/
		
		/*
		System.out.print("Digite a quantidade de nomes: ");
		int qtd = sc.nextInt();
		
		String[] nomes = new String[qtd];
		sc.nextLine();
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.print("Digite o nome: ");
			nomes[i] = sc.nextLine();
		}
		
		/*for(int i = 0; i < nomes.length; i++) {
			System.out.println("nome: " + nomes[i]);
		}*/
		
		/*for(String nome : nomes) {
			System.out.println(nome);
		}*/
		
	    int[][] numerosArray = new int[3][3];
	    int contador = 10;
	    for(int i = 0; i < numerosArray.length; i++) {
	    	for(int j = 0; j < numerosArray.length; j++) {
	    		numerosArray[i][j] = contador;
	    		System.out.print(numerosArray[i][j] + "\t");
	    		contador++;
	    	}
	    	System.out.println("\n");
	    }
		
		sc.close();
	}

}

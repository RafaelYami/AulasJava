package aulas;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSelecao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);

		int n1 = 0;
		int n2 = 0;
		int n3 = 0;

		// Faça1
		/*
		 * System.out.print("Digite o primeiro número: "); n1 = leia.nextInt();
		 * 
		 * System.out.print("Digite o segundo número: "); n2 = leia.nextInt();
		 * 
		 * if (n1 > n2) { System.out.printf("O número %d é maior!", n1); } else if (n1 <
		 * n2) { System.out.printf("O número %d é maior!", n2); } else {
		 * System.out.println("Os dois números são iguais!"); }
		 */

		// Faça2
		/*
		 * System.out.print("Digite o primeiro número: "); n1 = leia.nextInt();
		 * 
		 * System.out.print("Digite o segundo número: "); n2 = leia.nextInt();
		 * 
		 * System.out.print("Digite o terceiro número: "); n3 = leia.nextInt();
		 * 
		 * if (n1 > n2 && n1 > n3) { System.out.printf("O número %d é maior!", n1);
		 * }else if (n2 > n3) { System.out.printf("O número %d é maior!", n2); }else if
		 * (n3 > n1 && n3 > n2) { System.out.printf("O número %d é maior!", n3); }else {
		 * System.out.println("Os três números são iguais!"); }
		 */

		leia.close();
	}

}

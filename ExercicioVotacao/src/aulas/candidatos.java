package aulas;

import java.util.Locale;
import java.util.Scanner;

public class candidatos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		int molusco = 0;
		int nelson = 0;
		int gomes = 0;
		int bolim = 0;
		int voto;
		char opcao;
		
		
		do {
			System.out.println("Os candidatos são: Molusco(1), Nelson(2), Gomes(3) e Bolim(4).");
			
			System.out.print("Vote em um dos candidatos: ");
			voto = sc.nextInt();
		
			switch (voto) {
			case 1:
				System.out.println("Voçê votou no Molusco!");
				molusco++;
				break;
				
			case 2:
				System.out.println("Voçê votou no Nelson!");
				nelson++;
				break;
				
			case 3:
				System.out.println("Voçê votou no Gomes!");
				gomes++;
				break;
				
			case 4:
				System.out.println("Voçê votou no Bolim!");
				bolim++;
				break;

			default:
				System.out.println("Este não é um candidato!");
			
				break;
			}
		
			System.out.print("Deseja cadastrar outro voto? ");
			opcao = sc.next().charAt(0);
		
		}while(Character.toLowerCase(opcao) == 's');
		
	    System.out.println("Molusco recebeu: " + molusco + " voto(s).");
		System.out.println("Nelson recebeu: " + nelson + " voto(s).");	
		System.out.println("Gomes recebeu: " + gomes + " voto(s).");
		System.out.println("Bolim recebeu: " + bolim + " voto(s).");
		
			
		sc.close();

	}

}

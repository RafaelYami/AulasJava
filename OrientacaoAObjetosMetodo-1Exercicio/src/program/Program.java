package program;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Herois;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		ArrayList<String> superPoderes = new ArrayList<>();
		
		Herois heroi = new Herois();
		
		char option;
		
		System.out.print("Digite o nome do herói: ");
		heroi.setNomeDeHeroi(sc.nextLine());
		
		System.out.print("Digite a idade: ");
		heroi.setIdade(sc.nextInt());
		
		System.out.print("Digite a identidade secreta: ");
		heroi.setIdentidadeSecreta(sc.nextLine());
		
		System.out.print("Digite o universo ao qual ele pertence(Marvel, DC...etc): ");
		heroi.setUniversoPertence(sc.nextLine());
		
		System.out.print("Digite o planeta natal: ");
		heroi.setPlanetaNatal(sc.nextLine());
		
		System.out.print("Digite a cidade natal: ");
		heroi.setCidadeNatal(sc.nextLine());
		
		System.out.print("Digite o grupo ou liga ao qual ele pertence: ");
		heroi.setPertenceAoGrupoLiga(sc.nextLine());
		
		System.out.print("Digite o nome da base secreta: ");
		heroi.setBaseSecreta(sc.nextLine());
		
		do {
			System.out.print("Digite seu(s) super poder(es): ");
			superPoderes.add(sc.nextLine());
			
			System.out.print("Cadastrar mais um poder?(s/n): ");
			option = sc.next().charAt(0);
			sc.nextLine();
		}while(Character.toUpperCase(option) == 'S');
		
		heroi.setSuperPoderes(superPoderes);
		
		System.out.print("Digite se o herói está na ativa(s/n): ");
		option = sc.next().charAt(0);
		
		while(Character.toUpperCase(option) != 'S' && Character.toUpperCase(option) != 'N') {
			System.out.print("Digite se o herói está na ativa(s/n): ");
			option = sc.next().charAt(0);
		}
		
		switch (Character.toUpperCase(option)) {
		case 'S': {
			heroi.setEstaNaAtiva(true);
			break;
		}
		case 'N': {
			heroi.setEstaNaAtiva(false);
			break;
		}
		default:
			System.out.println("Comando incorreto!");
			break;
		}
		
		System.out.println(heroi);
		
		sc.close();

	}

}

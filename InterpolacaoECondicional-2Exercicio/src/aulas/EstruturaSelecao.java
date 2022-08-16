package aulas;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSelecao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		//if/else1
		
		String usuarioSalvo = "Rafael";
		String senhaSalva = "7711r";
		
		String usuario;
		String senha;
		
		System.out.print("Digite o nome de usuário: ");
		usuario = leia.nextLine();
		
		System.out.print("Digite a senha: ");
		senha = leia.nextLine();
		
		if (usuario.equals(usuarioSalvo)) {
			System.out.println("Nome de usuário correto!");
		}else {
			System.out.println("Nome de usuário incorreto!");
		}
		if (senha.equals(senhaSalva)) {
			System.out.println("Senha correta!");
		}else {
			System.out.println("Senha incorreta!");
		}
		
		
		//if/else2
		/*
		double salarioBruto = 0.0;
		double salarioLiquido = 0.0;
		
		double inss = 0.11;
		double irpf = 0.05;
		
		System.out.print("Digite seu salário bruto: ");
		salarioBruto = leia.nextDouble();
		
		salarioLiquido = salarioBruto - ((salarioBruto * inss) + (salarioBruto * irpf));
		
		if(salarioLiquido < 1200.00) {
			System.out.println("Seu salário é de: " + (salarioLiquido * 1.05));
		}else if(salarioLiquido > 3500.00) {
			System.out.println("Seu salário é de: " + (salarioLiquido * 1.02));
		}else {
			System.out.println("Seu salário é de: " + salarioLiquido);
		}
		
		if(salarioLiquido < 1200) {
			salarioLiquido += salarioLiquido * 0.05;
		}else if(salarioLiquido > 3500) {
			salarioLiquido += salarioLiquido * 0.11;
		}
		System.out.println("Seu salário é de: " + salarioLiquido);
        */
		
		//switch/case1
		/*
		int itemSelecionado = 0;
		int quantidade;
		
		System.out.println("Opções do menu:");
		System.out.println("1- Sanduiche natureba");
		System.out.println("2- Sanduba bomba");
		System.out.println("3- Coxinha de jaca");
		System.out.println("4- Feijoada vegetariana");
		
		System.out.print("Escolha um item do menu: ");
		itemSelecionado = leia.nextInt();
		System.out.print("Digite a quantidade: ");
		quantidade = leia.nextInt();
		
		switch (itemSelecionado) {
		case 1:
			System.out.println("Opção escolhida: Sanduiche natureba - " + "Quantidade: " + quantidade + ".");
			break;
		
		case 2:
			System.out.println("Opção escolhida: Sanduba bomba - " + "Quantidade: " + quantidade + ".");
			break;
		
		case 3:
			System.out.println("Opção escolhida: Coxinha de jaca - " + "Quantidade: " + quantidade + ".");
			break;
		
		case 4:
		    System.out.println("Opção escolhida: Feijoada vegetariana - " + "Quantiadade: " + quantidade + ".");
            break;
			
		default:
			System.out.println("Esta não é uma opção do menu!");
			break;
		}
		*/
		
		//switch/case2
		/*
		int diaSemana = 0;
		
		System.out.print("Digite um número para saber o dia da semana: ");
		diaSemana = leia.nextInt();
		
		switch (diaSemana) {
		case 1:
			System.out.println("Voçê escolheu 1: Domingo.");
			break;
		case 2:
			System.out.println("Voçê escolheu 2: Segunda-feira.");
			break;
		case 3:
			System.out.println("Voçê escolheu 3: Terça-feira.");
			break;
		case 4:
			System.out.println("Voçê escolheu 4: Quarta-feira.");
			break;
		case 5:
			System.out.println("Voçê escolheu 5: Quinta-feira.");
			break;
		case 6:
			System.out.println("Voçê escolheu 6: Sexta-feira.");
			break;
		case 7:
			System.out.println("Você escolheu 7: Sábado.");
			break;

		default:
			System.out.println("Número incorreto!");
			break;
		}
        */
		leia.close();
	}

}

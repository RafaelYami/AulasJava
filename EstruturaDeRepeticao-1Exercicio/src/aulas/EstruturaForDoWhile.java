package aulas;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaForDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		//Faça1
		/*
		double nota;
		
		do {
			System.out.print("Digite uma nota de 0 a 10: ");
			nota = sc.nextDouble();
		
		    if(nota < 0 || nota > 10) {
			   System.out.println("Nota inválida! O valor da nota deve ser de 0 a 10.");
		}
		
		}while(nota < 0 || nota > 10);
		System.out.println("Nota válida!");
		*/
		
		//Faça2
		/*
		String nome;
		String senha;
		
		System.out.print("Digite um nome de usuário: ");
		nome = sc.nextLine();
		
		System.out.print("Digite uma senha: ");
		senha = sc.nextLine();
		
		while(nome.equals(senha)) {
           System.out.println("O nome de usuário deve ser diferente da senha!");
			
		   System.out.print("Digite um nome de usuário: ");
 		   nome = sc.nextLine();
 		
 		   System.out.print("Digite uma senha: ");
 		   senha = sc.nextLine();
        }
        System.out.print("Cadastro realizado com sucesso!");
		*/
		
		//Faça3
		
		String nome;
		int idade;
		double salario;
		char sexo;
	    char estadoCivil;
	    
	    System.out.print("Digite seu nome: ");
	    nome = sc.nextLine();
	    
	    while(nome.length() < 3) {
	    	System.out.println("O nome deve conter mais que 3 caratéres!");
	    	System.out.print("Digite seu nome: ");
	    	nome = sc.nextLine();
	    }
	    
	    System.out.print("Digite sua idade: ");
	    idade = sc.nextInt();
	    
	    while(idade <= 0 || idade > 150) {
	    	System.out.println("A idade deve ser de 0 a 150!");
	    	System.out.print("Digite sua idade: ");
		    idade = sc.nextInt();
	    }
	    
	    System.out.print("Digite seu salário: ");
	    salario = sc.nextDouble();
	    
	    while(salario < 0) {
	    	System.out.println("O salário deve ser maior que zero!");
	    	System.out.print("Digite seu salário: ");
		    salario = sc.nextDouble();
	    }
	    
	    System.out.print("Digite seu sexo: ");
	    sexo = sc.next().charAt(0);
	    
	    while(Character.toUpperCase(sexo) != 'M' && Character.toUpperCase(sexo) != 'F') {
	    	System.out.println("O sexo deve ser masculino ou feminino!");
	    	System.out.print("Digite seu sexo: ");
		    sexo = sc.next().charAt(0);
	    }
	    
	    System.out.print("Digite seu estado civil: ");
	    estadoCivil = sc.next().charAt(0);
	    
	    while(Character.toUpperCase(estadoCivil) != 'S' && Character.toUpperCase(estadoCivil) != 'C'
	       && Character.toUpperCase(estadoCivil) != 'D' && Character.toUpperCase(estadoCivil) != 'V') {
	    	System.out.println("O estado civil deve ser solteiro(a), casado(a), divorciado(a) ou viúvo(a)!");
	    	System.out.print("Digite seu estado civil: ");
		    estadoCivil = sc.next().charAt(0);
	    }
	    
	    System.out.printf("Cadastro concluído com sucesso: %s tem %d anos, tem salário de R$%.2f, é do sexo %c e atualmente está %c", nome, idade, salario, sexo, estadoCivil);
	    
	    		
		sc.close();
	}

}

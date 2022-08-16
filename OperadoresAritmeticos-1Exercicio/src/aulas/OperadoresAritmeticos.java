package aulas;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);

		/*
		//Exercício1
		
		int numero1 = 0;
		int numero2 = 0;

		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextInt();

		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextInt();

		int soma = numero1 + numero2;
		System.out.println("O resultado é: " + soma);
		
		
		//Exercício2
		
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double nota4 = 0;
		double media = 0;
		
		System.out.print("Digite a nota do primeiro bimestre: ");
		nota1 = leia.nextDouble();
		
		System.out.print("Digite a nota do segundo bimestre: ");
		nota2 = leia.nextDouble();
		
		System.out.print("Digite a nota do terceiro bimestre: ");
		nota3 = leia.nextDouble();
		
		System.out.print("Digite a nota do quarto bimestre: ");
		nota4 = leia.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("A média do aluno é: " + media);
		
		
		//Exercicio3
		
		double salarioHora = 0;
		int horasTrabalhadas = 0;
		double salarioMensal = 0;
		
		System.out.print("Digite o salário por hora trabalhada: ");
		salarioHora = leia.nextDouble();
		
		System.out.print("Digite as horas trabalhadas no mês: ");
		horasTrabalhadas = leia.nextInt();
		
		salarioMensal = salarioHora * horasTrabalhadas;
		
		System.out.println("Seu salário este mês é de: " + salarioMensal);
		*/
		
		//Exercício4
		
		double fahrenheit = 0;
		double celsius = 0;
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		fahrenheit = leia.nextDouble();
		
		celsius = (fahrenheit - 32) * 5/9;
		
		System.out.println("Esta temperatura convertida em Celsius é: " + celsius);
		
		System.out.printf("O valor de Celsius é: %.2f", celsius);/*Usa-se %.2f pra definir 
		                                                        quantas casas decimais vai 
		                                                         imprimir após a vírgula.*/
		
		leia.close();

	}

}

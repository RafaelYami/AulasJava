package program;

import java.util.Locale;
import java.util.Scanner;

import entities.FormulaHeron;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		double x = FormulaHeron.CalcularAreaTriangulo(10, 10 ,10);
		System.out.println("A área do triângulo é: " + x);
		
		/*
		FormulaHeron fh = new FormulaHeron();
		
		System.out.print("Digite os três lados do triângulo: ");
		fh.lado1 = sc.nextDouble();
		fh.lado2 = sc.nextDouble();
		fh.lado3 = sc.nextDouble();
		
		System.out.println("O valor da área do triângulo é: " + fh.CalcularAreaTriangulo());
		*/
		sc.close();

	}

}

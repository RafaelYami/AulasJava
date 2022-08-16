package aulas;

import java.util.Locale;
import java.util.Scanner;

public class SegundoGrau {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		double a;
		double b;
		double c;
		
		System.out.print("Digite o valor de A: ");
		a = sc.nextDouble();
		
		System.out.print("Digite o valor de B: ");
		b = sc.nextDouble();
		
		System.out.print("Digite o valor de C: ");
		c = sc.nextDouble();
		
		System.out.println(equacao(a, b, c));
		
		sc.close();

	}
	public static String equacao(double a, double b, double c) {
		
		double delta = b * b - 4 * a * c;
		double x1 = 0.0;
		double x2 = 0.0;
		
		if(delta < 0) {
			System.out.println("Delta não tem raiz!");
		}else {
			System.out.println("Delta igual a: " + delta);
			x1 = (- b + Math.sqrt(delta)) / (2 * a);
			x2 = (- b - Math.sqrt(delta)) / (2 * a);
		}
		
		return "X¹ igual a: " + x1 + ".\nX² igual a: " + x2 + ".";
	}

}

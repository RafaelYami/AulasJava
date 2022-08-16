package aulas;

import java.util.Locale;
import java.util.Scanner;

public class AlcoolOuGasolina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		double gasolina = 0.0;
		double alcool = 0.0;
		
		System.out.print("Digite o valor da gasolina: ");
		gasolina = sc.nextDouble();
		
		System.out.print("Digite o valor do álcool: ");
		alcool = sc.nextDouble();
		
		sc.close();
		
	    GasOuAlc(gasolina, alcool);

	}
	public static void GasOuAlc(double g, double a) {
		if(a / g >= 0.70) {
			System.out.println("A gasolina está compensando mais que o álcool!");
		}else {
			System.out.println("O álcool está compensando mais que a gasolina!");
		}
	}

}

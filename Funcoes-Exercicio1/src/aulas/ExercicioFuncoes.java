package aulas;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFuncoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		int idade = 0;
		char sexo;
		double peso = 0;
		double altura = 0;

		System.out.print("Digite a idade: ");
		idade = sc.nextInt();
		System.out.print("Digite o sexo: ");
		sexo = sc.next().charAt(0);
		System.out.print("Digite o peso: ");
		peso = sc.nextDouble();
		System.out.print("Digite a altura: ");
		altura = sc.nextDouble();

		System.out.print(CalcularIMC(altura, peso));

		sc.close();
	}

	public static String CalcularIMC(double a, double p) {

		double imc = (p / (a * a));

		if(imc <= 18.5) {
			return "Abaixo do peso! IMC: " + imc;
		}else if(imc > 18.5 && imc <= 24.9) {
			return "Peso normal! IMC: " + imc;
		}else if(imc >= 25.0 && imc <= 29.9) {
			return "Sobrepeso! IMC: " + imc;
		}else if(imc >= 30.0 && imc <= 39.9) {
			return "Obesidade! IMC: " + imc;
		}else {
			return "Obesidade grave! IMC: " + imc;
		}
	}

}

package aulas;

public class DesafioMatriz {

	public static void main(String[] args) {

		int[][] numerosArray = new int[3][3];
		int contador = 10;

		for (int i = 0; i < numerosArray.length; i++) {

			for (int j = 0; j < numerosArray.length; j++) {

				numerosArray[i][j] = contador;
				System.out.print(numerosArray[i][j] + "\t");
				contador++;
			}
			System.out.println("\n");
		}
		System.out.println("Números na diagonal: ");

		for (int i = 0; i < numerosArray.length; i++) {

			for (int j = 0; j < numerosArray.length; j++) {

				if (numerosArray[i] == numerosArray[j]) {
					System.out.print(numerosArray[i][j] + "\t");
				}
			}
		}

		/*
		 * System.out.print(numerosArray[0][0] + "\t");
		 * System.out.print(numerosArray[1][1] + "\t");
		 * System.out.print(numerosArray[2][2] + "\t");
		 */

	}

}

package aulas;

public class HelloWorld {

	public static void main(String[] args) {
		// Comentário de uma linha
		/* Comentário
		 * com mais de
		 * uma linha */
		
		int minhaVariavel = 7;
		String minhaString = "Rafael Yamí";
		double minhaDouble = 7.29;
		char minhaChar = 'R';
		boolean verdadeiro = true;
		boolean falso = false;

		System.out.println("Hello World");
		System.out.println(minhaVariavel);
		System.out.println(minhaString);
		System.out.println(minhaDouble);
		System.out.println(minhaChar);
		System.out.println(verdadeiro);
		System.out.println(falso);
		System.out.println(minhaVariavel + " " + minhaString + " " + minhaDouble);
		System.out.println(minhaString + "\n" + verdadeiro);
		
		System.out.print("Print não");
		System.out.print(" salta");
		System.out.print(" linha!");
	}

}

package aulas;

public class IntroducaoFuncao {

	public static void main(String[] args) {
		
		/*
		System.out.println(Math.sqrt(81));
		System.out.println(Math.PI);
		*/

		ImprimeNome();
		RecebeNome("Yamí!");
		System.out.println("A soma dos números é: " + Somar());
		System.out.println("A soma dos paramêtros é: " + SomarParametros(30, 40));
		System.out.println(DoisParametros("Rafael", 20));
		
	}
	
	public static void ImprimeNome() {
		System.out.println("Meu nome é Rafael!");
	}
	
	public static void RecebeNome(String nome) {
		System.out.println("Meu nome é " + nome);
	}
	
	public static int Somar() {
		
		return 1+1;
	}
	
	public static int SomarParametros(int j, int f) {
		
		//int somar = j + f;
		//return somar;
		
		return j + f;
	}
	public static String DoisParametros(String nome, int idade) {
		
		return nome + " tem " + idade + " anos.";
		
	}

}

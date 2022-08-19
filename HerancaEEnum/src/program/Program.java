package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		//Cliente cliente = new Cliente();
		Conta conta = new Conta();
		Conta contaCorrente = new ContaCorrente();
		Conta contaPoupanca = new ContaPoupanca();
		
		conta.Depositar(100);
		contaCorrente.Depositar(200);
		contaPoupanca.Depositar(150);
		
		conta.Sacar(50);
		contaCorrente.Sacar(50);
		contaPoupanca.Sacar(50);
		
		System.out.println("Saldo da conta: " + conta.getSaldo());
		System.out.println("Saldo da conta corrente: " + contaCorrente.getSaldo());
		System.out.println("Saldo da conta poupança: " + contaPoupanca.getSaldo());
		
        
        /*
		System.out.print("Digite o nome do titular: ");
		cliente.setNome(sc.nextLine());
		
		System.out.print("Digite o CPF: ");
		cliente.setCpf(sc.nextLine());
		
		contaCorrente.setTitular(cliente);
		
		System.out.print("\nDigite o número da conta: ");
		contaCorrente.setNumeroConta(sc.nextInt());
		
		System.out.print("Digite a agência: ");
		contaCorrente.setAgencia(sc.nextInt());
		
		System.out.print("Digite o valor do depósito: ");
		contaCorrente.Depositar(sc.nextDouble());
		
		System.out.println("\nConta criada com sucesso!");
		System.out.println("\n" + contaCorrente);
		
		System.out.println("Digite o valor do saque: ");
		contaCorrente.Sacar(sc.nextDouble());
		
		System.out.println("\nVocê agora tem: R$" + contaCorrente.getSaldo());
		*/
		
		sc.close();
	}

}

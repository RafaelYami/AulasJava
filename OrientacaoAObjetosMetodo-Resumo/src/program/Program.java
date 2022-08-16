package program;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

import entities.Clientes;
import entities.Conta;
import entities.ContaException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		try {
			Conta conta = new Conta();

			Conta conta2 = new Conta();

			Clientes cliente = new Clientes();

			System.out.print("Digite o número da conta: ");
			conta.setNumeroConta(sc.nextInt());

			sc.nextLine();
			System.out.print("Digite o titular: ");
			cliente.setNome(sc.nextLine());
			conta.setTitularDaConta(cliente);

			System.out.print("Digite a agência: ");
			conta.setAgencia(sc.nextInt());

			System.out.println("Saldo: " + conta.getSaldo());

			System.out.println("Você deseja depositar algum valor?");
			System.out.println("Digite o valor do depósito: ");
			conta.Depositar(sc.nextDouble());

			System.out.println("Saldo atualizado: " + conta.getSaldo());

			System.out.println(conta.getNumeroConta() + "; " 
			           + conta.getTitularDaConta().getNome() + "; "
					   + conta.getAgencia() + "; " 
			           + conta.getSaldo());

			System.out.println("Saldo da conta da Ana: " + conta2.getSaldo());

			System.out.print("Digite o valor que deseja transferir: ");
			double valor = sc.nextDouble();
			conta.Transferir(valor, conta2);

			System.out.println("Saldo da Ana: " + conta2.getSaldo());
			System.out.println("Saldo atualizado: " + conta.getSaldo());

		} catch (ContaException e) {
			System.out.println("Erro: " + e.getMessage());
		}catch(MissingFormatArgumentException e2) {
			
		}catch(InputMismatchException e3) {
			System.out.println("Digite apenas números.");
		}
		
		sc.close();
	}

}

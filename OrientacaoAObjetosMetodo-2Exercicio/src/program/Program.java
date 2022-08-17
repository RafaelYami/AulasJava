package program;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Carro;
import entities.Cliente;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		Carro carro;
		Cliente cliente;
		
		ArrayList<Carro> carros = new ArrayList<>();
		char opt;
		
		System.out.println("Deseja realizar um novo cadastro?(s/n) ");
		opt = sc.next().charAt(0);
		
	while(Character.toLowerCase(opt) == 's') {
		
		try {
		carro = new Carro();
		cliente = new Cliente();
		System.out.println("Preencha os dados do cliente: ");
		
		sc.nextLine();
		System.out.print("\nNome: ");
		cliente.setNome(sc.nextLine());
		
		System.out.print("CPF: ");
		cliente.setCpf(sc.nextLine());
		
		System.out.print("Telefone: ");
		cliente.setTelefone(sc.nextLine());
		
		System.out.print("Endereço: ");
		cliente.setEndereco(sc.nextLine());
		
		
		System.out.println("\nPreencha os dados do carro: ");
		
		System.out.print("\nModelo: ");
		carro.setModelo(sc.nextLine());
		
		System.out.print("Estado de conservação(novo ou usado): ");
		carro.setNovoUsado(sc.nextLine());
		
		System.out.print("Ano:");
		carro.setAno(sc.nextInt());
		
		sc.nextLine();
		System.out.print("Cor: ");
		carro.setCor(sc.nextLine());
		
		System.out.print("Carroceria(hatch, sedan, pickup, etc...): ");
		carro.setCarroceria(sc.nextLine());
		
		System.out.print("Câmbio(manual ou automático): ");
		carro.setCambio(sc.nextLine());
		
		System.out.print("Combustível: ");
		carro.setCombustivel(sc.nextLine());
		
		System.out.print("Valor: ");
		carro.Valor(sc.nextDouble());
		
		System.out.println("\nDados do cliente:\n" + cliente.toString());
		
		System.out.println("\nDados do carro com valor de venda:\n" + carro.toString());
		
		carros.add(carro);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Deseja realizar um novo cadastro?(s/n) ");
		opt = sc.next().charAt(0);
	}
	    
	    for(Carro listaCarros : carros) {
	    	System.out.println(listaCarros);
	    }
	
		System.out.println("Ok!");
		sc.close();
	}

}

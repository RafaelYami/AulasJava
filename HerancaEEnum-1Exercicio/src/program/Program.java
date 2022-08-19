package program;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Carro;
import entities.Moto;
import entities.Veiculo;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		Carro carro;
		Moto moto;
		
		ArrayList<Veiculo> carros = new ArrayList<>();
		ArrayList<Veiculo> motos = new ArrayList<>();
		
		char opcao;
		
		System.out.println("Você deseja cadastrar um veículo?(s/n):  ");
		opcao = sc.next().charAt(0);
		
		while(Character.toLowerCase(opcao) == 's') {
			
			System.out.println("Qual tipo de veículo quer cadastrar?(carro ou moto): ");
			String carroMoto = sc.nextLine();
			
			switch (carroMoto) {
			case "carro":
				
				carro = new Carro();
				
				System.out.print("Digite o tipo de carro: ");
				carro.setTipo(sc.nextLine());
				
				System.out.print("Digite o modelo: ");
				carro.setModelo(sc.nextLine());
				
				System.out.print("Digite a potência do motor: ");
				carro.setMotor(sc.nextLine());
				
				System.out.print("Digite o tipo de combustível: ");
				carro.setCombustivel(sc.nextLine());
				
				System.out.print("Digite a quantidade de pneus: ");
				carro.setQtdPneus(sc.nextInt());
				
				System.out.print("Digite a quantidade de passageiros: ");
				carro.setQtdPassageiros(sc.nextInt());
				
				sc.nextLine();
				System.out.print("Digite o tipo de ar-condicionado(manual ou digital): ");
				carro.setArCondicionado(sc.nextLine());
				
				System.out.print("Digite o tipo de som(básico ou multimídia): ");
				carro.setSonorizacao(sc.nextLine());
				
				carros.add(carro);
				break;
				
			case "moto":
				
				moto = new Moto();
				
				System.out.print("Digite o tipo de moto: ");
				moto.setTipo(sc.nextLine());
				
				System.out.print("Digite o modelo: ");
				moto.setModelo(sc.nextLine());
				
				System.out.print("Digite a potência do motor: ");
				moto.setMotor(sc.nextLine());
				
				System.out.print("Digite o tipo de combustível: ");
				moto.setCombustivel(sc.nextLine());
				
				System.out.print("Digite a quantidade de pneus: ");
				moto.setQtdPneus(sc.nextInt());
				
				System.out.print("Digite a quantidade de passageiros: ");
				moto.setQtdPassageiros(sc.nextInt());
				
				sc.nextLine();
				System.out.print("Digite o fabricante: ");
				moto.setFabricante(sc.nextLine());
				
				System.out.print("Digite o tipo de direção: ");
				moto.setDirecao(sc.nextLine());
				
				motos.add(moto);
				break;
				
			default:
				System.out.println("Tipo incompátivel!");
				break;
			}
			
		}
		
		for(Veiculo listaCarros : carros) {
			System.out.println(listaCarros);
		}
		
		sc.close();
	}
}
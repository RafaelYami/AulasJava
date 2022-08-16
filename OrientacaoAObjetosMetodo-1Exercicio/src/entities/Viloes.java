package entities;

import java.util.ArrayList;

public class Viloes {
	private String identidadeSecreta;
	private String nomeDeVilao;
	private ArrayList<String> poderes;
	
	public Viloes() {
	}
	
	public Viloes(String identidadeSecreta, String nomeDeVilao, ArrayList<String> poderes) {
		this.identidadeSecreta = identidadeSecreta;
		this.nomeDeVilao = nomeDeVilao;
		this.poderes = poderes;
	}
	
	public String getIdentidadeSecreta() {
		return identidadeSecreta;
	}
	
	public void setIdentidadeSecreta(String identidadeSecreta) {
		this.identidadeSecreta = identidadeSecreta;
	}
	
	public String getNomeDeVilao() {
		return nomeDeVilao;
	}
	
	public void setNomeDeVilao(String nomeDeVilao) {
		this.nomeDeVilao = nomeDeVilao;
	}
	
	public ArrayList<String> getPoderes(){
		return poderes;
	}
	
	public void setPoderes(ArrayList<String> poderes) {
		this.poderes = poderes;
	}
	
	@Override
	public String toString() {
		
		return "Identidade secreta: " + getIdentidadeSecreta()
		+ "\nNome de vilão: " + getNomeDeVilao()
		+ "\nPoderes: " + getPoderes()
		+ "\n";
	}

}

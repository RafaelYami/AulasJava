package entities;

import java.util.ArrayList;

public class Herois {
	private String identidadeSecreta;
	private String universoPertence;
	private String nomeDeHeroi;
	private String planetaNatal;
	private String pertenceAoGrupoLiga;
	private String cidadeNatal;
	private String baseSecreta;
	private ArrayList<String> superPoderes;
	private int idade;
	private boolean estaNaAtiva;

	public Herois() {
	}
	
	public Herois(String identidadeSecreta, String universoPertence, String nomeDeHeroi,
			String planetaNatal, String pertenceAoGrupoLiga, String cidadeNatal,
			String baseSecreta, ArrayList<String> superPoderes, int idade, boolean estaNaAtiva) {
		super();
		
		this.identidadeSecreta = identidadeSecreta;
		this.universoPertence = universoPertence;
		this.nomeDeHeroi = nomeDeHeroi;
		this.pertenceAoGrupoLiga = pertenceAoGrupoLiga;
		this.cidadeNatal = cidadeNatal;
		this.baseSecreta = baseSecreta;
		this.planetaNatal = planetaNatal;
		this.superPoderes = superPoderes;
		this.idade = idade;
		this.estaNaAtiva = estaNaAtiva;
	}
	
	public String getIdentidadeSecreta() {
		return identidadeSecreta;
	}
	
	public void setIdentidadeSecreta(String identidadeSecreta) {
		this.identidadeSecreta = identidadeSecreta;
	}
	
	public String getUniversoPertence() {
		return universoPertence;
	}
	
	public void setUniversoPertence(String universoPertence) {
		this.universoPertence = universoPertence;
	}
	
	public String getNomeDeHeroi() {
		return nomeDeHeroi;
	}
	
	public void setNomeDeHeroi(String nomeDeHeroi) {
		this.nomeDeHeroi = nomeDeHeroi;
	}
	
	public String getPertenceAoGrupoLiga() {
		return pertenceAoGrupoLiga;
	}
	
	public void setPertenceAoGrupoLiga(String pertenceAoGrupoLiga) {
		this.pertenceAoGrupoLiga = pertenceAoGrupoLiga;
	}
	
	public String getCidadeNatal() {
		return cidadeNatal;
	}
	
	public void setCidadeNatal(String cidadeNatal) {
		this.cidadeNatal = cidadeNatal;
	}
	
	public String getBaseSecreta() {
		return baseSecreta;
	}
	
	public void setBaseSecreta(String baseSecreta) {
		this.baseSecreta = baseSecreta;
	}
	
	public String getPlanetaNatal() {
		return planetaNatal;
	}
	
	public void setPlanetaNatal(String planetaNatal) {
		this.planetaNatal = planetaNatal;
	}
	
	public ArrayList<String> getSuperPoderes() {
		return superPoderes;
	}
	
	public void setSuperPoderes(ArrayList<String> superPoderes) {
		this.superPoderes = superPoderes;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public boolean getEstaNaAtiva() {
		return estaNaAtiva;
	}
	
	public void setEstaNaAtiva(boolean estaNaAtiva) {
		this.estaNaAtiva = estaNaAtiva;
	}
	
	@Override
	public String toString() {
		
		return "Identidade secreta: " + getIdentidadeSecreta()
		+ "\nUniverso que pertence: " + getUniversoPertence()
		+ "\nNome de herói: " + getNomeDeHeroi()
		+ "\nGrupo ou liga: " + getPertenceAoGrupoLiga()
		+ "\nCidade natal: " + getCidadeNatal()
		+ "\nBase secreta: " + getBaseSecreta()
		+ "\nPlaneta natal: " + getPlanetaNatal()
		+ "\nSuper poder(es): " + getSuperPoderes()
		+ "\nIdade: " + getIdade()
		+ "\nEstá na ativa? " + getEstaNaAtiva()
		+ "\n";
	}

}

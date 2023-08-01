package Model;

public class Paises {
	String nome;
	String capital;
	
	
	
	public Paises(String nome, String capital) {
		this.nome = nome;
		this.capital = capital;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}


	@Override
	public String toString() {
		return "Paises [nome=" + nome + ", capital=" + capital + "]";
	}
	
	

}

package designerPartner_singleton;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return this.idade;
	}

	public static Pessoa instancia;
	
	private Pessoa() {
		super();
	}
	
	public static Pessoa getInstancia() {
		if(instancia == null) {
			instancia = new Pessoa();
		}
		return instancia;
	}
}

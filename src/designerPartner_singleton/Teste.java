package designerPartner_singleton;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = Pessoa.getInstancia();
		
		pessoa1.setNome("Ricardo");
		pessoa1.setIdade(38);
		
		System.out.println("Nome: " + pessoa1.getNome() + " " + "Idade: " + pessoa1.getIdade());
	}

}

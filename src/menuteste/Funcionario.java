package menuteste;

import java.util.List;

public class Funcionario {

	private String nome;
	private List<Marcacao> marcacoes;

	public String getNome() {
		return nome;
	}
//testes
	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Marcacao> getMarcacoes() {
		return marcacoes;
	}

	public void setMarcacoes(List<Marcacao> marcacoes) {
		this.marcacoes = marcacoes;
	}

}

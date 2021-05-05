package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Funcionario {

	private String nome;
	private String pis;
	private Date dataAdm;

	private List<Marcacao> marcacaoss;

	public Funcionario() {
		this.marcacaoss = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPis() {
		return pis;
	}

	public void setPis(String pis) {
		this.pis = pis;
	}

	public Date getDataAdm() {
		return dataAdm;
	}

	public void setDataAdm(Date dataAdm) {
		this.dataAdm = dataAdm;
	}

	public List<Marcacao> getMarcacaoss() {
		return marcacaoss;
	}

	public void setMarcacaoss(List<Marcacao> marcacaoss) {
		this.marcacaoss = marcacaoss;
	}

	@Override
	public String toString() {
		return "Funcionário : " + getNome() + " | PIS: " + getPis() + "| Admissão: " + dataAdm;
	}

}

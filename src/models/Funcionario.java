package models;

import java.util.Date;

public class Funcionario {
	
	private String nome;
	private int pis;
	private Date dataAdm;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPis() {
		return pis;
	}
	public void setPis(int pis) {
		this.pis = pis;
	}
	public Date getDataAdm() {
		return dataAdm;
	}
	public void setDataAdm(Date dataAdm) {
		this.dataAdm = dataAdm;
	}
	
	@Override
	public String toString() {
		return "Funcionário : " + getNome() + " | PIS: " + getPis()+ "| Admissão: " + dataAdm;
	}
	
}

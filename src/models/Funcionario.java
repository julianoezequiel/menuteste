package models;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Funcionario extends Ponto
{
	private String nome;
	private String pis;
	private String cargo;
	private ArrayList<ListaEndereco> endereco;
	private double valorHora;
	private Date dataAdm;
	
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
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public Date getDataAdm() {
		return dataAdm;
	}
	public void setDataAdm(Date dataAdm) {
		this.dataAdm = dataAdm;
	}
	public ArrayList<ListaEndereco> getEndereco() {
		return endereco;
	}
	public void setEndereco(ArrayList<ListaEndereco> endereco) {
		this.endereco = endereco;
	}
	public String transHoras()
	{
		SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
	    String stringData= DateFor.format(getDataAdm());
	    return "Data da Admição: " + stringData;
		
	}
	
	@Override
	public String toString() {
		return "Funcionário : " + getNome() + " | PIS: " + getPis()+  " | Cargo:" + getCargo() +
				" | Hora de serviço: R$ " + getValorHora() + " | " + transHoras() +
				"\nEndereço: " + getEndereco()
				+ 
				super.toString();
	}

}

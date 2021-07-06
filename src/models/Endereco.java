package models;

public class Endereco extends Ponto
{
	private String estado;
	private String cidade;
	private String rua;
	private int numero;
	private String complemento;
	private String apelidoEndereco;
	
	
	
	public String getApelidoEndereco() {
		return apelidoEndereco;
	}
	public void setApelidoEndereco(String apelidoEndereco) {
		this.apelidoEndereco = apelidoEndereco;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	@Override
	public String toString() {
		
		return "Estado: " + getEstado() + "\nCidade: " + getCidade() 
		+ "\nRua: " + getRua() + "\nNumero: " + getNumero() 
		+ "\nComplemento: " + getComplemento() + "\n" 
		+ super.toString();
	}

}

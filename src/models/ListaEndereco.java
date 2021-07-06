package models;

public class ListaEndereco extends Ponto {
	
	private Endereco enderecos;
	private String apelidoEndereco;
	
	public String getApelidoEndereco() {
		return apelidoEndereco;
	}
	public void setApelidoEndereco(String apelidoEndereco) {
		this.apelidoEndereco = apelidoEndereco;
	}
	public Endereco getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(Endereco enderecos) {
		this.enderecos = enderecos;
	}
	
	@Override
	public String toString() {
		return "\nEstado:"            + getEnderecos().getEstado()
			+  "\nCidade:"            + getEnderecos().getCidade()
			+  "\nRua: "       		  + getEnderecos().getRua()
			+  "\nNumero: "           + getEnderecos().getNumero()
			+  "\nComplemento: "      + getEnderecos().getComplemento();
	}

}

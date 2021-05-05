package models;


public class Marcacao {
	
	private Funcionario funcionarios;
	private Double entrada;
	private Double saidaAlmoco;
	private Double voltaAlmoco;
	private Double saida;
		
	
	public Double getEntrada() {
		return entrada;
	}
	public void setEntrada(Double entrada) {
		this.entrada = entrada;
	}
	public Double getSaidaAlmoco() {
		return saidaAlmoco;
	}
	public void setSaidaAlmoco(Double saidaAlmoco) {
		this.saidaAlmoco = saidaAlmoco;
	}
	public Double getVoltaAlmoco() {
		return voltaAlmoco;
	}
	public void setVoltaAlmoco(Double voltaAlmoco) {
		this.voltaAlmoco = voltaAlmoco;
	}
	public Double getSaida() {
		return saida;
	}
	public void setSaida(Double saida) {
		this.saida = saida;
	}
	public Funcionario getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(Funcionario funcionario) {
		this.funcionarios = funcionario;
	}
	
	@Override
    public String toString() {
        return "\n" + funcionarios+ "\nEntrada: " + entrada+ "\nSaida Para Almoço: "+ saidaAlmoco+
        		"\nVolta do Almoco:  " + voltaAlmoco + "\nSaida: " + saida;
    }
	 
	
	
}

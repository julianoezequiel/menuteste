package models;

import java.util.Date;

public class CalculoDiario extends Ponto 
{
	private Funcionario funcionario;
	private Date data;
	private double pagamento;
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public double getPagamento() {
		return pagamento;
	}
	public void setPagamento(double pagamento) {
		this.pagamento = pagamento;
	}
	@Override
	public String toString() {
		return "Nome do funcionário: " + getFuncionario().getNome() + "\nData do pagamento: " + getData() + "\nQuantia paga: "
				+ getPagamento();
	}
	

	
}

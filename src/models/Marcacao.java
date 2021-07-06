package models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Marcacao extends Ponto
{
	private Funcionario funcionarios;
	private Date dataMarcacao;
	private Date horaEntrada;
	private Date horaSaidaAlmoco;
	private Date horaVoltaAlmoco;
	private Date horaSaida;
	private double minTrab;
	
	public Funcionario getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(Funcionario funcionarios) {
		this.funcionarios = funcionarios;
	}
	public Date getDataMarcacao() {
		return dataMarcacao;
	}
	public void setDataMarcacao(Date dataMarcacao) {
		this.dataMarcacao = dataMarcacao;
	}
	public Date getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(Date horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public Date getHoraSaidaAlmoco() {
		return horaSaidaAlmoco;
	}
	public void setHoraSaidaAlmoco(Date horaSaidaAlmoco) {
		this.horaSaidaAlmoco = horaSaidaAlmoco;
	}
	public Date getHoraVoltaAlmoco() {
		return horaVoltaAlmoco;
	}
	public void setHoraVoltaAlmoco(Date horaVoltaAlmoco) {
		this.horaVoltaAlmoco = horaVoltaAlmoco;
	}
	public Date getHoraSaida() {
		return horaSaida;
	}
	public void setHoraSaida(Date horaSaida) {
		this.horaSaida = horaSaida;
	}
	public double getMinTrab() {
		return minTrab;
	}
	public void setMinTrab(double minTrab) {
		this.minTrab = minTrab;
	}
	
	public long calcularHorasTrab()
	{
		long horasTms = (horaSaidaAlmoco.getTime() - horaEntrada.getTime()) 
				+ 		(horaSaida.getTime() - horaVoltaAlmoco.getTime());
		
		 long horasTh = horasTms / (60 * 1000);
		 String horasThtoS = String.valueOf(horasTh);
		 double horasCon = Double.parseDouble(horasThtoS);
		 setMinTrab(horasCon);
		 return horasTh;	 
	}
	
	public String transHoras(Date data)
	{
		
		SimpleDateFormat horaFor = new SimpleDateFormat("HH:mm");
	    String stringHora= horaFor.format(data);
	    return stringHora;
	}
	
	public String transDia(Date data)
	{
		SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
		String stringData = DateFor.format(data);
		return stringData;
	}
	
	
	
	@Override
	public String toString() 
	{
		return "\n\nFuncionário : " + getFuncionarios().getNome() +
				"\nData marcação: " + transDia(getDataMarcacao()) + 
				"\nHora Entrada: " + transHoras(getHoraEntrada()) +
				"\nHora Saida almoço: " + transHoras(getHoraSaidaAlmoco()) +
				"\nHora Volta almoço: " + transHoras(getHoraVoltaAlmoco()) +
				"\nHora Saida: " + transHoras(getHoraSaida()) +
				"\n\nMinutos Trabalhados : " + calcularHorasTrab() + 
				super.toString();
	}
	
	
}

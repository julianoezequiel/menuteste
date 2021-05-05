package models;

import java.time.LocalTime;

public class Horario {

	public enum TIPO {
		ENTRADA, SAIDA
	}

	private TIPO tipo;
	private LocalTime registro;
	private String observacao;

	public LocalTime getRegistro() {
		return registro;
	}

	public void setRegistro(LocalTime registro) {
		this.registro = registro;
	}

	public TIPO getTipo() {
		return tipo;
	}

	public void setTipo(TIPO tipo) {
		this.tipo = tipo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}

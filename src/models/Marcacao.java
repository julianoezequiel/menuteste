package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Marcacao {

	private LocalDate data;
	private List<Horario> horarios;

	public Marcacao() {
		this.horarios = new ArrayList<>();
	}
	
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public List<Horario> getHorarios() {
		return horarios;
	}

	public void setHorarios(List<Horario> horarios) {
		this.horarios = horarios;
	}
}

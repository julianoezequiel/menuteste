package models;

import java.util.Date;

public abstract class Ponto 
{
	public Ponto()
	{
		setCriadoEm(new Date()); 
	}
	
	private Date criadoEm;

	public Date getCriadoEm() {
		return criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Override
	public String toString() {
		return "\nCriado Em: " + getCriadoEm();
	}
	
	
	
}

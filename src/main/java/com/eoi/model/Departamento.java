package com.eoi.model;

public class Departamento {
	private String coddepto;
	private String nombredpto;
	private String ciudad; 
	private String coddirector;
	
	
	
	public Departamento() {
		super();
	}


	public Departamento(String coddepto, String nombredpto, String ciudad, String coddirector) {
		super();
		this.coddepto = coddepto;
		this.nombredpto = nombredpto;
		this.ciudad = ciudad;
		this.coddirector = coddirector;
	}


	public String getCoddeto() {
		return coddepto;
	}


	public void setCoddeto(String coddeto) {
		this.coddepto = coddeto;
	}


	public String getNombredpto() {
		return nombredpto;
	}


	public void setNombredpto(String nombredpto) {
		this.nombredpto = nombredpto;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getCoddirector() {
		return coddirector;
	}


	public void setCoddirector(String coddirector) {
		this.coddirector = coddirector;
	}


	@Override
	public String toString() {
		return "Departamento [coddeto=" + coddepto + ", nombredpto=" + nombredpto + ", ciudad=" + ciudad
				+ ", coddirector=" + coddirector + "]";
	}
	
	
	
	
}

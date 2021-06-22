package com.eoi.model;

public class Empleado {
	private String nomEmp;
	private String password;
	private String rol; 
	private String email;
	
	public Empleado() {
		super();
	}
	
	public Empleado(String nomEmp, String password, String rol, String email) {
		super();
		this.nomEmp = nomEmp;
		this.password = password;
		this.rol = rol;
		this.email = email;
	}


	public String getNomEmp() {
		return nomEmp;
	}


	public void setNomEmp(String nomEmp) {
		this.nomEmp = nomEmp;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRol() {
		return rol;
	}


	public void setRol(String rol) {
		this.rol = rol;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Empleado [nomEmp=" + nomEmp + ", password=" + password + ", rol=" + rol + ", email=" + email + "]";
	} 
	
	
	

}

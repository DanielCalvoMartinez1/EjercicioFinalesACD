package Ejercicio2;

import java.io.Serializable;

public class Pais implements Serializable {
	private String Nombre;
	private String Presidente;
	private int PIB;
	private double Coeficiente_de_Gini;
	
	
	
	public Pais(String pais, String presidente, int pib, double gini) {
		super();
		this.Nombre = pais;
		this.Presidente = presidente;
		this.PIB = pib;
		this.Coeficiente_de_Gini = gini;
	}
	
	public String getPais() {
		return Nombre;
	}
	public void setPais(String pais) {
		this.Nombre = pais;
	}
	public String getPresidente() {
		return Presidente;
	}
	public void setPresidente(String presidente) {
		this.Presidente = presidente;
	}
	public int getPib() {
		return PIB;
	}
	public void setPib(int pib) {
		this.PIB = pib;
	}
	public double getGini() {
		return Coeficiente_de_Gini;
	}
	public void setGini(double gini) {
		this.Coeficiente_de_Gini = gini;
	}
	
	@Override
	public String toString() {
		return "Pais [pais=" + Nombre + ", presidente=" + Presidente + ", pib=" + PIB + ", gini=" + Coeficiente_de_Gini + "]";
	}
	
	

}

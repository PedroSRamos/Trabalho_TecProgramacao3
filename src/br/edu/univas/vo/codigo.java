package br.edu.univas.vo;

public class codigo {
	String caractMinusculos = "abcdefghijklmnopqrstuvywxz";
	String caractMaiuculos = "ABCDEFGHIJKLMNOPQRSTUVYWXZ";
	String numeros = "0123456789";
	String caractEspeciais = "!@#$%&*";
	
	public String getCaractMinusculos() {
		return caractMinusculos;
	}
	public void setCaractMinusculos(String caractMinusculos) {
		this.caractMinusculos = caractMinusculos;
	}
	public String getCaractMaiuculos() {
		return caractMaiuculos;
	}
	public void setCaractMaiuculos(String caractMaiuculos) {
		this.caractMaiuculos = caractMaiuculos;
	}
	public String getNumeros() {
		return numeros;
	}
	public void setNumeros(String numeros) {
		this.numeros = numeros;
	}
	public String getCaractEspeciais() {
		return caractEspeciais;
	}
	public void setCaractEspeciais(String caractEspeciais) {
		this.caractEspeciais = caractEspeciais;
	}
}

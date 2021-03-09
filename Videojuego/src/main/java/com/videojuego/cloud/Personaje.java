package com.videojuego.cloud;

public class Personaje {
	private String nombre;
	private int vida;
	private Arma arma;
	private Atributos atributo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	public Atributos getAtributo() {
		return atributo;
	}
	public void setAtributo(Atributos atributo) {
		this.atributo = atributo;
	}
	public void atacar(Personaje atacado) {

	}
	
}

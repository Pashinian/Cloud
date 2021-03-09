package com.videojuego.cloud;

public class Hechizo extends Arma{
	public void usar() {
		System.out.println("Hechizaooo!");
		System.out.println("Arma: " + getTipoarma() + " Menos " + getRestapuntos() + " de Vida");
		System.out.println("----------------------------------------------------");

	}
}

package com.videojuego.cloud;

public class Espada extends Arma{
	public void usar() {
		System.out.println("ESPADAZOOO!");
		System.out.println("Arma: " + getTipoarma() + " Menos " + getRestapuntos() + " de Vida");
		System.out.println("----------------------------------------------------");

	}
}
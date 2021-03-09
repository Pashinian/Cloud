package com.videojuego.cloud;

public class Rezo extends Arma{
	public void usar() {
		System.out.println("Toma Rezo!");
		System.out.println("Arma: " + getTipoarma() + " Menos " + getRestapuntos() + " de Vida");
		System.out.println("----------------------------------------------------");
	}
}

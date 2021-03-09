package com.videojuego.cloud;

public class Arco extends Arma{
	public void usar() {
		System.out.println("Piuumm Piuumm!");
		System.out.println("Arma: " + getTipoarma() + " Menos " + getRestapuntos() + " de Vida");
		System.out.println("----------------------------------------------------");

	}
}

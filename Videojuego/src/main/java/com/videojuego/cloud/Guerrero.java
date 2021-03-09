package com.videojuego.cloud;

public class Guerrero extends Personaje {

	
	public void atacar(Personaje atacado) {

		System.out.println("SOY UN GUERRERO APLASTACABEZAS!!");
		getArma().usar();
		atacado.setVida(atacado.getVida()-getArma().getRestapuntos());

	}

}

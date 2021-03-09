package com.videojuego.cloud;

public class Mago extends Personaje {

	
	public void atacar(Personaje atacado) {

		System.out.println("SOY UN MAGO, EXPELIERMUS!!");
		getArma().usar();
		atacado.setVida(atacado.getVida()-getArma().getRestapuntos());

	}

}

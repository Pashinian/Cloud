package com.videojuego.cloud;

public class Curandero extends Personaje {

	
	public void atacar(Personaje atacado) {

		System.out.println("SOY UN CURANDERO, PERO A TI NO TE CURO!!");
		getArma().usar();
		atacado.setVida(atacado.getVida()-getArma().getRestapuntos());

	}

}

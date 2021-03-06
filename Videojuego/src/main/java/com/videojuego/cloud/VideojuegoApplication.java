package com.videojuego.cloud;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Random;

public class VideojuegoApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext bean = new ClassPathXmlApplicationContext("Beans.xml");
		
		Personaje mago = bean.getBean("mago", Personaje.class);
		Personaje guerrero = bean.getBean("guerrero", Personaje.class);
		Personaje curandero = bean.getBean("curandero", Personaje.class);
		
		Random azar = new Random();

		while (guerrero.getVida() > 0 || mago.getVida() > 0 || curandero.getVida() > 0) {

			Personaje[] lista = { guerrero, curandero, mago };

			Personaje atacado = lista[azar.nextInt(3)];
			guerrero.atacar(atacado);
			System.out.println("Vida de " + atacado.getNombre() + " es: " + atacado.getVida());
			System.out.println("----------------------------------------------------");

			atacado = lista[azar.nextInt(3)];
			mago.atacar(atacado);
			System.out.println("Vida de " + atacado.getNombre() + " es: " + atacado.getVida());
			System.out.println("----------------------------------------------------");

			atacado = lista[azar.nextInt(3)];
			curandero.atacar(atacado);
			System.out.println("Vida de " + atacado.getNombre() + " es: " + atacado.getVida());
			System.out.println("----------------------------------------------------");

			int[] vidaTotal = { guerrero.getVida(), mago.getVida(), curandero.getVida() };

			Arrays.sort(vidaTotal);

			System.out.println("----------------------------------------------------");
			System.out.println("Vida total del guerrero: " + guerrero.getVida());
			System.out.println("Vida total del mago: " + mago.getVida());
			System.out.println("Vida total del curandero: " + curandero.getVida());
			System.out.println("****************************************************");

			if (vidaTotal[2] == guerrero.getVida()) {
				System.out.println("Ha ganado el guerrero!!");
				System.out.println("****************************************************");

			} else if (vidaTotal[2] == mago.getVida()) {
				System.out.println("Ha ganado el mago!!");
				System.out.println("****************************************************");

			} else if (vidaTotal[2] == curandero.getVida()) {
				System.out.println("Ha ganado el curandero!!");
				System.out.println("****************************************************");
			}

		}
	}

}

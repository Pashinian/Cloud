package com.concesionario.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableDiscoveryClient
public class ConcesionarioApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ConcesionarioApplication.class, args);
		

		DatosCoche daoCoche = context.getBean("daoCoche", DatosCoche.class);
		
		Coche c = new Coche();
		c.setMarca("Porsche");
		c.setModelo("718 Cayman T");
		c.setMatricula("2876LSB");
		c.setPotencia(300);
		
		daoCoche.save(c);
	}
	
}

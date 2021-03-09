package com.concesionario.cloud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

@RestController
public class Controlador {

	@Autowired
	private Environment environment;
	
	@Autowired
	private GestorCoche gestorCoche;

	@GetMapping("coches")
	public ResponseEntity<List<Coche>> listar() {
		System.out.println("Entrando por get (listar)");

		List<Coche> lista = gestorCoche.listar();

		return new ResponseEntity<List<Coche>>(lista, HttpStatus.OK);
	}

	@PostMapping("coches")
	public ResponseEntity<Coche> alta(@RequestBody Coche coche) {
		System.out.println("Entrando por post (alta)");

		Coche cocheNuevo = gestorCoche.alta(coche);

		HttpStatus respuesta = null;

		if (cocheNuevo != null) {
			respuesta = HttpStatus.CREATED;
		} else {
			respuesta = HttpStatus.BAD_REQUEST;
		}

		return new ResponseEntity<Coche>(cocheNuevo, respuesta);
	}

	@GetMapping("coches/{id}")
	public ResponseEntity<Coche> obtener(@PathVariable("id") int id) {
		System.out.println("Entrando por get (obtener)");

		Coche consultaCoche = gestorCoche.consultar(id);

		HttpStatus respuesta = null;

		if (consultaCoche != null) {
			respuesta = HttpStatus.OK;
		} else {
			respuesta = HttpStatus.NOT_FOUND;
		}

		return new ResponseEntity<Coche>(consultaCoche, respuesta);
	}

	@PutMapping("coches/{id}")
	public ResponseEntity<Coche> modificar(@RequestBody Coche coche, @PathVariable("id") int id) {
		System.out.println("Entrando por put (modificar)");

		coche.setId(id);

		Coche cocheModificado = gestorCoche.modificar(coche);

		HttpStatus respuesta = null;

		if (cocheModificado != null) {
			respuesta = HttpStatus.OK;
		} else {
			respuesta = HttpStatus.BAD_REQUEST;
		}

		return new ResponseEntity<Coche>(cocheModificado, respuesta);
	}

	@DeleteMapping("coches/{id}")
	public ResponseEntity<Integer> borrar(@PathVariable("id") int id) {
		System.out.println("Entrando por delete (borrar)");

		boolean cocheBorrado = gestorCoche.borrar(id);

		HttpStatus respuesta = null;

		if (cocheBorrado) {
			respuesta = HttpStatus.OK;
		} else {
			respuesta = HttpStatus.BAD_REQUEST;
		}

		return new ResponseEntity<Integer>(id, respuesta);
	}

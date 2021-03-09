package mvc.modelo.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Coche {
	@Id
	@GeneratedValue
	private int Matricula;
	private String Modelo;
	private String Caballos;

	public int getMatricula() {
		return Matricula;
	}

	public void setMatricula(int matricula) {
		Matricula = matricula;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getCaballos() {
		return Caballos;
	}

	public void setCaballos(String caballos) {
		Caballos = caballos;
	}

	public Coche(int matricula, String modelo, String caballos) {
		super();
		Matricula = matricula;
		Modelo = modelo;
		Caballos = caballos;
	}

	@Override
	public String toString() {
		return "Coche [Matricula=" + Matricula + ", Modelo=" + Modelo + ", Caballos=" + Caballos + "]";
	}

}

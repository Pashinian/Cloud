package mvc.modelo.persistencia;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mvc.modelo.entidad.Usuario;

@Repository
public interface DaoUsuario extends JpaRepository<Usuario, Integer> {

	//Para hacer busquedas por algun atributo podemos
	//hacerlo con el siguiente metodo
	//Es obligatorio que empiece por "findBy" y luego
	//el atributo que querais.
	public Optional<Usuario> findByUsername(String username);
}

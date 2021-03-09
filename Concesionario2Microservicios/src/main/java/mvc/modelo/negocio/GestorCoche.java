package mvc.modelo.negocio;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvc.modelo.entidad.Coche;
import mvc.modelo.persistencia.DaoCoche;

@Service
public class GestorCoche {

	@Autowired
	private DaoCoche daoUsuario;
	
	public boolean validar(Coche matricula) {
		Optional<Coche> userBBDD = 
				daoUsuario.findByMatricula(matricula.getModelo());
		
		if(!userBBDD.isPresent()) {
			return false;
		}
		
		if(matricula.getCaballos().equals(userBBDD.get().getCaballos())){
			return true;
		}else {
			return false;
		}
	}
}

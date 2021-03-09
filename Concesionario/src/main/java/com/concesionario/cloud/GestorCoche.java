package com.concesionario.cloud;

@Service
public class GestorCoche {
	
	@Autowired
	private DaoCoche daoCoche;
	
	public Coche consultar(int id) {
		Optional<Coche> opt = daoCoche.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else {
			return null;
		}		
	}
	
	public Coche alta(Coche coche) {
		Coche c = daoCoche.save(coche);
		return c;
	}
	
	public Coche modificar(Coche coche) {
		Coche c = daoCoche.save(coche);
		return c;
	}
	
	public List<Coche> listar(){
		List<Coche> lista = daoCoche.findAll();
		return lista;
	}
	
	public boolean borrar(int id) {
		if(daoCoche.findById(id).isPresent()) {
			daoCoche.deleteById(id);
			return true;
		}else {
			return false;
		}
		
	}
}

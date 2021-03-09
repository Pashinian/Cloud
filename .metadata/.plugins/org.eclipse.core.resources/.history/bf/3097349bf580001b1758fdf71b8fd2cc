package mvc.controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import mvc.modelo.entidad.Usuario;
import mvc.modelo.negocio.GestorUsuario;

//Cuando haciamos un servicio REST el controlador
//devolvia JSON, ahora lo que vamos a devolver 
//es una vista, con lo cual la anotacion que se usa
//en MVC es @Controller.
@Controller
public class ControladorUsuario {
	
	@Autowired
	private GestorUsuario gestorUsuario;
	
	//Tenemos que hacer un punto de entrada para las
	//peticione http entrantes (misma filosofia que con los servicis rest)
	//Haremos un metodo que mapee URLs de entrada a nuestra app
	//Para ello usaremos metodos anotados
	
	//Con la anotacion @RequestParam buscamos un parametros
	//que venga en el mensaje HTTP, en este caso recogemos
	//el parametro "nombre" y "pass"
	
	//El objeto Model nos va a ayudar a pasar datos del controlador
	//a la vista
	@PostMapping("/doLogin")
	public String login(@RequestParam("nombre") String username, 
				@RequestParam("pass") String password,
				Model model) {
		
		System.out.println("Entrando login");
		Usuario usuario = new Usuario();
		usuario.setUsername(username);
		usuario.setPassword(password);
		
		boolean validado = gestorUsuario.validar(usuario);
			
		//Si queremos mandar datos( lo habitual) del controlador
		//a la vista tenemos que usar un objeto que haga la funcion
		//de trasnportar la informacion. Para ello usaremos un
		//objeto de Spring que es el Model. Tenemos que decirle
		//a Spring que nos lo pase y en el poner la información
		//que queramos
		
		//El valor que devolvamos como String sera la pagina
		//web que tiene que ir a buscar en src/main/resources
		//No hay que poner el ".html"
		if(validado) {	
			//Este objeto damos un nombre de atributo y 
			//un valor del atributo. Este atributo podremos
			//acceder a el en la vista (html)
			model.addAttribute("fecha", new Date());
			List<String> lista = new ArrayList<String>();
			lista.add(username);
			lista.add(password);
			model.addAttribute("lista", lista);
			return "inicio";
		}else {
			return "errorLogin";
		}
	}
}

package mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import mvc.modelo.entidad.Coche;
import mvc.modelo.persistencia.DaoCoche;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		DaoCoche dao = context.getBean("daoUsuario", DaoCoche.class);
		
		Coche u = new Coche(0, null, null);
		u.setMatricula(2567);
		u.setModelo("SL500");
		u.setCaballos("300");
		
		dao.save(u);
	}

}

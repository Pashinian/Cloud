Proyecto MVC con Spring
-
Seria necesario el Eclipse EE o el plugin de eclipse EE

eclipse.org/downloads/packages/release/2020-12/r/eclipse-ide-enterprise-java-developers

si no el plugin https://marketplace.eclipse.org/content/eclipse-enterprise-java-developer-tools

Pasos para la creacion

1. Crear un proyecto SpringBoot (Ej 03_SpringBoot)
2. Elegir los siguientes Starters
	- Spring MVC
	- Spring JPA Data
	- H2 ( porque quiero base de datos en memoria, pero podemos elegir MySql o la que querais)
	- Thymeleaf, que sirve para hacer paginas HTML dinamicas
	
Empezamos con la implemtancion del proyecto.
-

Este proyecto va a ser un ejemplo sencillo de una validacion de usuario y password a traves de una pagina web. El usuario
nos enviara un user y un pass y tendremos que validarlo en BBDD

## Creamos el Modelo

Esta parte es de las más importantes de la app. Engloba la capa de
negocio, la capa DAO y la capa de entidades

### Creamos las entidades
Vamos a trabajar con la entidad usuario

### Creamos la capa de persistencia - DAOs
Como estamos usando JPA Data debemos de crear una interfaz

### Creamos la capa de negocio
Esta capa recibirá datos de la capa controladora y usará
la capa de persistencia para obtener la información que se
necesite para hacer la logica de negocio

### Creamos la capa de la vista
Para la vista usaremos paginas html, que podemos crear en 2 carpetas
src/main/resources/templates o src/main/resources/static

En la primera carpeta ponemos aquellas paginas que sean dinamicas, es decir, aquellas paginas web que la información a mostrar dependa de algun otro parametro, por ejemplo, la pagina web de una tienda depende de quien se conecta
	
En la segunda carpeta ponemos aquellas páginas que sean
estaticas, es decir, nunca cambiar.

Es posible que al crear una pagina web te la ponga en la ruta
src/main/webapp, se puede quedar ahi o se puede mover

En esta parte creamos las paginas login.html, inicio.html y
error.html

### Creamos la capa controladora
Esta capa sera la encargada de mapear URLs y de recibir la información del cliente. Una vez recibia usara la capa del modelo
para deicir que vista tenemos que mostrar.

### Crearmos algun usuario de pruebas
En src/main/java/com/mvc/Application creamos algun usuario de pruebas


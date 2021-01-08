# acme-architecture-spring-testing

Este proyecto representa una **Librería de Arquitectura (dependencia)** a nivel **GLOBAL** relacionada con el **testing** para desarrollar las diferentes partes de un proyecto (standalone, módulos, librerías, etc.) de una forma homogénea.

Tiene por objetivo cubrir una **Arquitectura basada en Spring de proposito general** (con persistencia de BD con JPA) a nivel de **testing**  y de **reglas arquitectónicas** con aquellos componentes y/o objetos de las capas utilizados en Spring :

* *Entidades (cuando se quiere trabajar con persistencia por ejemplo de JPA)*
* *Repositorios*
* *Servicios*
* *Controladores*
* *Configuradores*
* *Componentes*
* *...*
	
	
La librería tendrá el foco puesto en el **uso** de **ArchUnit** y no en otros frameworks o funcionalidades.
	
	
Se ha pensado su diseño siguiendo una propuesta de enfoque "típica" de lo que podría plantear un área de arquitectura de una empresa si se planteara aplicarlo sobre sus proyectos.


>IMPORTANTE 
>
>Este proyecto incluye la dependencia a la librería "acme-architecture-testing" que ya incluye a spring-boot-starter-test y el soporte a las reglas arquitectónicas para la mayoría de componentes. Ya se vieron los motivos por lo que esto era así, por lo tanto ya tendriamos soporte para probar los componentes de Spring
>
>En concreto se trabaja con la dependencia de **Spring Boot** en versión **2.3.4.RELEASE** y esta "impone" el uso de los **módulos de Spring** en version **5.2.9.RELEASE** (aunque algunas versiones podrían variar) 


Esta librería destaca por proporcionar :

* Un **Framework de Testing (Unitarios / Integración)** y su versionado
* Un **Framework de Mocking** y su versionado
* Un **Framework de Verificaciones** y su versionado
* Un **Framework de Testing de Arquitectura** y su versionado
* Un **Report de Unit Test**
* Conjunto de **Reglas de Arquitectura** con diferentes ámbitos de actuación y/o convenciones (nombre, implementaciones, etc.)
* Otras **Frameworks de ayuda/soporte** proporcionados por Spring (JSONassert, JsonPath, etc.)
* Incluye ciertas tecnologías para poder proporcionar soporte a nivel de reglas arquitectónicas


Condiciones de construcción / despliegue :

* Uso como librería en otros proyectos
* Despliegue como librería





## Stack Tecnológico

* Java 8
* [Maven 3](https://maven.apache.org/) - Gestión de Dependencias


Dependencias de arquitectura

* **acme-architecture-testing** [0.0.1-SNAPSHOT] : Librería personalizada para soporte de testing y reglas arquitectónicas de propósito general


Dependencias de terceros 

* **spring-boot-starter-web** [Boot 2.3.4.RELEASE] : Starter del Framework de Spring para dar soporte a la construcción de aplicaciones Web / RESTful mediante el uso de Spring MVC
* **spring-boot-starter-data-jpa** [Boot 2.3.4.RELEASE] : Starter del Framework de Spring para dar soporte a la persistencia con JPA


		


## Prerrequisitos

Define que elementos son necesarios para instalar el software

* Java 8 instalado (1.5+ version requerido)
* Maven instalado (3+)

* Requiere tener previamente el artefacto "acme-architecture-testing" montado





## Instalación

Pasos a seguir

* Arrancar un terminal
* Localizar el PATH de instalación (el lugar donde esta el proyecto localizado)
* Verificar que el fichero "pom.xml" esta disponible


Ejecutar el siguiente comando

```bash
mvn clean install
```

El resultado será la generación de un artefacto en el repositorio Maven Local





## Testing

Este proyecto dispone de tests -> Unit test

Las reglas arquitectónicas diseñadas han sido probadas con elementos del paquete : com.acme.architecture.testing.example

Nota : utilizar todos los comandos de maven





## Deploy

Uso como librería custom





## Versionado

**Nota :** [SemVer](http://semver.org/) es utilizado por el versionado

Para ver las versiones disponibles ver los tags del repositorio





## Autores

* **Víctor Madrid**


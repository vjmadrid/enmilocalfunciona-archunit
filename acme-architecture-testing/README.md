# acme-architecture-testing

Este proyecto representa una **Librería de Arquitectura (dependencia)** a nivel **GLOBAL** relacionada con el **testing** para desarrollar las diferentes partes de un proyecto (standalone, módulos, librerías, etc.) de una forma homogénea.

Tiene por objetivo cubrir una **Arquitectura N-capas de proposito general** a nivel de **testing** y de **reglas arquitectónicas** con aquellos componentes y/o objetos de las capas más utilizados habitualmente :

* *Entidades*
* *DTOs (incluidas variantes)*
* *Repositorios*
* *Servicios*
* *Controladores*
* *Utilidades (incluidas variantes)*
* *Factorias*
* *Mapeadores*
* *Constantes*
* *Excepciones*
* *Dummies*
* *...*
	
	
La librería tendrá el foco puesto en el **uso** de **ArchUnit** y no en otros frameworks o funcionalidades.
	
	
Se ha pensado su diseño siguiendo una propuesta de enfoque "típica" de lo que podría plantear un área de arquitectura de una empresa si se planteara aplicarlo sobre sus proyectos.


>IMPORTANTE 
>
>Normalmente una librería como esta, tendría definidas todas las dependencias individualmente con el objetivo de cubrir el ámbito de testing que se quiere cubrir.
>
>En este caso particular, se ha decidido que esta librería se utilice para aplicar testing y reglas arquitectónicas sobre una arquitectura basada en Spring. Para facilitar el grado de compatibilidad de tecnologías y versiones utilizadas se ha preferido utilizar la "propuesta" que realiza el propio starter de Spring para testing (spring-boot-starter-test). Por esto, se ha incluido **spring-boot-starter-test** como **dependencias del proyecto** teniendo en cuenta las cosas buenas y malas de incluir este tipo de librerías:
> - Muchas dependencias transitivas extras
> - Incremento del peso de los proyectos
> - Acoplamiento a determinadas tecnologías / versiones
> - Alineamiento frente a otros proyectos / librerías cuando usen Spring -> Asegurar el uso de la misma versión
> - Compatibilidad entre módulos de Spring
> - ...
>
>En concreto y como pasa siempre con Spring hay que apostar por una determinada versión a utilizar. Como el desarrollo que planteare utilizará **Spring Boot** he elegido la versión **2.3.4.RELEASE** y este "impone" el uso de los **módulos de Spring** en version **5.2.9.RELEASE** (aunque algunas versiones podrían variar) 





Esta librería destaca por proporcionar :

* Un **Frameworks de Testing (Unitarios / Integración)** y su versionado
* Un **Frameworks de Mocking** y su versionado
* Un **Frameworks de Verificaciones** y su versionado
* Un **Frameworks de Testing de Arquitectura** y su versionado
* Un **Report de Unit Test**
* Conjunto de **Reglas de Arquitectura** con diferentes ámbitos de actuación y/o convenciones (nombre, implementaciones, etc.)
* Otras **Frameworks de ayuda/soporte** proporcionados por Spring (JSONassert, JsonPath, etc.)


Condiciones de construcción / despliegue :

* Uso como librería en otros proyectos
* Despliegue como librería





## Stack Tecnológico

* Java 8
* [Maven 3](https://maven.apache.org/) - Gestión de Dependencias

Dependencias de terceros 

* **spring-boot-starter-test** [2.3.4.RELEASE] : Starter del Framework de Spring para dar soporte a Testing
  * Exclusión de JUnit4
  * Módulos de Spring en versión [5.2.9.RELEASE]
  * Incluye **junit-jupiter-engine** [5.6.2] : Framework Test Unitarios JUnit5
  * Incluye **mockito-junit-jupiter** [3.3.3] : Framework Mocking con integración con JUnit5
  * Incluye **assertj-core** [3.16.1] : Framework Matching / asserts
  * ...
* **archunit-junit5-engine** [0.14.1] : Framework Test de Arquitectura con integración con JUnit5
* **lombok** [1.18.12] : Herramienta para la generación automática de getters, setters, equals, hashCode , toString y más





## Prerrequisitos

Define que elementos son necesarios para instalar el software

* Java 8 instalado (1.5+ version requerido)
* Maven instalado (3+)





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

Nota : utilizar todos los comandos de maven





## Deploy

Uso como librería custom





## Versionado

**Nota :** [SemVer](http://semver.org/) es utilizado por el versionado

Para ver las versiones disponibles ver los tags del repositorio





## Autores

* **Víctor Madrid**


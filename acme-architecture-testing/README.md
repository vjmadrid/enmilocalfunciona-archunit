# acme-architecture-testing

Este proyecto representa una **Librería de Arquitectura (dependencia)** a nivel **GLOBAL** relacionada con el **testing** para desarrollar las diferentes partes de una forma homogénea

Esta librería destaca por :

* Definir **Frameworks de Testing** y su versionado
* Definir **Frameworks de Mocking** y su versionado
* Definir **Frameworks de Verificaciones** y su versionado
* Definir **Frameworks de Testing de Arquitectura** y su versionado
* Proporcionar **Report de Unit Test**
* Proporciona otras dependencias de ayuda proporcionadas por Spring

IMPORTANTE : En este caso particular, se ha decido utilizar la librería spring-boot-starter-test en la versión considerada en el módulo core 2.3.4.RELEASE (Spring Boot) como decisión para mantener coherencia entre las dependencias cruzadas a nivel de versiones e implementaciones 

* Se ha tenido en cuenta el hecho de que también se incorporará por transtividad todo el pack de librerías de Spring
* Se ha tnido en cuenta de que con el framework de Spring sea utilizado en otros módulos con versiones compatibles


Esta librería debería de añadir otras clases (constantes, utilidades, etc.) que puedan ayudar a sentar las bases de unas convenciones sobre el código

* En este caso sólo se ha considerado que esta librería tenga el foco en el uso de ArchUnit y no en otros frameworks o funcionalidades

Condiciones de construcción / despliegue :

* Despliegue como librería



## Stack Tecnológico

* Java 8
* [Maven 3](https://maven.apache.org/) - Gestión de Dependencias

Dependencias de terceros 

* **spring-boot-starter-test** [2.3.4.RELEASE] : Starte del Framework de Spring para dar soporte a Testing
* **junit-jupiter-engine** [5.6.2] : Framework Test Unitarios JUnit5
* **assertj-core** [3.16.1] : Framework Matching / asserts
* **mockito-junit-jupiter** [3.3.3] : Framework Mocking con integración con JUnit5
* **archunit-junit5-engine** [0.14.1] : Framework Test de Arquitectura con integración con JUnit5
* ...




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


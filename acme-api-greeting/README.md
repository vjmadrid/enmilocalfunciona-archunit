# acme-greeting-api-restful

Este proyecto representa un API REST básico con el uso de  *Hello World (Greeting)**

Se utilizará para probar la librería de arquitectura **acme-architecture-testing** y en concreto con el foco puesto en el uso de la librería **arch-unit* sobre un ejemplo "real"


Cuando se invoca al endpoint "/greeting" 

```bash
# Opción 1 : Por defecto
http://localhost:8091/greeting

# Opción 2 : Con parametro (name=Test)
http://localhost:8091/greeting?name=Test
```

Se recibe una respuesta del tipo 

```bash
{"id":<ID>,"content":"Hello, World!","responseTime":"???"}
```

Donde :

* **ID :** Nº de secuencia basado en las invocaciones al endpoint
* **NAME :** Nombre objetivo del endpoint (Con valor "World" por defecto o bien el valor del parámetro)
* **TIME :** Representación del momento de ejecución (Fecha + Tiempo)


Este proyecto destaca por proporcionar :

* **Clases de Configuration :** Clases para configurar el proyecto (escanear el paquete, ...)
* **Clases de Constantes :** Constantes utilizadas en el proyecto
* **Clases Básicas :** Controller y Entity -> Capas básicas
* **Fichero de Configuración por Propiedades** con **Entornos** (application-{environment}.yml)
* **Fichero de Configuración de Log** (logback.yml)
* **Integración con Perfiles de Spring/Maven**
* **Swagger** para documentar el API Restful
* **Standard Surefire Test Filter with Profiles** (unit & integration test)





## Stack Tecnológico

* Java 8
* [Maven 3](https://maven.apache.org/) - Gestor de dependencias
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Spring](https://spring.io)

Dependencias con proyectos de arquitectura

N/A

Dependencias de terceros 

* **spring-boot-starter-parent** [2.3.4.RELEASE] : Spring Boot + Spring Framework
* **spring-boot-starter** [X] : Spring Boot Basic core
* **spring-boot-starter-test** [X] : Spring Boot testing library
* **spring-boot-starter-web** [X] : Spring Boot web library
* **spring-boot-devtools** [X] : Spring Boot Dev tools Library
* **spring-boot-starter-actuator** [X] : Spring Boot Actuators Library

* **springfox-swagger2** [2.9.2] : Swagger
* **springfox-swagger-ui** [2.9.2] : Swagger UI





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

Genera : Fichero JAR





## Testing

Este proyecto dispone de tests -> Unit test

Execute with IDE or Maven






## Deploy

Spring Boot

* Método de Despliegue 1 : Application (Fichero de Spring Boot)
* Método de Despliegue 2 : Ejecutar Spring Boot
* Método de Despliegue 3 : Ejecutar JAR



### Método de Despliegue 1 : Application (Fichero de Spring Boot)

1. Ejecutar el fichero Application.java

* Defecto -> Disparar como clase Java 
* Configurar en el IDE "Run Configurations" -> Use "Environment" with -Dspring.profiles.active=<id_profile>


### Método de Despliegue 2 : Ejecutar Spring Boot

1. Ejecutar el siguiente comando

```bash
mvn spring-boot:run
```

Opcional : usar profile


### Método de Despliegue 3 : Ejecutar JAR

Usar perfiles de Spring con perfiles deh Maven Profiles -> Integración "Especial"

* spring.profiles.active=@spring.profiles.active@
* habilitar "resource filtering"

Se empaqueta la aplicación en un único/fat JAR file (JAR ejecutable + todas las dependencias + Contenedor de Servlet embebido en su "servidor" web)

Para ejecutar el JAR usa el siguiente comando 

En este caso se definio : "dev", "uat" y "prod"

1. Ejecutar el siguiente comando

```bash
mvn package

o

mvn package -P<id_profile>
```

Ejecutar

```bash
java -jar target/acme-greeting-api-restful-0.0.1-SNAPSHOT.jar
```

Por defecto usa un environment pero se puede cambiar (dev o <id_profile>) 





## Uso

Importante : REcordar que el puerto de ejecución se configura en el fichero  application-{id_profile}.yml


### Usar Navegador

**Petición por defecto**

El endpoint del servicio aceptará peticiones GET de HTTP como :

```bash
http://localhost:8091/greeting
```

Y devolverá un JSON

```bash
{"id":1,"content":"Hello, World!","responseTime":"???"}
```

**Petición con parametro**

El endpoint del servicio aceptará peticiones GET de HTTP como :

```bash
http://localhost:8091/greeting?name=Acme
```

Y devolverá un JSON

```bash
{"id":1,"content":"Hello, Acme!","responseTime":"???"}
```

### Usar "curl"

Usar una petición con "curl"

```bash
curl -X GET http://localhost:8091/greeting

or

curl -X GET http://localhost:8091/greeting?name=Acme
```




## Swagger

El endpoint del servicio aceptará peticiones GET de HTTP como :

```bash
http://localhost:8091/v2/api-docs
```

Y devolverá un JSON con la meta información del API


Para ejecutar la consola UI de Swagger  invocar al endpoint "swagger-ui.html"


```bash
http://localhost:8091/swagger-ui.html
```





## Versionado

**Nota :** [SemVer](http://semver.org/) es utilizado por el versionado

Para ver las versiones disponibles ver los tags del repositorio





## Autores

* **Víctor Madrid**

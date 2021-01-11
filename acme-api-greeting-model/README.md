# acme-api-greeting-model

Este proyecto representa una **Librería de servicio REST (dependencia)** relacionada con los **modelos de negocio del servicio** para ser reutilizados de una forma homogenea en diferentes servicios REST

Tiene por objetivo cubrir la comunicación con aquellos componentes y/o objetos de las capas utilizadas :

* *DTOs (Incluyendo variantes : Request, Response, QueryRequest y FullQueryRequest)*
* *...*

Esta librería destaca por proporcionar :

* **DTOS para cubrir Peticiones**
* **DTOS para cubrir Respuestas**
* **DTOS para cubrir Consultas**
* **Utilidades** para trabar con las DTOS


Condiciones de construcción / despliegue :

* Uso como librería en otros proyectos
* Despliegue como librería




## Stack Tecnológico

* Java 8
* [Maven 3](https://maven.apache.org/) - Gestión de Dependencias


Dependencias de arquitectura

* **acme-architecture-testing** [0.0.1-SNAPSHOT] : Librería personalizada para soporte de testing y reglas arquitectónicas de propósito general


Dependencias de terceros 

* **lombok** [1.18.12] : Herramienta para la generación automática de getters, setters, equals, hashCode , toString y más
* **jackson** [2.11.2] : Procesaron abstracciones (aka Streaming API) para implementaciones para JSON





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

Este poyecto incluye sobre todo tests de validación de arquitectura basados en ArchUnit

* No incluye test unitarios sobre el uso de los DTOs





## Versionado

**Nota :** [SemVer](http://semver.org/) es utilizado por el versionado

Para ver las versiones disponibles ver los tags del repositorio





## Autores

* **atSistemas**

# demo-testing-archunit

Este proyecto representa una colección de ejemplos para explicar el uso y configuración de **ArchUnit**

* Uso de diferentes importaciones de clases
* Uso de métodos y anotaciones
* Uso y configuración de ArchRule
* Uso y configuración de ArchCondition
* Verificar la arquitectura Java
* Formalizar la arquitectura-> "convenciones"
* Comprobar dependencias entre paquetes, clases, layers, etc.
* ...

Se ha definido un fichero "DETAIL" donde se describe el objetivo de cada test

* Cada test se ha diseñado para enseñar uno o varios conceptos relacionados



## Stack Tecnológico

* Java 8
* [Maven 3](https://maven.apache.org/) - Gestor de dependencias

Dependencias con proyectos de Arquitectura

* N/A

Dependencias con Terceros

* **commons-lang3** [3.11] : Utilidades para clases
* **commons-collections4** [4.4] : Utilidades para Colecciones
* **commons-io** [2.6] : Utilidades para file, streams, file comparator, file filters, ...

* **junit-jupiter-engine** [5.6.0] : Framework para Testing JUnit v5 (Add JUnit Platform + API) 

* **archunit-junit5** [3.11.1] : Framework para probar la arquitectura ArchUnit (Se integra con JUnit v5)
* **log4j-api** [2.0.1] : Framework de Logging
* ...



## Pre Requisitos

Define que elementos son necesarios para instalar la aplicación

* Java 8 instalado (1.5+ version requerida)
* Maven instaldo  (3+)





## Instalación

Pasos a seguir

* Arracar una terminal
* Ubicarse en el PATH de instalación  (el lugar donde el proyecto esta localizado)
* Verificar que el fichero "pom.xml" esta disponible

Ejecutar el siguiente comando

```bash
mvn clean install
```






## Testing


Algunos tests presentan fallos durante ejecución, han sido diseñados así para entender mejor el comportamiento del framework




## Despligue

N/A





## Uso

N/A





## Versionado

**Nota :** [SemVer](http://semver.org/) es usado para el versionado






## Autores


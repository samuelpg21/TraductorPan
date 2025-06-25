# Traductor Pan

**Traductor Pan** es una aplicación en Java que permite traducir texto entre español y un idioma ficticio llamado "Pan".  
La traducción consiste en separar las palabras en sílabas, invertir su orden y agregar la sílaba "pa" al final (para español a Pan), y hacer el proceso inverso para traducir de Pan a español.

---

## Características

- Traduce palabras y frases completas de Español a Pan.
- Traduce palabras y frases completas de Pan a Español.
- Interfaz gráfica sencilla para interactuar con el traductor.

---

## Cómo funciona

### Traducción Español -> Pan

1. Se separa la palabra en sílabas.
2. Se invierte el orden de las sílabas.
3. Se añade la sílaba `"pa"` al final de la palabra invertida.

### Traducción Pan -> Español

1. Se elimina la sílaba `"pa"` final.
2. Se separa la palabra en sílabas.
3. Se invierte el orden de las sílabas para obtener la palabra original.

---

## Instalación y ejecución

### Requisitos

- Java JDK 8 o superior
- IDE o entorno para ejecutar aplicaciones Java (Eclipse, IntelliJ, NetBeans, o línea de comandos)

### Pasos

1. Clonar o descargar el repositorio.
2. Compilar las clases `Traductor` e `interfaz` dentro del paquete `main`.
3. Ejecutar la clase `interfaz` para abrir la aplicación gráfica.

Por ejemplo, desde línea de comandos:

```bash
javac main/Traductor.java main/interfaz.java
java main.interfaz

# Traductor Pan

**Traductor Pan** es una aplicación en Java que permite traducir texto entre español y un idioma ficticio llamado "Pan".  
La traducción consiste en separar las palabras en sílabas, invertir su orden y agregar la sílaba "pa" al final (para español a Pan), y hacer el proceso inverso para traducir de Pan a español.

---

## Características

- Traduce palabras y frases completas de Español a Pan.
- Traduce palabras y frases completas de Pan a Español.
- Interfaz gráfica sencilla para interactuar con el traductor.

---

## Instalación y ejecución

### Descargar versión compilada (Windows)

Puedes descargar la versión ejecutable para Windows directamente desde los siguientes botones:

[![Descargar Traductor Pan](https://img.shields.io/badge/Descargar-EXE-blue?style=for-the-badge&logo=windows)](https://github.com/samuelpg21/TraductorPan/raw/main/TraductorPan.exe) Version ejecutable (.exe)

[![Descargar Traductor Pan JAR](https://img.shields.io/badge/Descargar-JAR-orange?style=for-the-badge&logo=java)](https://github.com/samuelpg21/TraductorPan/raw/main/TraductorPan.jar) Version compilada (.jar Necesitas java 24 para ejecutarlo)

**Instrucciones para ejecutar:**

1. Descarga el archivo `.exe` desde el botón anterior.
2. Ejecuta el archivo haciendo doble clic.
3. Se abrirá la aplicación gráfica lista para usar.
4. Si Windows muestra una advertencia de seguridad, acepta ejecutar el archivo (ya que es una aplicación local).

---

### Ejecutar desde código fuente (Java)

#### Requisitos

- Java JDK 24 o superior.
- IDE o línea de comandos para compilar y ejecutar Java.

#### Pasos

1. Descarga o clona el repositorio.
2. Inicia tu ide preferido e importa el proyecto.
3. Una vez importado puedes acceder y modificar el codigo fuente.

```bash
git clone https://github.com/tu-usuario/traductor-pan.git
cd traductor-pan
javac main/Traductor.java main/interfaz.java
java main.interfaz

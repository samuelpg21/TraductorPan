package main;

public class Traductor {

    public static void main(String[] args) {
    	
    	// Codigo prueba e innecesario en la aplicacion, unicamente estan de prueba para no emplear la interfaz
    	
        String texto = "pachapa";
        String resultado = traducirFraseEspanolPan(texto);
        System.out.println("Traducción Español a pan: " + resultado); 
        System.out.println("Traduccion Pan a Español: " + traducirPalabraPanAEspanol(texto));
    }
	
    
    /**
     *	Metodo encargado de obtener una palabra como entrada y se traduce a Pan
     *
     * La traduccion consta de la separacion de la palabra en silabas
     * se invierten y al final se le añade la silaba "pa"
     * 
     * @param Palaba de entrada a traducir
     * @return Palabra traducida al idioma pan
     **/
    public static String traducirPalabraEspanolPan(String palabra) {
        String[] silabas = separarSilabasSimplificado(palabra.toLowerCase());

        // Invertir el orden de las sílabas, sin invertir las sílabas en sí
        StringBuilder resultado = new StringBuilder();
        for (int i = silabas.length - 1; i >= 0; i--) {
            resultado.append(silabas[i]);
        }
        resultado.append("pa");
        return resultado.toString();
    }


    /**
     * Metodo que traduce cadenas o textos sin depender de traduccion palabra por palabra
     * 
     * Este metodo emplea el metodo de traduccion de palabra
     * 
     * @param Valor de entrada a traducir (string, cadena, texto...)
     * @return Devuelve la cadena traducida al pan
     * */
    public static String traducirFraseEspanolPan(String frase) {
        String[] palabras = frase.split("\\s+");
        StringBuilder traduccion = new StringBuilder();

        for (String palabra : palabras) {
            traduccion.append(traducirPalabraEspanolPan(palabra)).append(" ");
        }

        return traduccion.toString().trim();
    }

	
	/**
	 * Este metodo es el que se encarga de separar las palabras en silabas
	 * 
	 * ej... casa: ca - sa
	 * 
	 * @param Palabra a separar en silabas
	 * @return Devuelve un array de silabas (string)
	 * */
    public static String[] separarSilabasSimplificado(String palabra) {
        // Separar después de un grupo vocal-consonante-vocal, pero no si la consonante está al final
        return palabra.split("(?<=[aeiouáéíóú])(?=(ch|ll|rr|[bcdfghjklmnñpqrstvwxyz])[aeiouáéíóú])");
    }

    
 // Traducción inversa
    public static String traducirFrasePanAEspanol(String frasePan) {
        String[] palabras = frasePan.split("\\s+");
        StringBuilder resultado = new StringBuilder();

        for (String palabraPan : palabras) {
            resultado.append(traducirPalabraPanAEspanol(palabraPan)).append(" ");
        }

        return resultado.toString().trim();
    }

    public static String traducirPalabraPanAEspanol(String palabraPan) {
        if (!palabraPan.endsWith("pa")) {
            return palabraPan;
        }

        String sinPa = palabraPan.substring(0, palabraPan.length() - 2);
        String[] silabas = separarSilabasSimplificado(sinPa);
        

        StringBuilder palabraOriginal = new StringBuilder();
        for (int i = silabas.length - 1; i >= 0; i--) {
            palabraOriginal.append(silabas[i]);
        }

        return palabraOriginal.toString();
    }


}

package Poo;

import java.util.Iterator;

public class Invertir {
	public static void main(String[] args) {
		//PROBLEMA 1 PRUEBA JR INVERTIR UNA CADENA
		String palabra = "Dábale arroz a la zorra el abad";
		System.out.println("la palabra original es [" + palabra + "]");
		System.out.print("la palabra invertida es [");
		for (int i = palabra.length()-1; i > -1; i--) {
			System.out.print(palabra.charAt(i));
		}
		System.out.print("]");
		
		//PROBLEMA 2 PRUEBA JR VER CUANTAS VECES SE REPITE UNA LETRA EN UNA CADENA
		/*String cadena = "jnafjksbvksajbnsahcbsfbsjffajjcasbfjsvJdbsdvjksfbsfawl csnvsjfkjbvjksdf";
		String letra = "a";
		int contador = 0;
		
		
		for(int i = cadena.length()-1; i > -1; i--) {
			
			if(letra.equalsIgnoreCase(String.valueOf(cadena.charAt(i)))) {
				contador++;
			}
		}
			System.out.println("la letra " + letra + " se repite " + contador + " veces en la palabra " + cadena);
	*/	
	
	//PROBLEMA 3 DISTANCIA DE HAMMI
		
		/*String palabra1 = "barquisimeto";
		String palabra2 = "barfuwsimsto";
		int contadorDiferente = 0;
		if(palabra1.length() != palabra2.length()) {
			System.out.println("error las palabras son de diferente longitud");
		}else {
		
		for (int i = 0; i < palabra1.length(); i++) {
			
			if(palabra1.charAt(i) != palabra2.charAt(i)) {
				contadorDiferente++;
			}
			
		  }
		}
		
		System.out.println("la cantidad de palabras diferente es de " + contadorDiferente);
	*/
		/*String text = "buenas como estas el dia de hoy";
		String space [] = text.split(" ");//este metodo convierte la cadena de caracteres en un array haciendo que se separen de una forma
		text = text.trim(); //este metodo hace que la variable text no cuente los espacios en blanco en ambas esquinas como palabras
		System.out.println("la cantidad de palabras es de " + space.length);
		System.out.println(space[3]);
	*/
	}
	
}


public class ManipulacionCadenas2 {

	public static void main(String[] args) {
//metodo sub string
		String palabra = "hoy es un buen dia para programar en java" ;
		/*Sirve para cortar una cadena de Texto en la canditad de pixeles seleccionada hasta la otra cantidad de pixeles 
		 */
		String FraseResumen = palabra.substring(23, 41) + " tambien ir a la hamburgueseria";
		//en java podemos concatenar el dato de una cadena con el contenido de un String
		System.out.print(FraseResumen);
	}

}

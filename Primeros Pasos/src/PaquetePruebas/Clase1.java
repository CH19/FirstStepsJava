package PaquetePruebas;
//el objetivo de esta clase es ver como se importa otra clase
import Poo.coche;//se importa colocando el nombre del paquete + el nombre de los metodos
public class Clase1 {
	public static void main(String[] args) {
		
		coche lamborgini = new coche();
		
	 System.out.println(lamborgini.MostrarDatoGenerales());
	}
	
}

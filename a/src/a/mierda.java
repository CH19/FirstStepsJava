package a;

import java.util.Scanner;
public class mierda {

	public static void main(String[] args) {
		Scanner respuesta = new Scanner(System.in);
		print("Indica donde quieres comprarlo, si en VNZLA, MXC, o COP");
		String resquest = respuesta.nextLine();
		print("indica la cantidad de dolares a comprar");
		
		double cantidad = respuesta.nextDouble();
		boolean ExistenciaCantidad = (cantidad > 0)? true: false;
		System.out.println("el precio de " + cantidad + "$ es: " + CalcularMonedas(cantidad, resquest) + "la existencia de los $ es: " + ExistenciaCantidad);
	}
	/**
	 * 
	 * @param message mensaje a enviar
	 * @return message
	 */
	public static String print(String message) {
		System.out.println(message);
		return message;
	}
	/**
	 * Descripccion: Funcion que convierte una moneda establecida a dolares Estados unidenses
	 * @param Dolar Camntidad de dolares
		@param currency lugar donde quieres hacer el cambio de dolares
	
	*/
	public static double CalcularMonedas(double Dolar, String currency) {
		
	switch(currency) {
	case "VZLA":
		Dolar = Dolar * 9.51;
		break;
	case "MXN":
		Dolar = Dolar * 21;
		break;
	case "COP":
		Dolar = Dolar * 4988.83 ;
		break;
	}
	return Dolar;
	}
}

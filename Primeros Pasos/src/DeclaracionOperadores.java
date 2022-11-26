
public class DeclaracionOperadores {

	public static void main(String[] args) {
		double a = 5 ;
		float b;
		b = 13;
		double c= b / a;
		System.out.println("el valor a de la suma es " + a ) ;
		System.out.println("el valor b de la suma es " + b);
		System.out.println("El valor de la suma es: " + c);
		//c++; sirve de mucho comentar instruccione que el programador no quiere que en el programa final no se apliquen
		/*si aqui aplicaramos una division entre las dos variables daria un decimal, sin embargo
		 * en la consola se mostraria simplemente el 1, esto porque las variables estan declaradas
		 * en tipo de dato, entero 
		 */
		final double pulgadas = 2.54;
		double cm = 6 ;
		double resultado = cm/ pulgadas ;
		System.out.println("en " + cm + "centimetros hay " + resultado + "pulgadas") ;
	}
	

}

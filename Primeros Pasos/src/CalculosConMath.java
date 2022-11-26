
public class CalculosConMath {
	public static void main(String args[]) {
		//este pequeño algoritmo es una demostracion y prueba de la clase Math}
		//el metodo SQRT sirve para hacer la raiz cuadrada de un numero
		double raiz = Math.sqrt(9);
		System.out.println(raiz);
		System.out.println("------");
		
		double num1 = 5.85;
		short resultado = (byte)Math.round(num1);
		
		System.out.println("el numero es " + resultado) ;
		System.out.println("-------") ;
		
		double base = 5;
		double exponente = 3;
		int resultado2 = (int)Math.pow(base, exponente);
		
		System.out.print(resultado2);

	}
}
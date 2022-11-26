import java.util.Random; //Esto tampoco funciono para generar ningun tipo de numero random
import javax.swing.*;
public class Bucles2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Random numRandom = new Random(); //esto no funciono para generar un numero random para nada xd
		
		double a = Math.nextDown(13.0);
		double x2 = 3;
		double x = x2*(50 - a) + x2*a;
		System.out.println("a = " + a);
		System.out.println("x = " + x);
		*/
		double rand = (int)(Math.random() * 100);
		
		int numero = 0;
		int intentos = 0 ;
		
		while(numero != rand) {
		
			System.out.println("Introduce un numero");
			int opcciones = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
			
			if(opcciones < 100) {	
				if(opcciones < rand) {
				System.out.println("El numero aleatorio es  [" + "]MAYOR que el numero del usuario ["  + opcciones + "]");
			
				}else if(opcciones > rand) {
				System.out.println("El numero aleatorio es  [" + "]MENORR que el numero del usuario ["  + opcciones + "]");
			
			
				}else if(opcciones == rand) {
				System.out.println("El numero aleatorio es  [" +"]IGUAL que el numero del usuario ["  + opcciones + "]");
			
				}else {
				System.out.print("Hubo un error");
				}
			}else {
				System.out.print("ERROR \n El numero es MAYOR a 100 por lo tanto no es posible ejecutar el programa");
			}
			intentos = intentos + 1 ;
			numero = opcciones;
		}
		
		System.out.println("El numero de intentos para salir del ciclo fue de " + intentos);
	}

}

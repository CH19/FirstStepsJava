import java.util.Scanner;
import javax.swing.JOptionPane;
public class Condicionales2 {
	public static void main(String args[]){
		
	   Scanner entrada = new Scanner(System.in);
	   
	   System.out.println("Elige una opccion \n1: cuadrado \n2: rectangulo \n3: triangulo \n4: circulo");
	   
	   int figura = entrada.nextInt();
	   
	   switch (figura) {
	   case 1:
		   int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado del cuadrado"));
		   System.out.println("el area del cuadrado es" + Math.pow(lado, 2));
		   
		   break;
	   case 2: 
		   int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
		   int altura =  Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
		   System.out.println("El area del rectangulo es " + base*altura + "cm");
		   
		   break;
	   case 3:
		   int baseTriang = Integer.parseInt(JOptionPane.showInputDialog("Indroduce la base del triangulo"));
		   int alturaTriang = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del triangulo"));
		   System.out.println("El area del tirangulo es de " + (baseTriang*alturaTriang)/2 + "cm");
		   
		   break;
	   case 4: 
		   int radioCirc = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio de la esfera"));
		   
		   System.out.print("El radio del circulo es ");
		   System.out.printf("%1.2f", Math.PI*(Math.pow(radioCirc, 2)));
		   /*Tarde como 15 minutos como un idiota pensando porque el programa no funcionaba en el caaso 4
		    * resulta que cuando pones "printf"y colocas el valor String al momento de colocar la condicion de cuantos decimales se van a ver
		    * debes de poner la F en minuscula porque si no el idita de eclipse te marca error xdddddddddddd
		    */
		   System.out.print("cm");
		   
		   break;
		default: 
			System.out.println("ERROR \nNumero invalido");
			break;
	   }
	}
}
	

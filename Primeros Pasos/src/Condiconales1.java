import java.util.*;
public class Condiconales1 {

	public static void main (String[] args) {
		try (// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in)) {
			System.out.println("Introduce tu edad por favor");
			 int Edad = entrada.nextInt();
			 
			 
			 if (Edad >= 18 && Edad <25) {
				 System.out.println("eres adulto joven");
			 }else if(Edad >= 25 && Edad < 60) {
				 System.out.println("Eres adulto");
				 
			 }else if(Edad >= 60 && Edad < 89) {
				 System.out.println("Eres un anciano");
			 }else if (Edad >= 90 && Edad < 1000) {
				 System.out.println("Estad en la recta final");
			 }else {
				 System.out.println("Eres un chiquillo");
			 }
			 
			 
			 System.out.println("Tu edad es " + Edad);
		}
		 
	
	
	}

}
